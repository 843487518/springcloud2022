package com.zhouxk.springcloud.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhouxk.springcloud.entity.Authorities;
import com.zhouxk.springcloud.entity.RelRoleAuthority;
import com.zhouxk.springcloud.entity.RelUserRole;
import com.zhouxk.springcloud.entity.Users;
import com.zhouxk.springcloud.mapper.AuthorityMapper;
import com.zhouxk.springcloud.mapper.RelRoleAuthorityMapper;
import com.zhouxk.springcloud.mapper.RelUserRoleMapper;
import com.zhouxk.springcloud.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.service
 * @NAME: MyUserDetailsService
 * @USER: zhouxk
 * @DATE: 2023/6/4
 * @TIME: 15:41
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Slf4j
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RelUserRoleMapper relUserRoleMapper;
    @Autowired
    private RelRoleAuthorityMapper relRoleAuthorityMapper;
    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        //查询users表
        Users user = userMapper.selectOne(new QueryWrapper<Users>().eq("user_name", s));
        if (null == user){
            throw new UsernameNotFoundException("用户不存在！");
        }
        //查询用户角色关联表
        List<RelUserRole> relUserRoles = relUserRoleMapper.selectList(new QueryWrapper<RelUserRole>().eq("user_id", user.getId()));
        List<Integer> roleIds = relUserRoles.stream().map(RelUserRole::getRoleId).collect(Collectors.toList());
        List<RelRoleAuthority> relRoleAuthorities = relRoleAuthorityMapper.selectList(new QueryWrapper<RelRoleAuthority>().in("role_id", roleIds));
        List<Integer> authorityIds = relRoleAuthorities.stream().map(RelRoleAuthority::getAuthorityId).collect(Collectors.toList());
        List<Authorities> authorities = authorityMapper.selectList(new QueryWrapper<Authorities>().in("id", authorityIds));
        ArrayList<GrantedAuthority> grantedAuthorities = authorities.stream().map(
                auth -> {
                    GrantedAuthority grantedAuthority = new GrantedAuthority() {
                        @Override
                        public String getAuthority() {
                            return auth.getAuthority();
                        }
                    };
                    return grantedAuthority;
                }
        ).collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(obj -> obj.getAuthority()))), ArrayList::new));
        log.info("查询到当前用户："+user.toString()+"权限为："+grantedAuthorities);
        grantedAuthorities.forEach(e->log.info(user.toString()+"接口权限遍历结果："+e.getAuthority().toString()));
        return new User(user.getUserName(),user.getPassword(),grantedAuthorities);
    }
}

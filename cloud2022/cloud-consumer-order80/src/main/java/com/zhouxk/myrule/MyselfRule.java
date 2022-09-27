package com.zhouxk.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.myrule
 * @Author: zhouxk
 * @CreateTime: 2022-09-27  07:49
 * @Description: Ribbon的负载均衡策略配置
 * @Version: 1.0
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        //随机
        return new RandomRule();
        //轮询
        //return new RoundRobinRule();

    }
}

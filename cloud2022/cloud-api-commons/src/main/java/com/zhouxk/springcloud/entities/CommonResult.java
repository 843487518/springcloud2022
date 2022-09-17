package com.zhouxk.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud.entities
 * @Author: zhouxk
 * @CreateTime: 2022-09-16  22:16
 * @Description: 返回结果实体类
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult success(T data){
        CommonResult commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setMessage("success");
        commonResult.setData(data);
        return commonResult;

    }
}

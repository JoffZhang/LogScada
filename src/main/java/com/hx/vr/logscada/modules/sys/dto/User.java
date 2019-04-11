package com.hx.vr.logscada.modules.sys.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@ApiModel(value = "user对象",description = "用户对象user")
@Data
public class User {

    @ApiModelProperty(value = "用户名",example = "admin",required = true)
    @NotBlank(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "密码",example = "123456",required = true)
    @NotBlank(message = "密码不能为空")
    @Size(min = 6,max = 20,message = "密码最少{min}位，最长{max}位")
    private String password;

}

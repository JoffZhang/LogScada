package com.hx.vr.logscada.modules.sys.rest;

import com.hx.vr.logscada.modules.sys.model.SysUser;
import com.hx.vr.logscada.modules.sys.service.SysUserService;
import com.hx.vr.logscada.modules.sys.dto.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Api(value = "登录API",tags = {"登录接口"})
@RequestMapping("loginApi")
@RestController
public class LoginApi {

    @Autowired
    private SysUserService userService;

    @ApiOperation(value = "用户登录",notes = "根据用户名密码登录")
    @PostMapping(path = "login",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SysUser> login(@RequestBody @Validated User user){
        SysUser sysUser = userService.selectByUNamePwd(user);
        return ResponseEntity.of(Optional.ofNullable(sysUser));
    }
}

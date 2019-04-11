package com.hx.vr.logscada.modules.sys.service;

import com.hx.vr.logscada.modules.sys.model.SysUser;
import com.hx.vr.logscada.modules.sys.dto.User;


public interface SysUserService {


    SysUser selectByUNamePwd(User user);
}

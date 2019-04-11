package com.hx.vr.logscada.modules.sys.service.impl;

import com.hx.vr.logscada.common.utils.MD5Utils;
import com.hx.vr.logscada.modules.sys.dao.SysUserMapper;
import com.hx.vr.logscada.modules.sys.model.SysUser;
import com.hx.vr.logscada.modules.sys.model.SysUserCriteria;
import com.hx.vr.logscada.modules.sys.service.SysUserService;
import com.hx.vr.logscada.modules.sys.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper userDao;

    @Override
    public SysUser selectByUNamePwd(User user) {
        SysUserCriteria criteria = new SysUserCriteria();
        SysUserCriteria.Criteria cri = criteria.createCriteria();
        cri.andUsernameEqualTo(user.getUsername());
        cri.andPasswordEqualTo(MD5Utils.MD5(user.getPassword()));
        List<SysUser> sysUsers = userDao.selectByCriteria(criteria);
        return sysUsers.isEmpty()?null:sysUsers.get(0);
    }
}

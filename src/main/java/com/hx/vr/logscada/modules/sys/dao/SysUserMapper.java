package com.hx.vr.logscada.modules.sys.dao;

import com.hx.vr.logscada.modules.sys.model.SysUser;
import com.hx.vr.logscada.modules.sys.model.SysUserCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {
    long countByCriteria(SysUserCriteria criteria);

    int deleteByCriteria(SysUserCriteria criteria);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByCriteria(SysUserCriteria criteria);

    int updateByCriteriaSelective(@Param("record") SysUser record, @Param("criteria") SysUserCriteria criteria);

    int updateByCriteria(@Param("record") SysUser record, @Param("criteria") SysUserCriteria criteria);
}
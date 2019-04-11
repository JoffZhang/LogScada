package com.hx.vr.logscada.modules.sys.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.util.Date;


@Data
public class SysUser {
    @JSONField(serialize = false)
    private Integer id;

    private String name;
    private String username;

    @JSONField(serialize = false)
    private String password;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

}
package com.hx.vr.logscada.modules.log.enums;


public enum LogSysType {

    REFACTOR(10,"重构版"),
    NEWTV(20,"儿童电视版"),
    ;
    private Integer code;
    private String description;

    LogSysType(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}

package com.hx.vr.logscada.modules.log.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Data
@ApiModel(value = "日志对象",description = "盒子上报日志对象")
public class BoxOperationLog {
    @ApiModelProperty(hidden = true)
    private Integer id;
    @NotNull(message = "类型不能为空")
    private Byte sysType;
    @NotNull(message = "状态码不能为空")
    private Short stateCode;
    @NotNull(message = "子类型不能为空")
    private Byte subCode;
    @NotNull(message = "BoxId不能为空")
    private Integer boxId;
    @NotBlank(message = "MAC地址不能为空")
    private String macAddr;
    @NotBlank(message = "设备型号不能为空")
    private String deviceModel;
    @NotBlank(message = "渠道ID不能为空")
    private String channelId;
    @NotBlank(message = "版本号不能为空")
    private String appVersion;

    private String label1;

    private String label2;

    private String label3;

    private String label4;

    private String label5;

    private String label6;

    private String jsonMsg;

    private String message;
    @NotNull(message = "操作时间不能为空")
    private Date operateTime;

}
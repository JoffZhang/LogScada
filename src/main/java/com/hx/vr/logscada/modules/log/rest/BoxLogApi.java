package com.hx.vr.logscada.modules.log.rest;

import com.hx.vr.logscada.common.utils.JSONUtils;
import com.hx.vr.logscada.modules.log.model.BoxOperationLog;
import com.hx.vr.logscada.modules.log.service.BoxOperationLogService;
import com.hx.vr.logscada.modules.log.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "盒子上报日志",tags = {"盒子上报日志"})
@RestController
@RequestMapping("boxLog")
public class BoxLogApi {


    @Autowired
    private MessageService messageService;
    @ApiOperation(value = "记录上报日志",notes = "记录上报日志")
    @PostMapping(path = "logging",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity logging(@Validated @RequestBody BoxOperationLog operationLog){
        String operLogStr = JSONUtils.getJson(operationLog);
        messageService.sendAsycMsg(operLogStr);
        return ResponseEntity.ok("");
    }

}

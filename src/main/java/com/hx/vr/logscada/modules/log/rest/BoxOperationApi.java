package com.hx.vr.logscada.modules.log.rest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hx.vr.logscada.modules.log.model.BoxOperationLog;
import com.hx.vr.logscada.modules.log.service.BoxOperationLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "盒子操作日志",tags = {"盒子操作日志"})
@RestController
@RequestMapping("boxOperationApi")
public class BoxOperationApi {

    @Autowired
    private BoxOperationLogService operationService;

    @ApiOperation(value = "观看历史",notes = "根据MAC查看观看历史")
    @GetMapping(path = "watchHistory/{macAddr}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PageInfo<BoxOperationLog>> getWatchHistory(
            @PathVariable(value = "macAddr")String macAddr,
            @RequestParam(value = "versionType")String versionType,
            @RequestParam(value = "pageNum",defaultValue = "1")int pageNum,
            @RequestParam(value = "pageSize",defaultValue = "50")int pageSize
    ){
        PageHelper.startPage(pageNum,pageSize);
        List<BoxOperationLog> logList = operationService.selectWatchHistoryByMac(macAddr,versionType);
        return ResponseEntity.ok(new PageInfo<>(logList));
    }

    @ApiOperation(value = "用户行为",notes = "根据MAC查看用户行为")
    @GetMapping(path = "userBehavior/{macAddr}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PageInfo<BoxOperationLog>> getUserBehavior(
            @PathVariable(value = "macAddr")String macAddr,
            @RequestParam(value = "versionType")String versionType,
            @RequestParam(value = "pageNum",defaultValue = "1")int pageNum,
            @RequestParam(value = "pageSize",defaultValue = "50")int pageSize
    ){
        PageHelper.startPage(pageNum,pageSize);
        List<BoxOperationLog> logList = operationService.selectUserBehaviorByMac(macAddr,versionType);
        return ResponseEntity.ok(new PageInfo<>(logList));
    }

    @ApiOperation(value = "登录记录",notes = "根据MAC查看登录记录")
    @GetMapping(path = "loginRecord/{macAddr}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity getLoginRecord(
            @PathVariable(value = "macAddr")String macAddr,
            @RequestParam(value = "versionType")String versionType,
            @RequestParam(value = "pageNum",defaultValue = "1")int pageNum,
            @RequestParam(value = "pageSize",defaultValue = "50")int pageSize
    ){
        List<BoxOperationLog> registerRecordInfo = operationService.selectRegisterRecordByMac(macAddr);
        PageHelper.startPage(pageNum,pageSize);
        List<BoxOperationLog> logList = operationService.selectLoginRecordByMac(macAddr);
        Map<String,Object> result = new HashMap<>(2,2);
        result.put("registerRecord",registerRecordInfo);
        result.put("loginRecord",new PageInfo<>(logList));
        return ResponseEntity.ok(result);
    }
}

package com.hx.vr.logscada.modules.log.service;

import com.hx.vr.logscada.modules.log.model.BoxOperationLog;

import java.util.List;

public interface BoxOperationLogService {


    List<BoxOperationLog> selectWatchHistoryByMac(String macAddr, String versionType);

    List<BoxOperationLog> selectUserBehaviorByMac(String macAddr, String versionType);

    List<BoxOperationLog> selectLoginRecordByMac(String macAddr);

    List<BoxOperationLog> selectRegisterRecordByMac(String macAddr);
}

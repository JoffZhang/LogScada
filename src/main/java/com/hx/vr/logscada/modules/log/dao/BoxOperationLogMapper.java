package com.hx.vr.logscada.modules.log.dao;

import com.hx.vr.logscada.modules.log.model.BoxOperationLog;
import com.hx.vr.logscada.modules.log.model.BoxOperationLogCriteria;

import java.util.List;

public interface BoxOperationLogMapper {
    long countByCriteria(BoxOperationLogCriteria criteria);

    int insert(BoxOperationLog record);

    int insertSelective(BoxOperationLog record);

    List<BoxOperationLog> selectByCriteria(BoxOperationLogCriteria criteria);

    List<BoxOperationLog> selectLoginRecordByMac(String macAddr);

    List<BoxOperationLog> selectRegisterRecordByMac(String macAddr);
}
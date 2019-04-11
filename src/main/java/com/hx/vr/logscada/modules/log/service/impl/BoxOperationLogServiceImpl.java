package com.hx.vr.logscada.modules.log.service.impl;


import com.hx.vr.logscada.common.enums.DataSourceName;
import com.hx.vr.logscada.config.datasource.TargetDataSource;
import com.hx.vr.logscada.modules.log.dao.BoxOperationLogMapper;
import com.hx.vr.logscada.modules.log.enums.LogSysType;
import com.hx.vr.logscada.modules.log.model.BoxOperationLog;
import com.hx.vr.logscada.modules.log.model.BoxOperationLogCriteria;
import com.hx.vr.logscada.modules.log.service.BoxOperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BoxOperationLogServiceImpl implements BoxOperationLogService {

    @Autowired
    private BoxOperationLogMapper operationLogDao;


    @Override
    public List<BoxOperationLog> selectWatchHistoryByMac(String macAddr, String versionType) {
        BoxOperationLogCriteria boxOperationLogCriteria = new BoxOperationLogCriteria();
        BoxOperationLogCriteria.Criteria criteria = boxOperationLogCriteria.createCriteria();
        criteria.andMacAddrEqualTo(macAddr);
        criteria.andSysTypeEqualTo(getSysTypeCode(versionType));
        criteria.andStateCodeIn(getWatchStateCode(versionType));
        boxOperationLogCriteria.setOrderByClause(" operate_time desc ");
        return operationLogDao.selectByCriteria(boxOperationLogCriteria);
    }

    @Override
    public List<BoxOperationLog> selectUserBehaviorByMac(String macAddr, String versionType) {
        BoxOperationLogCriteria boxOperationLogCriteria = new BoxOperationLogCriteria();
        BoxOperationLogCriteria.Criteria criteria = boxOperationLogCriteria.createCriteria();
        criteria.andMacAddrEqualTo(macAddr);
        criteria.andSysTypeEqualTo(getSysTypeCode(versionType));
        criteria.andStateCodeIn(getBehaviorStateCode(versionType));
        boxOperationLogCriteria.setOrderByClause(" operate_time desc ");
        return operationLogDao.selectByCriteria(boxOperationLogCriteria);
    }
    @TargetDataSource(sourceName = DataSourceName.THINKADMIN)
    @Override
    public List<BoxOperationLog> selectLoginRecordByMac(String macAddr) {
        return operationLogDao.selectLoginRecordByMac(macAddr);
    }
    @TargetDataSource(sourceName = DataSourceName.THINKADMIN)
    @Override
    public List<BoxOperationLog> selectRegisterRecordByMac(String macAddr) {
        return operationLogDao.selectRegisterRecordByMac(macAddr);
    }
   /* @Override
    public String getTest4() {
        //解决在同一类调用其他方法数据源切换失败
        return((BoxOperationLogService) AopContext.currentProxy()).method1()+((BoxOperationLogService) AopContext.currentProxy()).method2();
    }*/

    private Byte getSysTypeCode(String versionType) {
        if(LogSysType.NEWTV.toString().equals(versionType)){
            return LogSysType.NEWTV.getCode().byteValue();
        }else{
            return LogSysType.REFACTOR.getCode().byteValue();
        }
    }

    private List<Short> getWatchStateCode(String versionType) {
        if(LogSysType.NEWTV.toString().equals(versionType)){
            return Arrays.asList(NEWTV_WATCH_CODES);
        }else{
            return Arrays.asList(REFACTOR_WATCH_CODES);
        }
    }

    private List<Short> getBehaviorStateCode(String versionType) {
        if(LogSysType.NEWTV.toString().equals(versionType)){
            return Arrays.asList(NEWTV_BEHAVIOR_CODES);
        }else{
            return Arrays.asList(REFACTOR_BEHAVIOR_CODES);
        }
    }
    private static Short[] NEWTV_WATCH_CODES = new Short[]{301,305,2204};
    private static Short[] NEWTV_BEHAVIOR_CODES = new Short[]{401,2500,2400,302,304,1010,1012,1013,1014};
    private static Short[] REFACTOR_WATCH_CODES  = new Short[]{};
    private static Short[] REFACTOR_BEHAVIOR_CODES = new Short[]{};

}

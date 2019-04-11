package com.hx.vr.logscada.modules.log.service.impl;

import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import com.hx.vr.logscada.common.utils.JSONUtils;
import com.hx.vr.logscada.modules.log.dao.BoxOperationLogMapper;
import com.hx.vr.logscada.modules.log.model.BoxOperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class LogMessageListener implements MessageListener {

    @Autowired
    private BoxOperationLogMapper operationLogDao;

    @Override
    public Action consume(Message message, ConsumeContext context) {
        log.info("=======================Receive: " + message);
        try{
            String logInfo = new String(message.getBody(),"UTF-8");
            BoxOperationLog boxOperationLog = JSONUtils.jsonToObj(logInfo, BoxOperationLog.class);
            int flag = operationLogDao.insert(boxOperationLog);
            if(flag > 0){
                return Action.CommitMessage;
            }
        }catch (Exception e){
            log.error("消费失败，异常为{},message为：{}",e,message);
        }
        return Action.ReconsumeLater;
    }

}

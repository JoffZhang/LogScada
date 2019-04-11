package com.hx.vr.logscada.modules.log.service;

import com.hx.vr.logscada.modules.log.model.BoxOperationLog;

public interface MessageService {

    void sendAsycMsg(String body);
}

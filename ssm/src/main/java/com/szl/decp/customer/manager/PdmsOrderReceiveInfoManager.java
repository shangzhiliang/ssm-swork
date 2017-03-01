package com.szl.decp.customer.manager;

import java.util.List;

import com.szl.decp.customer.model.PdmsOrderReceiveInfo;

public interface PdmsOrderReceiveInfoManager {

	List<PdmsOrderReceiveInfo> queryListBeans(PdmsOrderReceiveInfo p);
}

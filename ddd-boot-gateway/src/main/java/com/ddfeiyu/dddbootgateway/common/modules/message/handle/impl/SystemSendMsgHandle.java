package com.ddfeiyu.dddbootgateway.common.modules.message.handle.impl;

import com.ddfeiyu.dddbootgateway.common.api.dto.message.MessageDTO;
import com.ddfeiyu.dddbootgateway.common.exception.DDDBootException;
import com.ddfeiyu.dddbootgateway.common.modules.message.handle.ISendMsgHandle;
import com.ddfeiyu.dddbootgateway.common.system.api.ISysBaseAPI;
import com.ddfeiyu.dddbootgateway.common.util.SpringContextUtils;
import com.ddfeiyu.dddbootgateway.common.util.ConvertUtils;

/**
* @Description: 发送系统消息
*/
public class SystemSendMsgHandle implements ISendMsgHandle {

    public static final String FROM_USER="system";

    @Override
    public void SendMsg(String es_receiver, String es_title, String es_content) {
        if(ConvertUtils.isEmpty(es_receiver)){
            throw  new DDDBootException("被发送人不能为空");
        }
        ISysBaseAPI sysBaseAPI = SpringContextUtils.getBean(ISysBaseAPI.class);
        MessageDTO messageDTO = new MessageDTO(FROM_USER,es_receiver,es_title,es_content);
        sysBaseAPI.sendSysAnnouncement(messageDTO);
    }
}
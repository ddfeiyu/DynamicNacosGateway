package com.ddfeiyu.dddbootgateway.common.modules.message.handle;

/**
 * @Description: 发送信息接口
 */
public interface ISendMsgHandle {

    /**
     * 发送信息
     * @param es_receiver 发送人
     * @param es_title 标题
     * @param es_content 内容
     */
	void SendMsg(String es_receiver, String es_title, String es_content);
}

package com.ddfeiyu.dddbootgateway.common.modules.redis.listener;


import com.ddfeiyu.dddbootgateway.common.base.BaseMap;


/**
 * 自定义消息监听
 */
public interface RedisListener {
    /**
     * 接受消息
     *
     * @param message
     */
    void onMessage(BaseMap message);

}

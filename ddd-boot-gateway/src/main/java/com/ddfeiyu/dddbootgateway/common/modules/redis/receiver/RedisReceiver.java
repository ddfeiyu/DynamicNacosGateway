package com.ddfeiyu.dddbootgateway.common.modules.redis.receiver;


import cn.hutool.core.util.ObjectUtil;
import com.ddfeiyu.dddbootgateway.common.base.BaseMap;
import com.ddfeiyu.dddbootgateway.common.constant.GlobalConstants;
import com.ddfeiyu.dddbootgateway.common.modules.redis.listener.RedisListener;
import com.ddfeiyu.dddbootgateway.common.util.SpringContextHolder;
import lombok.Data;
import org.springframework.stereotype.Component;


/**
 * 自定义消息接收器
 */
@Component
@Data
public class RedisReceiver {


    /**
     * 接受消息并调用业务逻辑处理器
     *
     * @param params
     */
    public void onMessage(BaseMap params) {
        Object handlerName = params.get(GlobalConstants.HANDLER_NAME);
        RedisListener messageListener = SpringContextHolder.getHandler(handlerName.toString(), RedisListener.class);
        if (ObjectUtil.isNotEmpty(messageListener)) {
            messageListener.onMessage(params);
        }
    }

}

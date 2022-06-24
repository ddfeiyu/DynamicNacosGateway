package com.ddfeiyu.dddbootgateway.handler;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import com.ddfeiyu.dddbootgateway.common.base.BaseMap;
import com.ddfeiyu.dddbootgateway.common.constant.GlobalConstants;
import com.ddfeiyu.dddbootgateway.common.modules.redis.listener.RedisListener;
import com.ddfeiyu.dddbootgateway.loader.DynamicRouteLoader;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 路由刷新监听（实现方式：redis监听handler）
 */
@Slf4j
@Component(GlobalConstants.LODER_ROUDER_HANDLER)
public class LoderRouderHandler implements RedisListener {

    @Resource
    private DynamicRouteLoader dynamicRouteLoader;


    @Override
    public void onMessage(BaseMap message) {
        log.info("路由刷新监听（实现方式：redis监听handler）,message: {}", JSON.toJSONString(message));
        dynamicRouteLoader.refresh(message);
    }

}
package com.ddfeiyu.dddbootgateway.common.modules.message.service;

import java.util.List;

import com.ddfeiyu.dddbootgateway.common.system.base.service.JeecgService;
import com.ddfeiyu.dddbootgateway.common.modules.message.entity.SysMessageTemplate;

/**
 * @Description: 消息模板
 * @Version: V1.0
 */
public interface ISysMessageTemplateService extends JeecgService<SysMessageTemplate> {

    /**
     * 通过模板CODE查询消息模板
     * @param code 模板CODE
     * @return
     */
    List<SysMessageTemplate> selectByCode(String code);
}

package com.ddfeiyu.dddbootgateway.common.modules.message.service.impl;

import com.ddfeiyu.dddbootgateway.common.system.base.service.impl.JeecgServiceImpl;
import com.ddfeiyu.dddbootgateway.common.modules.message.entity.SysMessageTemplate;
import com.ddfeiyu.dddbootgateway.common.modules.message.mapper.SysMessageTemplateMapper;
import com.ddfeiyu.dddbootgateway.common.modules.message.service.ISysMessageTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Description: 消息模板
 */
@Service
public class SysMessageTemplateServiceImpl extends JeecgServiceImpl<SysMessageTemplateMapper, SysMessageTemplate> implements ISysMessageTemplateService {

    @Autowired
    private SysMessageTemplateMapper sysMessageTemplateMapper;


    @Override
    public List<SysMessageTemplate> selectByCode(String code) {
        return sysMessageTemplateMapper.selectByCode(code);
    }
}

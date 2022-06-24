package com.ddfeiyu.dddbootgateway.common.modules.message.service.impl;

import com.ddfeiyu.dddbootgateway.common.system.base.service.impl.JeecgServiceImpl;
import com.ddfeiyu.dddbootgateway.common.modules.message.entity.SysMessage;
import com.ddfeiyu.dddbootgateway.common.modules.message.mapper.SysMessageMapper;
import com.ddfeiyu.dddbootgateway.common.modules.message.service.ISysMessageService;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息
 */
@Service
public class SysMessageServiceImpl extends JeecgServiceImpl<SysMessageMapper, SysMessage> implements ISysMessageService {

}

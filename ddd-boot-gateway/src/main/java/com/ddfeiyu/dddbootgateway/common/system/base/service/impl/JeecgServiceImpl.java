package com.ddfeiyu.dddbootgateway.common.system.base.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddfeiyu.dddbootgateway.common.system.base.entity.JeecgEntity;
import com.ddfeiyu.dddbootgateway.common.system.base.service.JeecgService;
import lombok.extern.slf4j.Slf4j;

/**
 * ServiceImpl基类
 * @param <M>
 * @param <T>
 */
@Slf4j
public class JeecgServiceImpl<M extends BaseMapper<T>, T extends JeecgEntity> extends ServiceImpl<M, T> implements JeecgService<T> {

}

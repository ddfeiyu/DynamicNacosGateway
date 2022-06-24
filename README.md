# DynamicNacosGateway
Dynamic Gateway Route base on nacos 基于nacos动态刷新gateway网关路由

## ddd-boot-nacos-local ：本地开发用nacos
```
1、执行sql: db/tables_nacos.sql
2、启动nacos: com.ddfeiyu.dddbootnacoslocal.DddBootNacosLocalApplication

```

### ddd-boot-demo ： 管理gateway

### ddd-boot-gateway ： gateway
``` 
1、基于nacos动态刷新gateway，不需要重启服务 ，核心类： DynamicRouteLoader.java
    关键设计：  
            com.alibaba.nacos.api.config.ConfigService
            org.springframework.cloud.gateway.route.RouteDefinitionRepository
2、监听设计
    可支持
    1、数据库加载路由配置如mysql、redis
        基于redis的监听已实现（通过redis的发布订阅）
            以下为示范，其中runoobChat是订阅的频道名称，注意：Redis 客户端可以订阅任意数量的频道。
            客户端1：SUBSCRIBE runoobChat
            客户端2：PUBLISH runoobChat "Redis PUBLISH test"
        基于mysql的监听思路：
            监听binlog
    2、yml（本地yml加载路由配置）
        暂未实现
    3、nacos（nacos加载路由配置）
        基于nacos的监听【已实现】
        关键类：
            com.alibaba.nacos.api.config.ConfigService
            org.springframework.cloud.gateway.route.RouteDefinitionRepository
            org.springframework.cloud.gateway.event.RefreshRoutesEvent
    4、基于websocket的监听： SocketHandler
```
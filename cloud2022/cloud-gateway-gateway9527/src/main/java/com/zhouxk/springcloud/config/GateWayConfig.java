package com.zhouxk.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.config
 * @NAME: GateWayConfig
 * @USER: zhouxk
 * @DATE: 2023/4/18
 * @TIME: 22:59
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_guoji", r -> r.path("/guoji").uri("http://news.baidu.com/guonei"))
                .build();
        return routes.build();
    }
}

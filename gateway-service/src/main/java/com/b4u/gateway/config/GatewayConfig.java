package com.b4u.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/api/user/**")
                        .filters(f -> f.stripPrefix(2))
                        .uri("lb://user-service"))
                .build();
    }

}
//@Configuration: This annotation indicates that the class contains Spring Bean definitions. In this case, it's used to define the configuration for Spring Cloud Gateway routes.
//
//@Bean: This annotation indicates that the method is a Spring Bean definition. The RouteLocator bean defined here is responsible for defining and managing the routes.
//
// RouteLocatorBuilder: This is a builder class provided by Spring Cloud Gateway for creating routes.
//
//builder.routes(): Starts defining routes using the RouteLocatorBuilder.
//
//.route("user-service", r -> ...): This method is used to define a route named "user-service".
//
//r.path("/api/user/**"): This specifies the path pattern that the route will match. Requests that match this path pattern will be processed by this route.
//
//filters(f -> f.stripPrefix(2)): This line defines a filter that removes the first two segments of the path. For example, if a request is made to /api/user/profile, the filter will strip the /api prefix, resulting in a request being forwarded to /user/profile.
//
//.uri("lb://user-service"): This specifies the URI to which the matching requests should be forwarded. lb:// indicates that load balancing should be applied. In this case, requests will be forwarded to a service registered with the name "user-service" using client-side load balancing.
//
//.build(): This finalizes the route configuration.

package com.itmad.study.cloud.dashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by Gabriel.Ge on 2017-03-03.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixDashboardApplication.class).web(true).run(args);
    }
}

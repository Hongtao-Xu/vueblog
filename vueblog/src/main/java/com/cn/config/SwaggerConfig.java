package com.cn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/*
 *@program:Swagger2整合
 *@author: xu-hongtao
 *@Time: 2021/5/21  22:31
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean//配置docket以配置Swagger具体参数
    public Docket docket(Environment environment){

        //设置要显示的Swagger环境
        Profiles profiles = Profiles.of("dev", "test");

        //通过environment.acceptsProfiles判断是否处在自己设定的环境当中
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("博客开发文档")
                .enable(true) //配置是否启动swagger
                .select()
                //RequestHandlerSelectors:配置要扫描的接口的方式
                //basePackage:指定要扫描的包
                //any():扫描全部；none():都不扫描
                //withClassAnnotation:扫描类上的注解,参数是一个注解的反射对象
                //withMethodAnnotation:扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.cn.controller"))
                //paths:过滤什么路径
                //.paths(PathSelectors.ant("/ku/**"))
                .build();
    }

    //配置文档信息
    public ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("徐宏涛", "www.pi.com", "2386942240@qq.com");
        return new ApiInfo(
                "开发VueBlogAPI文档",
                "一路前行！",
                "1.0",
                "www.pi.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}

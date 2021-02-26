package com.lxjn.hgd.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger自动生成接口文档配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(Environment environment) {

        Profiles profiles = Profiles.of("dev");
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) // 接口文档的基本信息
                .enable(flag)//只有开发环境才使用swagger
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) // 方法需要有ApiOperation注解才能生存接口文档
                .paths(PathSelectors.any()) // 路径使用any风格
                .build();
    }

    /**
     * 接口文档详细信息
     *
     * @return
     */
    private ApiInfo apiInfo() {
        Contact contact = new Contact("lxjn", "www.lxjn.club", "2879754933@qq.com");
        return new ApiInfoBuilder()
                .title("幻の国接口文档")
                .description("幻の国项目api文档")
                .contact(contact)
                .termsOfServiceUrl("www.lxjn.club")
                .version("1.0.0")
                .build();
    }
}

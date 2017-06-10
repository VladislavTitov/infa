package ru.itis.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by VladislavTitov on 08.06.2017.
 */

@Configuration
@ComponentScan("ru.itis.exam")
public class MvcConfig {

    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }


}

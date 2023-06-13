package com.fly.boot.config;

import com.fly.boot.bean.Pet;
import com.fly.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: fly
 * @Date: 2023-02-07 9:06
 * @Description: 对 bean 包下的实体类进行配置
 */
// proxyBeanMethods
//      -> full模式(true【单例、代理类】)
//      -> lite模式(false【普通类,spring boot 不会事先检测容器是否有该对象】)
@Configuration(proxyBeanMethods = true)  // spring boot --> 配置文件
// @EnableConfigurationProperties({Pet.class}) --> @ConfigurationProperties 搭配
public class BeanConfig {
    @Bean
    public User user(){
        return new User(1,"张三");
    }

    @Bean
    @ConditionalOnMissingBean(name = {"pet"})
    public Pet pet(){
        return new Pet(3,"大黄");
    }
}

package com.fly.boot;

import com.fly.boot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author: fly
 * @Date: 2023-02-06 23:23
 * @Description: spring boot 主体程序
 */
// 必须加上 --> spring boot 主体程序入口
@SpringBootApplication()
// 引入 beans.xml
@ImportResource("classpath:beans.xml")
@Slf4j
public class MainApplication {

    /**
     * 查询 IOC 容器中所有 bean 对象
     * @param context IOC 容器
     */
    public static void test01(ConfigurableApplicationContext context){
         // 获取所有注册的 bean 对象
         String[] beans = context.getBeanDefinitionNames();
         for(String bean : beans) {
            System.out.println(bean);
          }
         // 获取 BeanConfig 配置类中的 bean 对象
         User user = context.getBean("user",User.class);
         System.out.println(user);
    }

    /**
     * 获取 BeanConfig 配置类中的 bean 对象
     * @param context IOC 容器
     */
    public static void test02(ConfigurableApplicationContext context){
        // 获取 BeanConfig 配置类中的 bean 对象
        User user = context.getBean("user",User.class);
        System.out.println(user);
    }

    /**
     * 查询 beans.xml 中的 bean 对象
     * @param context IOC 容器
     */
    public static void test03(ConfigurableApplicationContext context){
        // 获取 BeanConfig 配置类中的 bean 对象
        User user = context.getBean("user01",User.class);
        log.info(user.toString());
    }

    /**
     * 自动配置类 相关
     * @param context IOC 容器
     * @param clazz  clazz 所属类的 bean 对象实例在IOC容器的个数
     */
    public static <T> void test04(ConfigurableApplicationContext context, Class<T> clazz) {
        String[] beans = context.getBeanNamesForType(clazz);
        log.info("容器里 beans 个数:" + beans.length);
    }

    public static void main(String[] args) {
        // 运行 spring boot
        // SpringApplication.run(MainApplication.class);

        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class);

        test04(context,MultipartResolver.class);

    }
}

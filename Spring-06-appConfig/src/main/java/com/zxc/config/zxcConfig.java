package com.zxc.config;

import com.zxc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(zxcConfig2.class)
//这表示也被Spring容器托管，被注册到容器中
//且@Configuration表示这是一个配置类，就想beans.xml一样
public class zxcConfig {
    //相当于<beans>其中的一个<bean>
    //方法名 getUser 相当于 id
    //返回值 User 相当于class
    @Bean
    public User getUser() {
        //return 语句返回要注入到bean的对象
        return new User();
    }
}

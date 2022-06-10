package com.zxc.config;

import com.zxc.pojo.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configTest {
    @Bean
    public Hello hello() {
        return new Hello();
    }

    //<bean id="hello" class="com.zxc.pojo.Hello">
    //        <property name="str" value="Spring"/>
    //    </bean>
}

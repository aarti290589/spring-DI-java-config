package com.spring.dependency_injection.di_by_java_config;

import com.spring.dependency_injection.di_by_java_config.config.AppConfig;
import com.spring.dependency_injection.di_by_java_config.service.SmartKitchenServiceInterface;
import com.spring.dependency_injection.di_by_java_config.service.impl.SmartOvenService;
import com.spring.dependency_injection.di_by_java_config.service.impl.SmartStoveService;
import com.spring.dependency_injection.di_by_java_config.service.impl.SmartWaterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        SmartKitchenServiceInterface sc = ac.getBean(SmartWaterService.class);
        System.out.println(sc.timer());
        sc.turnOn();
        
    }
}

package com.spring.dependency_injection.di_by_java_config.config;

import com.spring.dependency_injection.di_by_java_config.client.impl.SmartOvenClient;
import com.spring.dependency_injection.di_by_java_config.client.impl.SmartStoveClient;
import com.spring.dependency_injection.di_by_java_config.service.impl.SmartOvenService;
import com.spring.dependency_injection.di_by_java_config.service.impl.SmartStoveService;
import com.spring.dependency_injection.di_by_java_config.service.impl.SmartWaterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SmartStoveService getSmartStoveService(){
        return new SmartStoveService();
    }

    @Bean
    public SmartOvenClient getSmartOvenClient(){
      return new SmartOvenClient();
    }
    @Bean(name="smartStoveClient")
    public SmartStoveClient getSmartStoveClient(){
        return new SmartStoveClient();
    }

    @Bean
    public SmartOvenService getSmartOvenService(){
        return new SmartOvenService();
    }

    @Bean
    public SmartWaterService getSmartWaterService(){
        return new SmartWaterService();
    }

}

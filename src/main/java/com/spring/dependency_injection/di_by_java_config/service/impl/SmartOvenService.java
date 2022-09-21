package com.spring.dependency_injection.di_by_java_config.service.impl;

import com.spring.dependency_injection.di_by_java_config.client.SmartKitchenClientInterface;
import com.spring.dependency_injection.di_by_java_config.service.SmartKitchenServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SmartOvenService implements SmartKitchenServiceInterface {

	@Autowired
	@Qualifier(value="smartStoveClient")
	private SmartKitchenClientInterface smartKitchenClientInterface;

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return smartKitchenClientInterface.turnOn();
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return smartKitchenClientInterface.turnOff();
	}

	@Override
	public String timer() {
		// TODO Auto-generated method stub
		return smartKitchenClientInterface.timer();
	}

}

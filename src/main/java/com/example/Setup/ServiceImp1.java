package com.example.Setup;

import org.springframework.stereotype.Component;

@Component("s1")
public class ServiceImp1 implements Service {

	@Override
	public String serviceFrom() {
		// TODO Auto-generated method stub
		return "Service from ServiceImp1";
	}

}

package com.example.Setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class User {
	@Autowired
	@Qualifier("s1")
	Service s;

	public Service getS() {
		return s;
	}

	public void setS(Service s) {
		this.s = s;
	}

}

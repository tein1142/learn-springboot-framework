package com.in28minutes.learnspringframework.exercise01;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	//Autowired คือการสร้าง constructor ให้กับ class 
	@Autowired 
	@Qualifier("MySQLDataServiceDataServiceQualifier")
	private DataService dataservice;
	
//	public BusinessCalculationService(@Qualifier("MongoDBDataServiceQualifier") DataService dataservice) {
//		super();
//		this.dataservice = dataservice;
//	}
	
	public int findMax() {
		return Arrays.stream(dataservice.retriveData()).max().orElse(0);
	}

}

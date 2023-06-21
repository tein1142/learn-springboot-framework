package com.in28minutes.learnspringframework.exercise01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("MongoDBDataServiceQualifier")
public class MongoDBDataService implements DataService{

	@Override
	public int[] retriveData() {
		return new int[] {11,22,33,44,55};
	}
	
}

package com.in28minutes.learnspringframework.exercise01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("MySQLDataServiceDataServiceQualifier")
public class MySQLDataService implements DataService{

	@Override
	public int[] retriveData() {
		return new int[] {1,2,3,4,5};
	}

}

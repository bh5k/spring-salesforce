package com.pluralsight.spring.salesforce;

import com.pluralsight.spring.salesforce.model.make.Car;
import com.pluralsight.spring.salesforce.model.make.Truck;
import com.pluralsight.spring.salesforce.model.make.Van;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSalesforceApplicationTests {

	@Autowired
	Truck truck;

	@Autowired
	Car car;

	@Autowired
	Van van;

	@Test
	public void testCar() {
		System.out.println(car.getEngine());
		System.out.println(car.getTransmission());
		System.out.println(car.getEngine().numberOfCylinders);
		System.out.println(car.getEngine().numberOfCylinders++);
	}

	@Test
	public void testTruck() {
		System.out.println(truck.getEngine());
		System.out.println(truck.getTransmission());
		System.out.println(car.getEngine().numberOfCylinders);
	}

	@Test
	public void testVan() {
		System.out.println(van.getEngine());
		System.out.println(van.getTransmission());
	}
}

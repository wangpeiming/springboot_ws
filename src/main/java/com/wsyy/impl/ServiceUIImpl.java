package com.wsyy.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.wsyy.interfaces.ServiceUI;
import com.wsyy.pojo.Car;
import com.wsyy.pojo.User;

//接口实现
@Service
@WebService(endpointInterface="com.wsyy.interfaces.ServiceUI", 
			serviceName="serviceUI", 
			targetNamespace="http://soa.corp.com/service",name="serviceUISoap",portName="serviceUISoap")
public class ServiceUIImpl implements ServiceUI {
	
	@WebMethod
	public String sayHello(String name) {
		return "hello  " + name;
	}

	@WebMethod
	public List<Car> fingCarsByUser(User user) {
		if ("xiaoming".equals(user.getName())) {
			List<Car> cars = new ArrayList<Car>();
			Car car1 = new Car();
			car1.setId(1);
			car1.setName("大众");
			cars.add(car1);

			Car car2 = new Car();
			car2.setId(2);
			car2.setName("现代");
			cars.add(car2);

			return cars;
		} else {
			return null;
		}
	}
}
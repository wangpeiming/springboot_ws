package com.wsyy.interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.wsyy.pojo.Car;
import com.wsyy.pojo.User;

//接口定义
//@WebService(serviceName="userService", 
//targetNamespace="http://soa.wsyy.com/",name="userServiceSoap",portName="userServiceSoap")
@WebService
public interface ServiceUI {
	
	@WebMethod
	String sayHello(String name);

	@WebMethod
	List<Car> fingCarsByUser(User user);
	
}
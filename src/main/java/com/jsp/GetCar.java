package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ram");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Car car=entityManager.find(Car.class,2);
	
	if(car!=null) {
		System.out.println(car.getId());
		System.out.println(car.getBrand());
		System.out.println(car.getName());
	}
	else {
		System.out.println("no car object");
	}
}
}

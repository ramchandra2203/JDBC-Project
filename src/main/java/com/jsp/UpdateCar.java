package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ram");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Car car=entityManager.find(Car.class,5);
	car.setBrand("maruti Suzuki");
	entityTransaction.begin();
	entityManager.merge(car);
	entityTransaction.commit();
	System.out.println("updated");
	
}
}

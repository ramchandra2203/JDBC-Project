package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class GetAllCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ram");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	String sql= "Select c from Car c";
	
	Query query=entityManager.createQuery(sql);
	List<Car> car=query.getResultList();
	for(Car c:car) {
		System.out.println("==========");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getBrand());
	}
	
}
}

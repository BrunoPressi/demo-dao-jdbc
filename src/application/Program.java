package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		Department department = new Department(1, "Book");
		System.out.println(department);
		
		Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date() , 2500.0, department);
		
		System.out.println(seller);
	}
}

package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated 
		
		
		Department obj = new Department (1 ,"Books");
		
		Seller seller  = new Seller(12 , "bob", "bob@gmail.com" , new Date(), 3000.0 , obj);
		
		System.out.println(seller);
		
		
		
		System.out.println(obj);
	}

}

package Main;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import Service.*;
import bean.Product;


public class ProductOperation {

		

	public static void main(String[] args) 
	{
		ArrayList<Product> list =new ArrayList<>();
		int count=0;
		Scanner sc =new Scanner(System.in);
		ProductService PS=new ProductService();
		PS.addProduct();
		String[] objects1 = list.toArray(new String[2]);
		
		Iterator<Product> iter  = list.iterator(); 
       
		while (iter.hasNext()) { 
            System.out.print(iter.next() + " "); }
		
		
		
	}
	
	}

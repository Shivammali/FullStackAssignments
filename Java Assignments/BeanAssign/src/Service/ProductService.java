package Service;

import java.io.*;
import java.util.List;
import Main.ProductOperation;
import bean.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductService { 
	ArrayList<Product> list =new ArrayList<>();

	public  ArrayList<Product> addProduct()
    { 
		ArrayList<Product> list =new ArrayList<>();
		list.add(new Product(101,"xyz",120));
		list.add(new Product(102,"ABC",210));
		
		
		for (Product p : list) {
            System.out.println(p.toString());
           
        }
		 return(list);
	} 
	public ArrayList<Product> getDetails() 
	{
	return list;	
	}
	
	public static void updateProduct() 
	{
		ArrayList<Product> list = null ;
		list.set(0, new Product(104, "LMN",250));
	}
	
	public static void deleteProduct()
	{
		ArrayList<Product> list = null ;
		list.remove(new Product(102,"ABC",210));
	}

	public  ArrayList<Product> displayAllProduct()
	{
		ArrayList<Product> list =new ArrayList<Product>();
		list.add(new Product(101,"xyz",120));
		list.add(new Product(102,"ABC",210));
		return (list);
	}
		public ArrayList<Product> retrieveProduct()
		{
			ArrayList<Product> list =new ArrayList<Product>();
			list.add(new Product(101,"xyz",120));
			list.add(new Product(102,"ABC",210));
			return (list);
		}
		
	

} 
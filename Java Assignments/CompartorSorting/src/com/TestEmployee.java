package com;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class TestEmployee{  
public static void main(String args[]){ 
	Scanner sc=new Scanner(System.in);
ArrayList<Employee> aList=new ArrayList<>();  
	aList.add(new Employee(3123,"Shiva",33300));  
	aList.add(new Employee(12321,"yuvraj",345600));  
	aList.add(new Employee(1108,"naveen",123343));  
	aList.add(new Employee(1142,"Ram",456456));
	System.out.println("Sort by /n 1.Id /n 2.Name /n 3 Salary");
	int a=sc.nextInt(); 
	
	
	switch (a) {
	case 1:
	{
			System.out.println("Choose your option to filter in /n 1.Ascending /n 2.Descending");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sorting by Id in Ascending Order:");  
						Collections.sort(aList,new IdComparator());  
		 
						for(Employee e: aList)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List employeeList = (List) Arrays.asList(aList);
				
						Collections.reverse(aList);
						System.out.println("Sorting by Id in Descending Order:");
						printArrayList(aList);
						for(Employee e: aList)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
		}
		break;	
			
	}
	case 2:
	{
			System.out.println("Sort by Name /n 1.asc /n 2. desc");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sort by Name in Ascending Order:");  
						Collections.sort(aList,new NameComparator());  
		 
						for(Employee e: aList)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List employeeList = (List) Arrays.asList(aList);
				
						Collections.reverse(aList);
						System.out.println("Sort by Name in Descending Order:");
						printArrayList(aList);
						for(Employee e: aList)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
			}
		break;
		}
	case 3:
	{
			System.out.println("Sort by Name /n 1.asc /n 2. desc");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sort by Salary in Ascending Order:");  
						Collections.sort(aList,new salaryComparator());  
		 
						for(Employee e: aList)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List employeeList = (List) Arrays.asList(aList);
				
						Collections.reverse(aList);
						System.out.println("Sort by Salary in Descending Order:");
						printArrayList(aList);
						for(Employee e: aList)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
	
		}
			break;
}

	default:
		break;
	}
  
}

private static void printArrayList(ArrayList<Employee> aList) {
	
	
}




}

 
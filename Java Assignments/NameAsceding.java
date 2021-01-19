package com;
import java.util.Arrays;
public class NameAsceding {

	public static void main(String[] args) {
		String names[]= {"Raj","ravi","Akash","ajay"};
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		
		for(int row=0;row<names.length;row++) {
			
			System.out.println(names[row]);
			
		}

	}

}

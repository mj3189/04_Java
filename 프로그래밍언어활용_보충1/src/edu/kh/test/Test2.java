package edu.kh.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		String[] fruits = new String[5];
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		
		while(true) {
			
			System.out.println("과일 이름 입력 >>> ");
			String name = sc.next();
			
			boolean flag = true;
			
			for(int i = 0 ; i < 5; i++) {
				
				if(fruits[i].equals(name)) {
					
					flag = false;
					break;
					
				}
				
			 }
				if(flag) {
					fruits[index] = name;
					index++;
					
					
					
					
					
				}
					if(index == 5) {
						break;
					}
			}System.out.println(Arrays.toString(fruits));
				
				
		}
			
	
		
		
		
		
	}
	
	


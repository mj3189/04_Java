package edu.kh.opp.method;

import java.util.Scanner;

import edu.kh.oop.method.Student;

public class StudentService {

	private Scanner sc = new Scanner(System.in);
	
	
	
	public void displayMenu() {
		
		int input = 0; 
		
		Student std1 = null;
		Student std2 = null;
		
		
		do {
			
			System.out.println("""
===== 학생 관리 프로그램 =====
1. 학생 등록					
2. 학생 정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. Html 공부하기
6. Java 역량 비교하기
7. Html 역량 비교하기
0. 프로그램 종료					
					
					"""); 
		
				System.out.print("메뉴 선택 >> ");
				input = sc.nextInt();
			
				switch(input ) {
				
				case 1: 
					System.out.println("학생을 등록할 변수를 선택(1:std1 / 2:std2) : ");
					int select = sc.nextInt();
					
					if (select == 1 )	std1 = createStudent();
					eles             std2 = createStudent();
					
					break;
				
				
				
			
				}
		}
		
	}
			
		
}	
		
		
		
	
	
	
	


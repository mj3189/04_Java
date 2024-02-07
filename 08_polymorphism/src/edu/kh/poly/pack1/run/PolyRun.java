package edu.kh.poly.pack1.run;

import edu.kh.poly.pack1.model.service.PolyService;

public class PolyRun {
	
	public static void main(String[] args) {
		
		// PolyService 객체 생성
		PolyService service = new PolyService();
	// 참조형 변수        =  	Heap 영역에 기본생성자를 이용해서 만듬
		//  =  -> 주소를 참조하는
		
//		service.method1();
		
		service.method9();
	
	}

}

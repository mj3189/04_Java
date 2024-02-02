package edu.kh.oop.constructor;

public class MemberRun {
	
		public static void main(String[] args) {
			
			// 회원 객체 생성
			// -> 기본 생성자를 이용해서 생성
			Member member1 = new Member();

			// null == "참조하는 객체가 없다"를 나타내는 값
			//              (저장된 주소가 없다)
			member1.inform();
			
			
			// member1이 참조하는 Member객체의 필드값을 세팅
			member1.setMemberId("member01");
			member1.setMemberPw("pass01");
			member1.setMemberName("김회원");
			member1.setMemberAge(27);
			
			
			// 새로운 member 객체 생성 후 필드 값 세팅
			
			Member member2 = new Member();   // 기본 생성자 이용
			
			member2.inform();
			
			member2.setMemberId("회원02");
			member2.setMemberPw("333333");
			member2.setMemberName("아이유");
			member2.setMemberAge(31);			
			
			
			System.out.println("[member1]");
			member1.inform();
			
			System.out.println("[member2]");
			member2.inform();
			
			
			// -----------------------------------------------------
			// 매개 변수 생성자를 이용해서 Member객체 생성
			Member member3 = new Member("mj3189", "1234","박민진", 20);
			System.out.println("[member3]");
			member3.inform();
			
			Member member4 = new Member("pmj3189", "1111234","111박민진", 1120);
			System.out.println("[member4]");
			member4.inform();
			
			
			// ** 프로그래밍 언어에서 변수명, 함수명, 메서드명 중복 허용 X **
			
			// 변수명 중복
			int a = 10;
//			int a = 20;
			
		}

		// 메서드명 중복
		public void test() {}
//		public void test() {}
		
		
		
}

public class BookOrderTest{
	public static void main(String[] args){

		int java = 24000; // 자바 책 가격
		int jquery = 21000; // 제이쿼리 책 가격
		int oracle = 19000; // 오라클 책 가격
		int spring = 35000; // 스프링 책 가격


		int total = java + jquery + oracle + spring;
		double discount = total * 0.15;
		double discounttotal = total - discount;

		System.out.println(" ==== 도서 구입 목록 ====");
		System.out.println("자바 :" + java);
		System.out.println("Jquery : " + jquery);
		System.out.println("오라클 : " + oracle);
		System.out.println("스프링 :" + spring);
		System.out.println("--------------------------");
		System.out.println("주문 총 금액 : " + total + "원");
		// 최종 값은 더블로 저장되기 때문에 소숫점 제거를 위해 인티저로 강제형변환
		System.out.println("할인 후 결제 금액 : " + (int) discounttotal + "원" );
				
	}

}

public class Iftest2{
		public static void main(String [] agrs){

	//버스의 기본요금을 1000원이라고 가정하고 다음과 같은 연령별 분류에 따라서 
	//별도의 할인율을 적용하여 최종요금을 계산하는 프로그램 작성
	//다중 if문을 사용하여 단계별 분류 방식으로 구현해야함.


	//영유아 할인율 100%
	//어린이 할인율 50%
	//청소년 할인율 25%
	//성인 할인율 0%
	//어르신 할인율 100%

	int basicprice = 1000; //기본요금	
	int total = 0; //총 금액
	double discountprice = 0;
	
	int age = 3; //나이가 3세이하
	int age1 = 13; //나이가 13세이하
	int age2 = 19; // 나이가 19세 이하
	int age3 = 20; // 나이가 20세 이상
	int age4 = 65;	 //나이가 65세 이상
					
					

				//나이가 3세 이하이면 할인율 100% total 변수를 이용
				if(age <= 3) {
					int discount = basicprice * total;
					int price = basicprice * discount;
					System.out.println("최종요금 : " + price + "원");
				} 
				
					//나이가 14세 이상이고 19세 이하이면 할인율 25% 적용/전역변수, 지역변수 이용
				if(age2 >= 14 && age2 <= 19){
						double discount = 0.25;
						double  price = basicprice * discount;
						discountprice = basicprice - price;
						System.out.println("최종요금 : " + (int) discountprice + "원");
				}
					//나이가 19세 초과이고 65세 미만이면 기본요금 적용 
				if(age3 > 19 && age3 < 65){
						System.out.println("최종요금 : " + basicprice + "원");
				}
		
				
					//나이가 4세 이상이고 13세 이하이면 할인율 50% 적용/전역변수, 지역변수 이용					
				if(age1 >= 4 && age1 <= 13){
						double discount = 0.5;
						double price = basicprice * discount;
						discountprice = basicprice - price;
						System.out.println("최종요금 : " + (int) discountprice + "원");
				}
					//나이가 65세 이상이면 할인율 100% 적용/전역변수, 지역변수 이용
				if(age4 >= 65){
						int discount = basicprice * total;
						int price = basicprice * discount;
						System.out.println("최종요금 : " + price + "원");
				} 



	
	}
}

								



		



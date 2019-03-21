public class BusPrice{

		public static void main (String [] args){

				//버스 기본 요금 : 1000원
				//나이가 20세 미만 : 영유아, 어린이, 청소년에 대해서 요금을 25% 할인
				//20세 이상 성인은 할인 해주지 않기로 합니다.


				int basicprice = 1000;
				int age = 20;
				double discount = 0.25;

				if(age < 20){
					double price = basicprice - (basicprice * discount);
					System.out.println("최종요금 : " + price + "원");
				} else System.out.println("최종요금 : " + basicprice + "원");


	}
}


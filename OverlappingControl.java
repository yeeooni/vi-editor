public class OverlappingControl{
		public static void main (String [] agrs){
//if else 안에 또 다른 if else 를 사용하시오.
// 경우 1: 0 미만
// 경우 2: 10 이하 0 초과
// 경우 3: 10 초과
		
	int num = 0;

	if(num ==  0 && num < 0){// num이 0이고, num 0보다 작으면 0을 출력해라.
		System.out.println(" 0 ");

	}else {// 만족하지 않는다면 조건의 num이 10보다 크다면 10초과를 출력하고 

		if(num > 10)		
			System.out.println("10 초과");
			
		else{//둘다 만족하지 않늗나면 10이하 0초과를 출력해라.
			System.out.println("10이하 0초과");
			}
		}
	}
}

 public class Iftest{
		 public static void main(String [] args){


//사용자로부터 세 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램을 작성
//단, 삼항 연산자를 사용하지 말고 반드시 if문을 사용하여 작성

	int num1 = 10;
	int num2 = 30;
	int num3 = -10;



			if(num1 > num2 && num1 > num3){
					System.out.println(num1);
			} else if(num2 > num1 && num2 > num3){
				System.out.println(num2);
			} else if(num3 > num1 && num3 > num2){
					System.out.println(num3);
			}
		 }
 }


public class MultipleCheck{
	public static void main(String [] args){

	//인트로 변수를 지정해줬어.
	int num = 20;
	int two = 0;
	int three = 0;
	int five = 0;

		for(int i = 1; i <= num; i++){
			System.out.print(i + " .");
				
			if(i % 2 == 0){
					System.out.print(" 2의 배수");
					two++;
			}

			if(i % 3 == 0){
				System.out.print(" 3의 배수");
				three++;
			}

			if(i % 5 == 0){
				System.out.print(" 5의 배수");
				five++;
			}
					System.out.println(); //개행이 필요해
		}
					
					System.out.println("\n");
			System.out.println("==== 출력 횟수 ====");
			System.out.println("2의 배수 : " + two);
			System.out.println("3의 배수 : " + three);
			System.out.println("5의 배수 : " + five);
			



	}








}

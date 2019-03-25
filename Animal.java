import java.io.*; //io pakage에서 모든 클래스를 import 한다.

// 1.조건문
// 2.어떤 수를 3,4,5,8 나누었을 때 나누어 떨어지는 수에 특정한 이름 부여
// 3.동시에 나누어 떨어지는 숫자가 있다면 동물 이름 연속으로 나열 되도록 할 것
// 4.하단에 출력된 동물의 이름을 count해서 횟수 출력

public class Animal{

		//field
	private	BufferedReader in;
	private	String name;
	private int countCat, countDog, countLion, countTiger;
		
		//Constructor
		public Animal(){
				in = new BufferedReader( new InputStreamReader (System.in)); 
				//BufferedReader 클래스에서 객체 생성 / InputStreamReader 클래스에서 객체 생성
		}
		
		//매개변수(이름)을 입력받는 생성자 
		public Animal(String name){
				this.name = name;
		}

		//게임시작 method
		public void game() throws Exception{	
			while(true){
					System.out.println("== 임의 숫자를 입력해보세요. ==");
					int number = Integer.parseInt(in.readLine());
						switch(number % 3){
					case 0 : System.out.print("cat 입니다.\n"); countCat++; break;
					}
						if(number % 4 == 0){
								System.out.print("dog 입니다.\n");
								countDog++; //각 변수를 만들어 카운트를 새로 지정해줌.
						}
						if(number % 5 == 0){
								System.out.print("lion 입니다.\n");
								countLion++;
						}
						if(number % 8 == 0){
								System.out.print("tiger 입니다.\n");
								countTiger++;
						}

						System.out.println("cat : " + countCat +"\n" + "dog : " + countDog + "\n" + "lion : " + countLion + "\n" + "tiger : " + countTiger + 
									"\n");
					
						exit();	
			}
		}

		// 게임 종료 method
		public void exit() throws Exception{
				System.out.println("계속 하시겠습니까? 계속(1) 종료(0)");
			int re = Integer.parseInt(in.readLine()); 	
				if(re == 0){
					System.out.println("숲으로 떠납니다.");
					System.exit(0);
				} else if(re == 1){
						game();
				}
		}
		//실행 method
		public static void main(String [] args) throws Exception{

			//객체생성
			Animal animal = new Animal();
			animal.game();	
	}
}

public class Member{
		// Member클래스를 모델링

		/* 14. 이름, 아이디, 패스워드, 나이를 field (속성)으로 설정 */

		//field

		public String name;
		public String id;
		public String password;
		public int age;

		/* 15. 생성자 생성 name, id field의 외부에서 받은 값으로 초기화 하려면 생성자를 어떻게 선언해야하나? */


		public Member(String name, String id){
				//super();
				this.name = name;
				this.id = id;
		}

	public static void main(String [] args){
				Member m1 = new Member("김의연", "kimiyeon");
				
				System.out.println("나의 이름은 : " + m1.name);
				System.out.println("나의 아이디는 : " + m1.id);

		}
}


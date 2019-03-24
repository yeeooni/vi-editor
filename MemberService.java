public class MemberService {


		String name;

		public MemberService(String name){
				super();
				this.name = name;
		}


		//15. login()메소드와 logout()메소드를 선언
		/* login()메소드에는 매개값으로 id, password를 제공
		   logout()메소드는 id만 매개값으로 제공 */

		//method
		public boolean login(String id, int password){
				return true;
		}

		public void logout(String id){
				System.out.println("로그아웃 되었습니다.");
		}

}

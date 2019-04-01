public class MemberServiceExample{	
	public static void main(String [] args){

//MemberService 클래스에서 매개값 대입 후 생성자 호출
	MemberService ms1 = new MemberService("김의연");

	boolean result = ms1.login("kim", 12345);

//만약 결과가 kim, 12345 라면 로그인 
	if(result){
		System.out.println(ms1.name + " 님이 로그인 되었습니다.");
		ms1.logout("kim");
			
//아니라면 아이디와 패스워드가 일치하지 않습니다.
		} else System.out.println("ID와 Password가 일치하지 않습니다.");
	}
}

public class ObjectExample{
	public static void main(String [] args){
			
		StringBuffer obj = new StringBuffer("Hey, Java");
		obj.delete(1, 3);
		System.out.println(obj); //"H, Java" 출력
		System.out.println("\n"); // 개행
		obj.insert(1, 'i');
		System.out.println(obj); //"Hi, Java" 출력
	
	
	// Exercise 5-1 StringBuffer 클래스에 있는 replace 메소드를 사용하여 치환 
	// replace(int start, int end, String str)

		StringBuffer obj2 = new StringBuffer("HEEEE, Java");
		System.out.println("\n");
		obj.replace(1, 4, "i, ");
		System.out.println(obj);	
	}
}




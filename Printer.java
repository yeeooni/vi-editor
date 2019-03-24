public class Printer{
		public static void main(String [] args){


				PrinterExample p1 = new PrinterExample();
				int result = p1.println(10);
				System.out.println("PrinterExample 의 숫자는: " + result);
			
				boolean result1 = p1.println(true);
				System.out.println("PrinterExample 의 조건은? " + result1);

				double result2 = p1.println(5.7);
				System.out.println("PrinterExample 의 실수는? " + result2);

		}
}

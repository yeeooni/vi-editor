import java.util.*;


public class AbstractTest1{
	public static void main(String [] args){
				
			Calendar cal1 = Calendar.getInstance();

			int year = cal1.get(Calendar.YEAR);
			int month = cal1.get(Calendar.MONTH) + 1;
			int day = cal1.get(Calendar.DATE);
			int hour = cal1.get(Calendar.HOUR_OF_DAY);
			int minute = cal1.get(Calendar.MINUTE);
			int second = cal1.get(Calendar.SECOND);

						System.out.println( year + " 년 " + month + " 월 " + day + " 일 " + hour + " 시 " + minute + " 분 " + second + " 초 ");


	}
}


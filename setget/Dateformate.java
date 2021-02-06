package setget;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformate {
	public static void main(String[] args) throws ParseException {
		Date today =new Date();
		SimpleDateFormat format1 =new SimpleDateFormat("MM/dd/yyyy");
		String strDate= format1.format(today);
		System.out.println("Format#1 : "+strDate);
		SimpleDateFormat format2 =new SimpleDateFormat("MMMMM dd,yyyy");
		strDate=format2.format(today);
		System.out.println("Format#2  : "+strDate);
		Date pDate=format1.parse("12/01/2021");
		System.out.println(pDate);
		
		
		
		
		
	}

}

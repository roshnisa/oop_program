package setget;
import java.text.ParseException;
public class Testperson {
	//public static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	public static void main(String[] args)  throws ParseException
	{
		Person p=new Person();
		p.setName("roshni");
		p.setAddress("saraswati nagar");
        p.getName();
		p.getAddress();
	}

}

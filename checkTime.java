import java.text.*;
import java.util.*;

public class checkTime {

    public static void main(String[] args) {
        Calendar now = new GregorianCalendar();
		String am_pm;     
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		if (now.get(Calendar.AM_PM) == 0){
			am_pm = "AM";  
		}
		else{
			am_pm = "PM";
		}
		String time = hour + ":" + minute + " " + am_pm;        
		String Scan_hour = "2:45 PM";       
		System.out.println(time + "--" + Scan_hour);    
		if (time.equals(Scan_hour)){
			System.out.println("Time matchs");
		}
		else{
			System.out.println("Time Doesn't Match");
		}
    }

}
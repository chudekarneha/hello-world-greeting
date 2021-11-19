package hello;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GreetingMessageIT {

	GreetingMessage var = new GreetingMessage();
	private String message;

   @Test
   public void testPrintMessage() {
   	GregorianCalendar time = new GregorianCalendar();
 	int hour = time.get(Calendar.HOUR_OF_DAY);
	if (hour < 12)
    this.message = "Good Morning! \n\n Welcome to CI/CD E2E Cloud Solution";
    else if (hour < 17 && !(hour == 12))
    this.message = "Good Afternoon! \n\n Welcome to CI/CD E2E Cloud Solution";
    else if (hour == 12)
    this.message = "Good Noon! \n\n Welcome to CI/CD E2E Cloud Solution";
    else
    this.message = "Good Evening! \n\n Welcome to CI/CD E2E Cloud Solution";
   	
    assertEquals(message,var.printMessage());

   }
}

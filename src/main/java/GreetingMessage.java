package hello;

public class GreetingMessage {
  
     private String message;
     private int hours;

     // constructor
     public GreetingMessage(){
      
      DateTime var = new DateTime();
        this.hours = var.dateTime();

      if (hours < 12)
      this.message = "Good Morning! \n\n Welcome to CI/CD E2E Cloud Solution";
      else if (hours < 17 && !(hours == 12))
      this.message = "Good Afternoon! \n\n Welcome to CI/CD E2E Cloud Solution";
      else if (hours == 12)
      this.message = "Good Noon! \n\n Welcome to CI/CD E2E Cloud Solution";
      else
      this.message = "Good Evening! \n\n Welcome to CI/CD E2E Cloud Solution";
     }
      
     // return message 
     public String printMessage(){
        System.out.println(message);
        return message;
     }   
  } 

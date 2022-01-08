import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class dateTime {
  public static void main(String[] args) {
    String myTime = "22:06";
    DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm");
    while(true) {
      LocalTime newTime = LocalTime.now();
      String formatted = newTime.format(myFormat);
      if(myTime.equals(formatted)) {
        System.out.println("works");
      } else {
        System.out.println("nope");
      }
      break;
    }
  }
}

import java.util.Date;

public class DateDemo0 {
    
    public static void main(String[] args) {

        Date currentDate = new Date();
        
        System.out.println(currentDate);
        System.out.println(currentDate.toInstant());
        
        System.out.println();

        Date date = new Date(new Date().getTime());
        System.out.println(date);
        date.setTime(date.getTime() +  86400 * 1000);
        System.out.println(date);

        System.out.println();
    }
}


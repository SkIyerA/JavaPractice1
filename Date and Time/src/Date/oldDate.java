package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class oldDate {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

        long timeStamp = currentDate.getTime();
        System.out.println(timeStamp);

        currentDate.setYear(122);
        System.out.println(currentDate);

        String date = "16-02-2024";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date givenDate = dateFormat.parse(date);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(givenDate);

            calendar.add(Calendar.MONTH,6);

            Date sixMonthsLater = calendar.getTime();

            System.out.println(givenDate);
            System.out.println(sixMonthsLater);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

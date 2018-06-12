package module7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientTime implements Client {
    private static DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public void onDateTimeChange(Date currentTime) {
        System.out.println("Current time is: " + dateFormat.format(currentTime));
    }
}

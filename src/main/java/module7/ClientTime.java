package module7;

import java.util.Date;

public class ClientTime implements Client {

    public void onDateTimeChange(Date currentDate) {
        System.out.println("Current time is: " + currentDate);
    }
}

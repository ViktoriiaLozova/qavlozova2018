package module7;

import java.util.Date;

public class ClientDate implements Client {
    public void onDateTimeChange(Date currentDate) {
        System.out.println("Current date is: " + currentDate);
    }
}

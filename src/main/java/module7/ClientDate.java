package module7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientDate implements Client {
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public void onDateTimeChange(Date currentDate) {
        System.out.println("Current date is: " + dateFormat.format(currentDate));
    }
}

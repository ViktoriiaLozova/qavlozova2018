package module7;

import java.util.ArrayList;
import java.util.Date;

public class ServerImplOne implements Server {
    private ArrayList<Client> clients = new ArrayList<Client>();

    public void register(Client client) {
        clients.add(client);
    }

    public void process() {
        Date currentDate = new Date();
        for (int i = 0; i < clients.size(); i++) {
            clients.get(i).onDateTimeChange(currentDate);
        }
    }
}

package module7;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ServerImplTwo implements Server {
    private Set<Client> clients = new HashSet<Client>();

    public void register(Client client) {
       clients.add(client);
    }

    public void process() {
        Date currentDate = new Date();
        for (Client client : clients) {
            client.onDateTimeChange(currentDate);
        }
    }
}

package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeatherService {

    private Map<Client, Location> clients = new HashMap<>();

    public void addSubscriber(Client client, Location location) {
        this.clients.put(client,location);
    }

    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void addLocation(Client client, Location location) {
        this.clients.put(client, location);
    }

    public void removeLocation(Location location) {
        this.clients.remove(location);
    }

}

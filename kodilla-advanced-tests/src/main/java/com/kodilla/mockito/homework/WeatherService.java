package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {

    private Map<Location, Set<Client>> locationClientsMap = new HashMap<>();

    public void addSubscriber(Location location, Client client) {
        if (locationClientsMap.containsKey(location)) {
            locationClientsMap.get(location).add(client);
        } else {
            Set<Client> newClients = new HashSet<>();
            newClients.add(client);
            locationClientsMap.put(location, newClients);
        }
    }

    public void sendNotification(Notification notification) {
        for (Set<Client> clients : locationClientsMap.values())
            clients.forEach(client -> client.receive(notification));
    }

    public void removeLocation(Location location) {
        locationClientsMap.put(location, new HashSet<>());
    }

    public int sizeOfMap() {
        return locationClientsMap.size();
    }

    public void removeSubscription(Location loc) {
        locationClientsMap.put(loc, new HashSet<>());
    }

    public void removeSubscription(Client cl) {
        for (Map.Entry<Location, Set<Client>> locks : locationClientsMap.entrySet()) {
            if (locks.getValue().contains(cl))
                locks.getValue().remove(cl);
        }
    }
}

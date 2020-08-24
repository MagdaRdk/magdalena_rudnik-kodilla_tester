package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    Client client = Mockito.mock(Client.class);
    Location location = Mockito.mock(Location.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void clientCanSaveLocationAndReceiveNotification() {
        weatherService.addSubscriber(location,client);
        assertEquals(1,weatherService.sizeOfMap());
        weatherService.sendNotification(notification);
        Mockito.verify(client,Mockito.times(1)).receive(notification);
    }


    @Test
    public void unsubscribeFromYourLocation() {
        weatherService.addSubscriber(location, client);
        weatherService.removeSubscription(location);
        weatherService.sendNotification(notification);
        Mockito.verify(client,Mockito.never()).receive(notification);
    }

   @Test
    public void unsubscribeAllLocationAndUnsubscribingFromNotification() {
        weatherService.addSubscriber(location, client);
       weatherService.removeSubscription(client);
       weatherService.sendNotification(notification);
       Mockito.verify(client,Mockito.never()).receive(notification);
    }

    @Test
    public void notificationFromLocationShouldReachOnlyGroupOfPeople() {
        Client client2 = Mockito.mock(Client.class);
        weatherService.addSubscriber(location, client);
        weatherService.sendNotification(notification);
        Mockito.verify(client2,Mockito.never()).receive(notification);
        Mockito.verify(client,Mockito.times(1)).receive(notification);
    }

    @Test
    public void sendNotificationToEveryone() {
        Client secondClient = Mockito.mock(Client.class);
        weatherService.addSubscriber(location, client);
        weatherService.sendNotification(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

   @Test
    public void shouldDeletingGivenLocation() {
       Location locationToBeDeleted = Mockito.mock(Location.class);
       weatherService.addSubscriber(locationToBeDeleted, client);
       weatherService.removeLocation(locationToBeDeleted);
       weatherService.sendNotification(notification);
       Mockito.verify(client,Mockito.never()).receive(notification);

    }
}

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
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

   @Test
    public void shouldDeletingGivenLocation() {
       Location location2 = Mockito.mock(Location.class);
       weatherService.addSubscriber(location, client);
       weatherService.removeLocation(location);
       weatherService.sendNotification(notification);
       Mockito.verify(location2,Mockito.never());
       Mockito.verify(location,Mockito.times(0));

    }
}

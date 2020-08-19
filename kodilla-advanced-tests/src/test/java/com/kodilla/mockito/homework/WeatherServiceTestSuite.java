package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    @Test
    public void clientCanSaveLocationAndReceiveNotification() {
        WeatherService weatherService = new WeatherService();
        Client client = Mockito.mock(Client.class);

    }

    @Test
    public void unsubscribeFromYourLocation() {
        WeatherService weatherService = new WeatherService();
        Client client = Mockito.mock(Client.class);

    }

    @Test
    public void unsubscribeAllLocationAndUnsubscribingFromNotification() {
        WeatherService weatherService = new WeatherService();
        Client client = Mockito.mock(Client.class);

    }

    @Test
    public void notificationFromLocationShouldReachOnlyGroupOfPeople() {
        WeatherService weatherService = new WeatherService();
        Client client = Mockito.mock(Client.class);

    }

    @Test
    public void sendNotificationToEveryone() {
        WeatherService weatherService = new WeatherService();
        Client firstClient = Mockito.mock(Client.class);
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
        weatherService.addSubscriber(firstClient);
        weatherService.addSubscriber(secondClient);
        weatherService.addSubscriber(thirdClient);
        Notification notification = Mockito.mock(Notification.class);

        weatherService.sendNotification(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);

    }

    @Test
    public void shouldDeletingGivenLocation() {
        WeatherService weatherService = new WeatherService();
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        weatherService.addLocation(location1);
        weatherService.addLocation(location2);
        weatherService.addLocation(location3);

        weatherService.removeLocation(location1);

    }
}

package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @org.junit.jupiter.api.Test
    void stationOverLimit() {
        Radio service = new Radio();
        service.setCurrentStation(10);
        assertEquals(0, service.getCurrentStation());

        service.setCurrentStation(-1);
        assertEquals(0, service.getCurrentStation());

        service.setCurrentStation(4);
        service.setCurrentStation(10);
        assertEquals(4, service.getCurrentStation());

        service.setCurrentStation(-1);
        assertEquals(4, service.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void stationButtonWorks() {
        Radio service = new Radio();
        assertEquals(0, service.getCurrentStation());

        service.prevButton();
        assertEquals(9, service.getCurrentStation());
        service.prevButton();
        assertEquals(8, service.getCurrentStation());

        service.nextButton();
        assertEquals(9, service.getCurrentStation());
        service.nextButton();
        assertEquals(0, service.getCurrentStation());
        service.nextButton();
        assertEquals(1, service.getCurrentStation());
    }

    @org.junit.jupiter.api.Test
    void volumeTest() {
        Radio service = new Radio();

        assertEquals(0, service.getVolume());

        service.volumeDown();
        assertEquals(0, service.getVolume());

        service.volumeUp();
        assertEquals(1, service.getVolume());
        service.volumeDown();
        assertEquals(0, service.getVolume());

        int i = 0;
        while (i < 10) {
            service.volumeUp();
            i++;
        }
        assertEquals(9, service.getVolume());
    }

}
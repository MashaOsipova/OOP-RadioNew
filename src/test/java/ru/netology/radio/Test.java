package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    void stationOverLimit() {
        Main service = new Main();
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
        Main service = new Main();
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
        Main service = new Main();

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
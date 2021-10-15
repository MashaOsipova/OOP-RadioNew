package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseCurrentFrequencyUnderMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = radio.getMaxFrequency() - 1;
        int expected = radio.getMaxFrequency();
        radio.setCurrentFrequency(currentFrequency);
        radio.increaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldIncreaseCurrentFrequencyEqualMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = radio.getMaxFrequency();
        int expected = radio.getMinFrequency();
        radio.setCurrentFrequency(currentFrequency);
        radio.increaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldIncreaseCurrentFrequencyEqualMinFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 0;
        int expected = 1;
        radio.setCurrentFrequency(currentFrequency);
        radio.increaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldDecreaseCurrentFrequencyOverMinFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 1;
        int expected = 0;
        radio.setCurrentFrequency(currentFrequency);
        radio.decreaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldDecreaseCurrentFrequencyEqualMinFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 0;
        int expected = 9;
        radio.setCurrentFrequency(currentFrequency);
        radio.decreaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldDecreaseCurrentFrequencyEqualMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = 9;
        int expected = 8;
        radio.setCurrentFrequency(currentFrequency);
        radio.decreaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldReturnCurrentFrequencyOverMaxFrequency() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(10);
        int expected = 0;
        assertEquals(expected, radio.getCurrentFrequency());

    }

    @Test
    public void shouldReturnCurrentFrequencyUnderMinFrequency() {
        Radio radio = new Radio();
        radio.setCurrentFrequency(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentFrequency());

    }

    @Test
    public void shouldIncreaseCurrentVolumeUnderMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 9;
        radio.setCurrentVolume(currentVolume);
        int expected = 10;
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldIncreaseCurrentVolumeEqualMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        int expected = 10;
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldDecreaseCurrentVolumeOverMinVolume() {
        Radio radio = new Radio();
        int currentVolume = 1;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldDecreaseCurrentVolumeEqualMinVolume() {
        Radio radio = new Radio();
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldReturnCurrentVolumeOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldReturnCurrentVolumeUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }
}

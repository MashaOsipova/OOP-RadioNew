package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    public RadioTest() {
    }

    @Test
    public void shouldIncreaseCurrentFrequencyUnderMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = radio.getUserMaxFrequency() - 1;
        int expected = radio.getUserMaxFrequency();
        radio.setCurrentFrequency(currentFrequency);
        radio.increaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldIncreaseCurrentFrequencyEqualMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = radio.getUserMaxFrequency();
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
        int expected = radio.getUserMaxFrequency();
        radio.setCurrentFrequency(currentFrequency);
        radio.decreaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldDecreaseCurrentFrequencyEqualMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = radio.getUserMaxFrequency();
        int expected = radio.getUserMaxFrequency() - 1;
        radio.setCurrentFrequency(currentFrequency);
        radio.decreaseFrequency();
        assertEquals(expected, radio.getCurrentFrequency());
    }

    @Test
    public void shouldReturnCurrentFrequencyOverMaxFrequency() {
        Radio radio = new Radio();
        int currentFrequency = radio.getUserMaxFrequency() + 1;
        radio.setCurrentFrequency(currentFrequency);
        int expected = 0;
        assertEquals(expected, radio.getCurrentFrequency());

    }

    @Test
    public void shouldReturnCurrentFrequencyUnderMinFrequency() {
        Radio radio = new Radio();
        int currentFrequency = radio.getMinFrequency() - 1;
        radio.setCurrentFrequency(currentFrequency);
        int expected = 0;
        assertEquals(expected, radio.getCurrentFrequency());

    }

    @Test
    public void shouldIncreaseCurrentVolumeUnderMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = radio.getMaxVolume() - 1;
        radio.setCurrentVolume(currentVolume);
        int expected = radio.getMaxVolume();
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldIncreaseCurrentVolumeEqualMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = radio.getMaxVolume();
        radio.setCurrentVolume(currentVolume);
        int expected = radio.getMaxVolume();
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldDecreaseCurrentVolumeOverMinVolume() {
        Radio radio = new Radio();
        int currentVolume = radio.getMinVolume() + 1;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldDecreaseCurrentVolumeEqualMinVolume() {
        Radio radio = new Radio();
        int currentVolume = radio.getMinVolume();
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());


    }

    @Test
    public void shouldReturnCurrentVolumeOverMaxVolume() {
        Radio radio = new Radio();
        int currentVolume = radio.getMaxVolume() + 1;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldReturnCurrentVolumeUnderMinVolume() {
        Radio radio = new Radio();
        int currentVolume = radio.getMinVolume() - 1;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetUserMaxFrequencyByDefault() {
        Radio radio = new Radio();
        int expected = 9;
        assertEquals(expected, radio.getUserMaxFrequency());
    }

    @Test
    public void shouldUseUserMaxFrequencySettings() {
        Radio radio = new Radio(50);
        int currentFrequency = radio.getUserMaxFrequency();
        int expected = 50;
        radio.setCurrentFrequency(currentFrequency);
        assertEquals(expected, radio.getCurrentFrequency());
    }
}

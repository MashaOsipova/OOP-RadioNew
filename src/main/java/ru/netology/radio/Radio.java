package ru.netology.radio;

public class Radio {
    private final int minFrequency = 0;
    private int userMaxFrequency;
    private int currentFrequency;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;

    public Radio(int userMaxFrequency) {
        this.userMaxFrequency = userMaxFrequency;
    }

    public Radio() {
        this.userMaxFrequency = 9;
    }


    public int getMinFrequency() {
        return minFrequency;
    }

    public int getUserMaxFrequency() {
        return userMaxFrequency;
    }

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public void setCurrentFrequency(int currentFrequency) {
        if (currentFrequency > userMaxFrequency)
            return;
        if (currentFrequency < minFrequency)
            return;
        this.currentFrequency = currentFrequency;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }

    public void increaseFrequency() {
        if (currentFrequency < userMaxFrequency) {
            currentFrequency = currentFrequency + 1;
        } else {
            currentFrequency = minFrequency;
        }
    }

    public void decreaseFrequency() {
        if (currentFrequency > minFrequency) {
            currentFrequency = currentFrequency - 1;
        } else {
            currentFrequency = userMaxFrequency;
        }
    }

    void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
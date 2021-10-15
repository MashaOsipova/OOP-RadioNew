package ru.netology.radio;

public class Radio {
    private final int minFrequency = 0;
    private final int maxFrequency = 9;
    private int currentFrequency;
    private final int minVolume = 0;
    private final int maxVolume = 10;
    private int currentVolume;

    public void increaseFrequency() {
        if (currentFrequency < maxFrequency) {
            currentFrequency = currentFrequency + 1;
        } else {
            currentFrequency = minFrequency;
        }
    }

    public void decreaseFrequency() {
        if (currentFrequency > minFrequency) {
            currentFrequency = currentFrequency - 1;
        } else {
            currentFrequency = maxFrequency;
        }
    }

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getMinFrequency() {
        return minFrequency;
    }

    public int getMaxFrequency() {
        return maxFrequency;
    }

    public void setCurrentFrequency(int currentFrequency) {
        if (currentFrequency > maxFrequency)
            return;
        if (currentFrequency < minFrequency)
            return;
        this.currentFrequency = currentFrequency;
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
}
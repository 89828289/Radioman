package ru.netology.Radio;

public class Radio {

    private int minStation;
    private int maxStation;
    private int currentStation;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;

    public Radio() {
        minStation = 0;
        maxStation = 9;
        minVolume = 0;
        maxVolume = 100;
    }
    public Radio(int numberStations){
        maxStation = numberStations - 1;
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 10) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reducingVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}


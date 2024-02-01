public class Radio {
    private int currentStation; //станция
    private int currentVolume; //громкость
    private int maxStation; //максимальная станция
    private int minStations; //минимальная станция
    private int maxVolume; //максимальная громкость
    private int minVolume; //минимальная громкость
    //private int currentStation; //текущая станция
    //private int currentVolume; // текущая громкость

    public Radio() {
        this.maxStation = 9;
        this.minStations = 0;
        this.maxVolume = 100;
        this.minVolume = 0;
        //this.currentStation = currentStation;
        //this.currentVolume = currentVolume;

    }

    public Radio(int stationsCount, int volumeCount) {
        this.maxStation = stationsCount - 1;
        this.minStations = stationsCount + 1;
        this.maxVolume = volumeCount - 1;
        this.minVolume = volumeCount + 1;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStations) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStations;
        }
    }

    public void prev() {
        if (currentStation != minStations) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
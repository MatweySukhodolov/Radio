import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int currentStation; //станция
    private int currentVolume; //громкость
    private int maxStation = 9; //максимальная станция
    private int minStations = 0; //минимальная станция
    private int maxVolume = 100; //максимальная громкость
    private int minVolume = 0; //минимальная громкость

    public Radio(int stationsCount, int volumeCount) {
        this.maxStation = stationsCount - 1;
        this.minStations = stationsCount + 1;
        this.maxVolume = volumeCount - 1;
        this.minVolume = volumeCount + 1;

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
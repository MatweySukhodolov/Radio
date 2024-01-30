import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setStation() { //выбор станции
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() { //следующая станция
        radio.setCurrentStation(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextMaxStation() { //следующая станция после 9
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() { //предыдущая станция
        radio.setCurrentStation(7);
        radio.prev();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinStation() { //предыдущая станция после 0
        radio.setCurrentStation(-1);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest() { //прибавить громкость
        radio.setCurrentVolume(56);
        radio.volumeUp();

        int expected = 57;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpMaxTest() { //прибавить громкость больше 100
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownTest() { //убавить громкость
        radio.setCurrentVolume(35);
        radio.volumeDown();

        int expected = 34;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownMinTest() { //убавить минимальную громкость
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextBugMaxStation() { //проверка макс граничного значения станции
        radio.setCurrentStation(10);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBugMinStation() { //проверка мин граничного значения в станции
        radio.setCurrentStation(-1);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeUpMaxTest1() { //прибавить громкость больше 100
        radio.setCurrentVolume(101);
        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeDownMinTest1() { //убавить минимальную громкость
        radio.setCurrentVolume(-1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

}

import java.sql.Timestamp;

public class WeatherData {

    private Timestamp timestamp;
    private double temp_in_f;;
    private double humidity;


    public WeatherData(Timestamp date_time, Double humidity, Double temp_in_f){
        this.temp_in_f = temp_in_f;
        this.humidity = humidity;
        this.timestamp = date_time;
    }

    public double getTemp_in_f() {
        return temp_in_f;
    }

    public double getHumidity() {
        return humidity;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}

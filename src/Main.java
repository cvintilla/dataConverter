import javax.xml.crypto.Data;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String incomingString = "[{\"date\":\"2012-04-16T20:58:30\",\"humidity\":11.8000,\"temp_in_f\":11.9000},\n" +
                "{\"date\":\"2013-04-16T20:58:30\",\"humidity\":11.8000,\"temp_in_f\":11.9000},\n" +
                "{\"date\":\"2014-04-16T20:58:30\",\"humidity\":11.8000,\"temp_in_f\":11.9000}]";

        DataConverter d = new DataConverter();
        Object o = d.DataConverter(incomingString);
    }
}

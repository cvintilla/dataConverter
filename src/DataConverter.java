import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DataConverter {
    public List<WeatherData> DataConverter(String incomingString) {
        List<WeatherData> data = new ArrayList<>();

        StringTokenizer s = new StringTokenizer(incomingString);
        String[] temp = new String[s.countTokens()];

        String delimiters = "\t,;.?!-:@[](){}_*/";

        int i = 0;
        while(s.hasMoreTokens()) {
            temp[i] = s.nextToken();

            for (int k = 0; k < temp[i].length(); k++) {
                for (int j = 0; j<delimiters.length(); j++) {
                    if (temp[i].charAt(k) == delimiters.charAt(j)) {
                        int startIndex = 0;
                        int endIndex = k;

                        String sub = temp[i].substring(0,endIndex);
                        String sub2 = temp[i].substring(endIndex+1,temp[i].length());
                        temp[i] = sub.concat(sub2);

                    }
                }
            }
            i++;
        }

        for (int l = 0; l < temp.length; l++) {
            //Timestamp.valueOf()
            String tempDate =  temp[l].substring(7,11) + "-" + temp[l].substring(11,13) + "-" + temp[l].substring(13,15)
                    + " " + temp[l].substring(16,18) + ":" + temp[l].substring(18,20) + ":" + temp[l].substring(20,22)
                    + ".000000";
            String tempHum = temp[l].substring(33,35) + "." + temp[l].substring(36,39);
            String temp_f = temp[l].substring(48, 50) + "." + temp[l].substring(50, 53);

            WeatherData d = new WeatherData(Timestamp.valueOf(tempDate), Double.parseDouble(tempHum), Double.parseDouble(temp_f));
            data.add(d);
        }

        System.out.println(data);
        return data;
    }
}

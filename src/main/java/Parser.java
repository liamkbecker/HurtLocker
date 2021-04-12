import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    /*public String output() throws Exception {

        String output = "";
        String text = (new Main()).readRawDataToString();
        String patternString = "[^##]";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        for (int i = 0; matcher.find(); i++) {
            output = output + matcher.group();
            if(text.matches("##")){
                output = output + "\n";
            }
        }

        return output;

    }*/

    public int countOccurences(String str) throws Exception {

        int output = 0;
        String text = (new Main()).readRawDataToString().toLowerCase();
        String patternString = str;

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        for (int i = 0; matcher.find(); i++) {
            output++;
        }

        return output;

    }


}

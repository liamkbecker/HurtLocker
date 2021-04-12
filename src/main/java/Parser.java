import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public int countOccurrences(String str) throws Exception {

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

    public String givenAfter() throws Exception {

        String output = "";
        String text = (new Main()).readRawDataToString().toLowerCase();
        String patternString = "name:";

        ArrayList<Integer> checkStarts = new ArrayList<Integer>();
        ArrayList<Integer> checkEnds = new ArrayList<Integer>();

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        for (int i = 0; matcher.find(); i++) {
            checkStarts.add(matcher.end());
            checkEnds.add(matcher.start());
        }

        for(int i = 0; i < checkEnds.size(); i++){
            for(int j = checkStarts.get(i); j < checkEnds.get(i); j++){
                output = output + text.charAt(i);
            }
            output = output + "\n";
        }

        return output;

    }


}

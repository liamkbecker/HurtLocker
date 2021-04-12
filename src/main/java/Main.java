import org.apache.commons.io.IOUtils;
import java.io.IOException;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{

        Workflow w = new Workflow();
        System.out.println(w.build());

        //Parser p = new Parser();
        //System.out.println(p.givenAfter());

    }
}

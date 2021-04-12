public class Workflow {

    Parser parser = new Parser();
    String output = "";

    public String build() throws Exception {

        stmtAppears("milk");
        stmtAppears("apples");
        stmtAppears("cookies");
        stmtAppears("bread");

        output = output + "\n";

        stmtAppears("3.23");
        stmtAppears("1.23");
        stmtAppears("2.25");
        stmtAppears("0.25");
        stmtAppears("0.23");

        output = output + "\n";

        stmtAppears(":;");

        return output;

    }

    public void stmtAppears(String item) throws Exception {
        output = output + item + " appears " + parser.countOccurrences(item) + " times.\n";
    }

}

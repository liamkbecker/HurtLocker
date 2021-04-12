public class Workflow {

    Parser parser = new Parser();
    String output = "";

    public String build() throws Exception {

        stmtAppears("milk");
        stmtAppears("apples");
        stmtAppears("cookies");
        stmtAppears("bread");

        return output;

    }

    public void stmtAppears(String item) throws Exception {
        output = output + item + " appears " + parser.countOccurences(item) + " times.\n";
    }

}

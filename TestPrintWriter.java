import java.io.PrintWriter;

public class TestPrintWriter {
    public static void main(String[] args) {
        char someData[] = {'J','a','v','a'};
        char someData1[] = {'J','a','v','a'};
        double d = 128.128d;

        PrintWriter pw = new PrintWriter(System.out,true);
        System.out.println("PrintWriter pw has been opened");
        pw.println("Writing a string with PrintWriter.");
        pw.println("Writing a char array with PrintWriter: " + someData);
        pw.println("Writing an internationalized char array with PrintWriter: " + someData1);
        pw.println("Writing a double primitive with PrintWriter: " + d);

    }
}

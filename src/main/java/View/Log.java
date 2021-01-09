package View;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Log {
    private final static String LOG_PATH = "Log";


    public static File addMoneyLog() throws FileNotFoundException {
        File log = new File("log.txt");
        PrintWriter writer = new PrintWriter(log);
        writer.println();


        // create a file called log.txt
        // generate a line in the file for each amount of money added in keeping a total
        //generate a line telling each item bought from each slot
        // generate lane with change is giving
        return log;
    }

    public static File purchaseLog() throws FileNotFoundException {
        File log = new File("log.txt");
        PrintWriter writer = new PrintWriter(log);
        writer.println();


        // create a file called log.txt
        // generate a line in the file for each amount of money added in keeping a total
        //generate a line telling each item bought from each slot
        // generate lane with change is giving
        return log;
    }

    public static File endTransactionLog() throws FileNotFoundException {
        File log = new File("log.txt");
        PrintWriter writer = new PrintWriter(log);
        writer.println();


        // create a file called log.txt
        // generate a line in the file for each amount of money added in keeping a total
        //generate a line telling each item bought from each slot
        // generate lane with change is giving
        return log;
    }
}
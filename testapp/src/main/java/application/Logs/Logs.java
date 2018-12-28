package application.Logs;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * This is a simple class for creating log files and writing Exception situation.
 * @see Logs
 * @see #setLog(String)
 * @see #printLog(Exception)
 * @author Roman Borysenko ramzes198725@gmail.com
 */
public class Logs {
    private  Logger log;
    private  FileHandler fh;

    /**
     * Create Logger and file where was stored all exception situations.
     * @param classes path to log-file
     * @return Logger
     */
    public  Logger setLog(String classes){
        log = Logger.getLogger(classes);
        try {
            fh = new FileHandler(classes);
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return log;
    }

    /**
     * Writing exception situation in the log-file which was created by setLog(String) method.
     * @param e exception which was at runtime
     * @see #setLog(String)
     */
    public void printLog(Exception e) {
        Writer buffer = new StringWriter();
        PrintWriter pw = new PrintWriter(buffer);
        e.printStackTrace(pw);
        log.warning(buffer.toString());
        fh.close();
    }
}
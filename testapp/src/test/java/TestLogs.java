import application.Logs.Logs;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.util.logging.Logger;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestLogs {
    private Logs log;
    private String logPath;

    @Before
    public void init() {
        log = new Logs();
        logPath =  "src\\test\\Logs\\" + TestLogs.class.getSimpleName() + ".log";
    }

    @Test
    public void testSetLog() {
        Logger logTest = log.setLog(logPath);
        assertNotNull(logTest);
    }

    @Test
    public void testPrintLog() {
        Logger logTest = log.setLog(logPath);
        try {
            throw new RuntimeException();
        } catch(Exception e) {
            log.printLog(e);
            File file = new File(logPath);
            assertTrue(file.exists());
        }
    }

}
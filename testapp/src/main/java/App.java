import application.Logs.Logs;
import application.create.FullDocument;
import application.document.Document;
import application.document.impl.DocumentBody;
import application.document.impl.DocumentHeader;
import application.model.Header;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * This is a Main class for treatment 2 files and building XML file
 * based on the data of these files.
 * @see App
 * @see #main(String[])
 * @author Roman Borysenko ramzes198725@gmail.com
 */
public class App {

    /**
     * Method for creating XML file based on the data from 2 files
     * using marshalling and unmarshalling functions.<br/>
     * For running this program you must open terminal and execute next code:<br/>
     *          java -jar test-app-1.0-SNAPSHOT.jar [p1 p2 p3].<br/>
     * p1 - File which contains header of xml document<br/>
     * p2 - File which contains body of xml document<br/>
     * p3 - XML file where to writes your data from p1 and p2<br/>
     * By default:<br/>
     * p1 = "src\\main\\resources\\files\\string1.txt"<br/>
     * p2 = "src\\main\\resources\\files\\string2.txt"<br/>
     * p3 = "src\\main\\resources\\files\\full.xml"<br/>
     * @param args String array of parameters.
     * */
    public static void main(String[] args) {
        String[] path;
        path = setPath(args);
        Logs log = setLog();
        FullDocument fd = new FullDocument();
        fd.setBf("351");
        fd.setLen("10302");
        Document dh = new DocumentHeader();
        dh.createObject(path[0]);
        Document db = new DocumentBody();
        db.createObject(path[1]);
        Header header = new Header();
        fd.setHeader(((DocumentHeader) dh).getObject());
        fd.setBody(((DocumentBody) db).getObject());
        File file = new File(path[2]);
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(FullDocument.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty("jaxb.fragment", Boolean.TRUE);
            marshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"windows-1251\"?>");
            marshaller.marshal(fd,file);
        } catch (JAXBException e) {
            log.printLog(e);
        }
    }

    private static Logs setLog() {
        String className = App.class.getSimpleName();
        String logPath =  "src\\main\\resources\\Logs\\" + className + ".log";
        Logs log =  new Logs();
        log.setLog(logPath);
        return log;
    }

    private static String[] setPath(String[] args) {
        String[] path = {
                "src\\main\\resources\\files\\string1.txt",
                "src\\main\\resources\\files\\string2.txt",
                "src\\main\\resources\\files\\full.xml"
        };
        if(args.length == 3) {
            path = args;
        }
        return path;
    }
}
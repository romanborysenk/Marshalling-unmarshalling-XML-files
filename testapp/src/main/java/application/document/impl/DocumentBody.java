package application.document.impl;

import application.Logs.Logs;
import application.document.Document;
import application.model.Body;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * This is a simple class for creating Body of XML document.
 * @see DocumentBody
 * @see #DocumentBody()
 * @see #createObject(String)
 * @see #getObject()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
public class DocumentBody implements Document {
    private Body body;
    private String logPath;
    private static Logs log;

    /**
     * Creating instance class DocumentBody and Logs.<br>
     * Specify where will be file log for writing all exception situation
     * which have arisen during the program work with class DocumentBody.<br>
     * It will be at "src\\main\\resources\\Logs\\DocumentBody.log"
     * */
    public DocumentBody() {
        String className = DocumentBody.class.getSimpleName();
        logPath =  "src\\main\\resources\\Logs\\" + className + ".log";
        log =  new Logs();
        log.setLog(logPath);
    }

    /**
     * Method for creating body of XML document<br>
     * If was Exception situation during run then writing logs at log.file<
     * @param filePath path to txt-file and has type String
     * @see Body
     */
    @Override
    public void createObject(String filePath) {
        File file = new File(filePath);
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Body.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            body = (Body) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            log.printLog(e);
        }
    }

    /**
     * Method for receive Body object which was created by using method createObject
     * @see #createObject(String)
     * @return Body which was created
     * @see application.model.Body
     * */
    @Override
    public Body getObject() {
        return body;
    }
}
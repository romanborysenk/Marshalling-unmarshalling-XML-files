package application.document.impl;

import application.Logs.Logs;
import application.document.Document;
import application.model.Header;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * This is a simple class for creating Header of XML document.
 * @see DocumentHeader
 * @see #DocumentHeader()
 * @see #createObject(String)
 * @see #getObject()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
public class DocumentHeader implements Document {
    private Header header;
    private Logs log;
    private String logPath;

    /**
     * Creating instance class DocumentHeader and Logs.<br>
     * Specify where will be file log for writing all exception situation
     * which have arisen during the program work with class DocumentHeader.<br>
     * It will be at "src\\main\\resources\\Logs\\DocumentHeader.log"
     * */
    public DocumentHeader() {
        String className = DocumentHeader.class.getSimpleName();
        logPath =  "src\\main\\resources\\Logs\\" + className + ".log";
        log = new Logs();
        log.setLog(logPath);
    }

    /**
     * Method for creating header of XML document<br>
     * If was Exception situation during run then writing logs at log.file<br>
     * @param filePath path to txt-file and has type String
     * @see Header
     */
    @Override
    public  void createObject(String filePath) {
        File file = new File(filePath);
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Header.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            header = (Header) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            log.printLog(e);
        }
    }

    /**
     * Method for receive Header object which was created by using method createObject
     * @see #createObject(String)
     * @return Header which was created
     * @see application.model.Header
     * */
    @Override
    public Header getObject() {
        return header;
    }
}
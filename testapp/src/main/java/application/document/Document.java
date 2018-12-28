package application.document;

/**
 * This is an interface for creating body and header of XML document.
 * @see Document
 * @see #createObject(String)
 * @see #getObject()
 * @author Roman Borysenko ramzes198725@gmail.com
 */
public interface Document <T> {
     /**
      * Method for creating object(body or header of XML document).
      * @param filePath path to txt-file and has type String
      * */
     void createObject(String filePath);
     /**
      * Method for receive object which was created by using method createObject
      * @see #createObject(String)
      * @return Object which was created it may be type Body or Header
      * @see application.model.Body
      * @see application.model.Header
      * */
     T getObject();
}
import application.document.impl.DocumentHeader;
import application.model.Header;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestDocumentHeader {
    private DocumentHeader dh;
    private final String path = "src\\main\\resources\\files\\string1.txt";
    private Header header;

    @Before
    public void init() {
        dh = new DocumentHeader();
    }

    @Test
    public void testGetObject() {
        assertNull(dh.getObject());
    }

    @Test
    public void testCreateObject() {
        dh.createObject(path);
        assertNotNull(getObject(dh));
    }

    @Test
    public void testCreateObjectValues() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        dh.createObject(path);
        header = getObject(dh);
        List<String> listHeader, listCheck;
        listHeader = setArray();
        listCheck = new ArrayList<>();
        String[] a = {"0","3","5","ТОВ \"ППЛ 33-35\"","1076","107635450","","","20181211T112605","0","1"};
        for(int i = 0; i < a.length;i++) {
            listCheck.add(a[i]);
        }
        assertEquals(listCheck,listHeader);
    }

    public Header getObject(DocumentHeader dh) {
        return dh.getObject();
    }

    public List<String> setArray() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        List<String> list = new ArrayList<>();
        Field[] fields = header.getClass().getDeclaredFields();
        for(Field f: fields) {
            String nameMethod;
            nameMethod = "get";
            nameMethod = nameMethod + f.getName().substring(0,1).toUpperCase();
            nameMethod = nameMethod + f.getName().substring(1);
            Method method = Header.class.getMethod(nameMethod);
            String value = (String) method.invoke(header);
            list.add(value);
        }
        return list;
    }
}
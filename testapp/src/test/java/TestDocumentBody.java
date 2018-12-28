import application.document.impl.DocumentBody;
import application.model.Bill;
import application.model.Body;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TestDocumentBody {
    private DocumentBody db;
    private final String path = "src\\main\\resources\\files\\string2.txt";
    private Body body;

    @Before
    public void init() {
        db = new DocumentBody();
    }

    @Test
    public void testGetObject() {
        assertNull(db.getObject());
    }

    @Test
    public void testCreateObject() {
        db.createObject(path);
        assertNotNull(getObject(db));
    }

    @Test
    public void testCreateObjectValues() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        db.createObject(path);
        body = getObject(db);
        List<String> listHeader, listCheck;
        listHeader = setArray("bills");
        listCheck = new ArrayList<>();
        String[] a = {"1","2749012","344553","KAT   December testing ship","38156292"};
        for(int i = 0; i < a.length;i++) {
            listCheck.add(a[i]);
        }
        assertEquals(listCheck,listHeader);
    }

    @Test
    public void testGetValueInBill() {
        db.createObject(path);
        body = getObject(db);
        List<Bill> list = body.getBill();
        for(Bill b: list) {
            assertEquals(b.getBillDate(),"20181201");
        }
    }

    public Body getObject(DocumentBody db) {
        return db.getObject();
    }

    public List<String> setArray(String name) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        List<String> list = new ArrayList<>();
        Field[] fields = body.getClass().getDeclaredFields();
        for(Field f: fields) {
            if(!f.getName().equals(name)) {
                String nameMethod;
                nameMethod = "get";
                nameMethod = nameMethod + f.getName().substring(0, 1).toUpperCase();
                nameMethod = nameMethod + f.getName().substring(1);
                Method method = Body.class.getMethod(nameMethod);
                String value = (String) method.invoke(body);
                list.add(value);
            }
        }
        return list;
    }
}
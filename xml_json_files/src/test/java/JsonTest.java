import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class JsonTest {
    @Test
    public void testCreatingJSONObject() {
        JSONObject jo = new JSONObject();
        jo.put("username","admin");
        jo.put("password","strong");
        assertEquals( "{\"password\":\"strong\",\"username\":\"admin\"}", jo.toString());
    }

    @Test
    public void testConvertingMap() {
        Map<String, String> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","strong");
        JSONObject jo = new JSONObject(map);
        assertEquals( "{\"password\":\"strong\",\"username\":\"admin\"}", jo.toString());
    }

    @Test
    public void testObjectSerialization() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("strong");
        JSONObject jo = new JSONObject(user);
        assertEquals( "{\"password\":\"strong\",\"username\":\"admin\"}", jo.toString());
    }

    @Test
    public void testJSonArray(){
        JSONArray ja = new JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("lorem ipsum");

        JSONObject jo = new JSONObject();
        jo.put("name", "jon doe");
        jo.put("age", "22");
        jo.put("city", "chicago");

        ja.put(jo);

        assertEquals( "[true,\"lorem ipsum\",{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}]", ja.toString());
    }

    @Test
    public void testParsingJSon(){
        JSONObject jo = new JSONObject(
                "{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}"
        );
        assertEquals( "chicago",  jo.get("city"));
    }
}

package jsonUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class comparejson1 {
    public static void main(String[] args) {
        //objectsEqual()
        String s="abc";
        System.out.println(s );
    }


    public static Object objectsEqual(JSONObject obj1,JSONObject obj2)
    {
        JSONObject diff = new JSONObject();

        if (!obj1.getClass().equals(obj2.getClass())) {
            return diff;
        }

        return diff;

    }
}

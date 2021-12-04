package jsonUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class compareJson {
    public static void main(String[] args) {

        String json1="{\"name\":\"Shyam\", \"email\":\"shyamjaiswal@gmail.com\"}";
        String json2="{\"name\":\"Bob\", \"email\":\"bob32@gmail.com\"}";;
        Object jsonObj1=new JSONObject(json1);
        Object jsonObj2=new JSONObject(json2);
        Object jsonDiff=jsonsEqual(jsonObj1,jsonObj2);
        System.out.println("Json Diff --- "+jsonDiff);
    }

    public static Object jsonsEqual(Object obj1, Object obj2) throws JSONException {

        JSONObject diff = new JSONObject();

        if (!obj1.getClass().equals(obj2.getClass())) {
            return diff;
        }

        if (obj1 instanceof JSONObject && obj2 instanceof JSONObject) {
            JSONObject jsonObj1 = (JSONObject) obj1;
            JSONObject jsonObj2 = (JSONObject) obj2;

            List<String> names = new ArrayList(Arrays.asList(JSONObject.getNames(jsonObj1)));
            List<String> names2 = new ArrayList(Arrays.asList(JSONObject.getNames(jsonObj2)));
            if (!names.containsAll(names2) && names2.removeAll(names)) {
                for (String fieldName : names2) {
                    if(jsonObj1.has(fieldName))
                        diff.put(fieldName, jsonObj1.get(fieldName));
                    else if(jsonObj2.has(fieldName))
                        diff.put(fieldName, jsonObj2.get(fieldName));
                }
                names2 = Arrays.asList(JSONObject.getNames(jsonObj2));
            }

            if (names.containsAll(names2)) {
                for (String fieldName : names) {
                    Object obj1FieldValue = jsonObj1.get(fieldName);
                    Object obj2FieldValue = jsonObj2.get(fieldName);
                    Object obj = jsonsEqual(obj1FieldValue, obj2FieldValue);
                    if (obj != null && !isEmptyObject(obj))
                        diff.put(fieldName, obj);
                }
            }
            return diff;
        } else if (obj1 instanceof JSONArray && obj2 instanceof JSONArray) {

            JSONArray obj1Array = (JSONArray) obj1;
            JSONArray obj2Array = (JSONArray) obj2;
            if (!obj1Array.toString().equals(obj2Array.toString())) {
                JSONArray diffArray = new JSONArray();
                for (int i = 0; i < obj1Array.length(); i++) {
                    Object obj = null;
                    matchFound: for (int j = 0; j < obj2Array.length(); j++) {
                        obj = jsonsEqual(obj1Array.get(i), obj2Array.get(j));
                        if (obj == null) {
                            break matchFound;
                        }
                    }
                    if (obj != null)
                        diffArray.put(obj);
                }
                if (diffArray.length() > 0)
                    return diffArray;
            }
        } else {
            if (!obj1.equals(obj2)) {
                return obj2;
            }
        }

        return null;
    }

    private static boolean isEmptyObject(Object obj) {
        if (obj == null)
            return true;
        String objData = obj.toString();
        if (objData.length() == 0)
            return true;
        if (objData.equalsIgnoreCase("{}"))
            return true;
        return false;
    }

}

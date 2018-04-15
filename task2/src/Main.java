
import java.util.*;


public class Main {

    public static void main(String[] args){

        System.out.println(getDataFromProperty());
    }
    private static Map<String, String> getDataFromProperty(){

        Map<String, String> propertyMap = new HashMap<>();
        ResourceBundle propertyResourceBundle = ResourceBundle.getBundle("resources.some");
        Enumeration<String> keys = propertyResourceBundle.getKeys();

        while(keys.hasMoreElements()){
            String line = keys.nextElement();
            propertyMap.put(line,propertyResourceBundle.getString(line));
        }

        return propertyMap;
    }
}

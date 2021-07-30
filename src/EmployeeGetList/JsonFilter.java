package EmployeeGetList;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.json.JSONArray;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JsonFilter extends AbstractMediator {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonFilter.class);
    private static final String EMPLOYEE_FILE = "Get_emps.json";
    private static final String ID_FILE = "Get_emps_del.json";

    public boolean mediate(MessageContext context) {

        String PathEmployee = (String) context.getProperty("PathEmployee");
        String PathID = (String) context.getProperty("PathID");
        log.info("--===========JsonFilter===========--");
        String jsonResult = null;

        try {
            jsonResult = listMap_to_json_string(PathEmployee, PathID);
            context.setProperty("JsonFilter", jsonResult);

        } catch (ParseException | FileNotFoundException e) {
            log.info("jsonResult");
            log.debug("Message parse ex - " + e);
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {

        System.out.println(listMap_to_json_string(EMPLOYEE_FILE, ID_FILE));
    }

    private static List<Map<String, Object>> getEmployeeFilter(String employeePath, String idPath)
        throws ParseException, FileNotFoundException {

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(employeePath));
        Object IdDel = parser.parse(new FileReader(idPath));
        List<Map<String,Object>> employee = new ArrayList<>();

        String yourJsonString = obj.toString();
        String idJsonString = IdDel.toString();
        ReadContext delEmp = JsonPath.parse(idJsonString);
        String filterId = "$..EMP";
        List<Object> IdArr = delEmp.read(filterId, List.class);

        try {
            ReadContext ctx = JsonPath.parse(yourJsonString);
            ArrayList<String> filter = new ArrayList<>();
            for (int i = 0; i < IdArr.size(); i++) {
                filter.add("$.Employee[?(\"" + IdArr.get(i) + "\" in @.AdditionalFields[*].Value)]");
                employee.addAll(ctx.read(filter.get(i), List.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }

    public static String listMap_to_json_string(String employeePath, String idPath) throws FileNotFoundException, ParseException {

        List<Map<String, Object>> list = getEmployeeFilter(employeePath, idPath);
        JSONArray json_arr = new JSONArray();
        for (Map<String, Object> map : list) {
            JSONObject json_obj = new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                try {
                    json_obj.put(key,value);
                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            json_arr.put(json_obj);
        }
        return json_arr.toString();
    }
}
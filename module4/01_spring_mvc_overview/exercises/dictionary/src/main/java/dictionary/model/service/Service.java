package dictionary.model.service;

import java.util.HashMap;
import java.util.Map;

public class Service {
    Map<String,String> map=new HashMap<>();
    public Map<String,String> getMap(){
        map.put("name","tên");
        map.put("student","học sinh");
        map.put("dictionary","từ điển");
        map.put("teacher","giáo viên");
        return map;
    }

    public String translate(String string){
        Map<String,String> map =getMap();
        return map.get(string);
    }
}

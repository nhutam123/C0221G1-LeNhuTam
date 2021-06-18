package save_email.model.service;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements iService {
        static final List<String> languages = new ArrayList<>();
    static {
        languages.add("english");
        languages.add("vietnamese");
        languages.add("chinese");
        languages.add("japanese");
        languages.add("lao");
        languages.add("campuchia");
    }
    public List<String> returnList(){
        return languages;
    }
}

package sandwich_spice.model.service;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements iService {
    @Override
    public List<String> save(String[] lettuces) {
        List<String> list=new ArrayList<>();
        for (int i=0;i<lettuces.length;i++){
            list.add(lettuces[i]);
        }
        return list;
    }
}

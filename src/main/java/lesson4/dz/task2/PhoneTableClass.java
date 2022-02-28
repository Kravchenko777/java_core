package lesson4.dz.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneTableClass {

    private HashMap<String,String> stringStringHashMap = new HashMap<>();

    public void add(String phone, String fio){
        stringStringHashMap.put(phone,fio);
    }

    public String getPhoneByFIO(String fio){
        if(stringStringHashMap.containsValue(fio)){
            String result = "Phone numbers: ";
            for(String key: stringStringHashMap.keySet()){
                if(stringStringHashMap.get(key).equals(fio)) result += key + "; ";
            }
            return result;
        } else return "Can't find";

   }

   public Set<String> getPhoneByFIOStream(String fio){
       return stringStringHashMap.entrySet()
               .stream()
               .filter(entry -> Objects.equals(entry.getValue(), fio))
               .map(Map.Entry::getKey)
               .collect(Collectors.toSet());
   }
}

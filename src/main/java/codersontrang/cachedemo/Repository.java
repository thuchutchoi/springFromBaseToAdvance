package codersontrang.cachedemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class Repository {  

    @Cacheable("nameList")  
    public List<String> getNameList(){  
         System.out.println("Load name list....");  

         List<String> names = new ArrayList<String>();  
         names.add("Nguyen Van A");  
         names.add("Nguyen Van B");  
         names.add("Nguyen Van C");  

         return names;  
    }  

    @CacheEvict("nameList")  
    public void clearCache(){  
         System.out.println("Clear cache named nameList....");  
    }  
}  

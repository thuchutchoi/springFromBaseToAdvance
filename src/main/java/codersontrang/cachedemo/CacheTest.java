package codersontrang.cachedemo;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CacheTest {
    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beancache.xml");
	BeanFactory factory = context;
	Repository repository = (Repository) factory.getBean("repository");

	for (int i = 0; i < 10; i++) {
	    if (i == 5) {
		repository.clearCache();
	    }
	    List<String> names = repository.getNameList();
	    System.out.println("Size: " + names.size());
	}
    }
}

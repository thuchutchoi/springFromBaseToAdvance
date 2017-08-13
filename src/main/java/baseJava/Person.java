package baseJava;

import javax.annotation.processing.FilerException;

public class Person extends Wolf {
    public static void main(String[] args) {
	Person p = new Person();
	p.hunt();
    }

    public void hunt() {
	Wolf wolf = new Wolf(); // COMPILE ERROR
	try {
	    wolf.run();
	} catch (FilerException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} // ok
	wolf.type = 10;
	System.out.println(super.getType());
    }
}

package base2;

import javax.annotation.processing.FilerException;

import baseJava.Wolf;

public class Person extends Wolf {
    public static void main(String[] args) {
	Person p = new Person();
	p.hunt();
    }

    public void hunt() {
	Wolf wolf = new Wolf(); // COMPILE ERROR
	try {
	    super.run();
	} catch (FilerException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} // ok
	wolf.type = 10;
	System.out.println(wolf.getType());
    }

    @Override
    public void run() throws FilerException {
	super.run();
    }
}

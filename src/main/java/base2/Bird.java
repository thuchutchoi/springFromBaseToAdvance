package base2;

public class Bird {

    static {
	System.out.println("Bird's Static Init Block #1");
    }

    static {
	System.out.println("Bird's Static Init Block #2");
    }

    {
	System.out.println("Bird's Instance Init Block #1");
    }

    {
	System.out.println("Bird's Instance Init Block #2");
    }

    public Bird() {
	System.out.println("I'm a bird");
    }

    public void fly() {
	System.out.println("I'm flying");
    }
public static void main(String[] args) {
    Bird bird = new Bird();
    System.out.println("------------");
    Bird bird2 = new Bird();
}
}

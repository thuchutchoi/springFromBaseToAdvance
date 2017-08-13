package effective.singleton.private2.constructor.or.enum2;

// Singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();// public

    private Elvis() {
    }

    public void leaveTheBuilding() {
    }

    public static void main(String[] args) {
	Elvis elvis = Elvis.INSTANCE;
	Elvis2.getInstance();
	Elvis3 elvis3 = Elvis3.INSTANCE;
    }

    // readResolve method to preserve singleton property
    private Object readResolve() {
	// Return the one true Elvis and let the garbage collector
	// take care of the Elvis impersonator.
	return INSTANCE;
    }
}

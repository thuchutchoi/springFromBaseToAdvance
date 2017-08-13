package effective.singleton.private2.constructor.or.enum2;

public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();// private

    public static Elvis2 getInstance() {// factory method
	return INSTANCE;
    }

    private Elvis2() {
    }

    public void leaveTheBuilding() {
    }
}

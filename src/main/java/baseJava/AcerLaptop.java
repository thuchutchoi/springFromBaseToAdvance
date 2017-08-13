package baseJava;

public class AcerLaptop implements Laptop {
    @Override
    public String showTradeMark() {// Laptop method is access default but implement have must public
	return "Acer";
    }
}

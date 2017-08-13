package baseJava;

public class JavaKeyWord {
    public static void main(String[] args) {
	for (int i = 1; i < 100; i++) {// 3,5,7...99
	    if (i % 2 == 0) {
		continue;
	    }
	    // System.out.println(i);
	}
	int count = 1;
	while (count <= 100) {// 2,4,6,8,10......100
	    if (count % 2 != 0) {
		count++;
		continue;
	    }
	    System.out.println(count);
	    count++;
	}
	boolean a = false;
	boolean b = false;
	System.out.println(a && b);
	float c = 3 / 4;// 0.0
	System.out.println(c);
	float c2 = 3f / 4;// 0.75
	System.out.println(c2);
	float c3 = 3f / 4f;// 0.75
	System.out.println(c3);
	float c4 = 3 / 4f;// 0.75
	System.out.println(c4);
	int x = 2_147_483_647;
	x = x >> 3;
	System.out.println(x);// 268435455
	// x >> n = x / 2^n
	int y = 100;
	y = y << 3;
	System.out.println("y" + y);// 800
	// y=y*2^3
	int z = 20;
	z = z ^ 2;
	System.out.println(z);

    }
}

package baseJava;

import javax.annotation.processing.FilerException;

public class Wolf {
    public int type;

    public Wolf() {
	System.out.println("init contructor");
    }

    public int getType() {
	return type;
    }

    protected void run() throws FilerException {
	System.out.println("i am running");
    }

    public void setType(int type) {
	this.type = type;
    }
}

package com.wordpress.hautudu.autowiring;

public class LaptopStore3 {  
    private AcerLaptop laptop1;  
    private LenovoLaptop laptop2;  

    public LaptopStore3(AcerLaptop laptop1, LenovoLaptop laptop2){  
         this.laptop1 = laptop1;  
         this.laptop2 = laptop2;  
    }  

    public AcerLaptop getLaptop1() {  
         return laptop1;  
    }  
    public void setLaptop1(AcerLaptop laptop1) {  
         this.laptop1 = laptop1;  
    }  
    public LenovoLaptop getLaptop2() {  
         return laptop2;  
    }  
    public void setLaptop2(LenovoLaptop laptop2) {  
         this.laptop2 = laptop2;  
    }  
}  

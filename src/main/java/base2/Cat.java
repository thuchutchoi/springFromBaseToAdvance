package base2;

public class Cat extends Animal {
    public static void main(String[] args) {
	new Dog();
	// Animal anim = (Animal)dog;
	Animal anim = new Dog();
	anim.eat();
	Animal anim2 = new Cat();
	Cat cat = (Cat) anim2;
	cat.eat();
    }

    @Override
    public void eat() {
	System.out.println("Cat eat");
    }

    public void meow() {
	System.out.println("Meow Meow!");
    }
}

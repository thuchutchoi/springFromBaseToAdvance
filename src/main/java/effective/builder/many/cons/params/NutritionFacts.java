package effective.builder.many.cons.params;

// Telescoping constructor pattern - does not scale well!
public class NutritionFacts {
    public static void main(String[] args) {
	new NutritionFacts(240, 8, 100, 0, 35, 27);// Telescoping constructor pattern
	NutritionFacts cocaCola = new NutritionFacts();// JavaBeans Pattern - allows inconsistency, mandates mutability
	cocaCola.setServingSize(240);
	cocaCola.setServings(8);
	cocaCola.setCalories(100);
	cocaCola.setSodium(35);
	cocaCola.setCarbohydrate(27);
    }

    // if have key final, when using JavaBeans Pattern - allows inconsistency, mandates mutability
    // must init value for field, create a constructor with empty param, and get set method.
    private int calories = 0;// optional
    private int carbohydrate = 0; // (g) optional
    private int fat = 0;// (g) optional
    private int servings = -1;// (per container) required
    private int servingSize = -1; // (mL) required

    private int sodium = 0;// (mg) optional

    public NutritionFacts() {
    }

    public NutritionFacts(int servingSize, int servings) {
	this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
	this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
	this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
	this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
	this.servingSize = servingSize;
	this.servings = servings;
	this.calories = calories;
	this.fat = fat;
	this.sodium = sodium;
	this.carbohydrate = carbohydrate;
    }

    public int getCalories() {
	return calories;
    }

    public int getCarbohydrate() {
	return carbohydrate;
    }

    public int getFat() {
	return fat;
    }

    public int getServings() {
	return servings;
    }

    public int getServingSize() {
	return servingSize;
    }

    public int getSodium() {
	return sodium;
    }

    public void setCalories(int calories) {
	this.calories = calories;
    }

    public void setCarbohydrate(int carbohydrate) {
	this.carbohydrate = carbohydrate;
    }

    public void setFat(int fat) {
	this.fat = fat;
    }

    public void setServings(int servings) {
	this.servings = servings;
    }

    public void setServingSize(int servingSize) {
	this.servingSize = servingSize;
    }

    public void setSodium(int sodium) {
	this.sodium = sodium;
    }

}

package effective.builder.many.cons.params;

// Builder Pattern
public class NutritionFactsBuilder {
    public static class Builder {
	// Optional parameters - initialized to default values
	private int calories = 0;
	private int carbohydrate = 0;
	private int fat = 0;
	private final int servings;
	// Required parameters
	private final int servingSize;
	private int sodium = 0;

	public Builder(int servingSize, int servings) {
	    this.servingSize = servingSize;
	    this.servings = servings;
	}

	public NutritionFactsBuilder build() {
	    return new NutritionFactsBuilder(this);
	}

	public Builder calories(int val) {
	    calories = val;
	    return this;
	}

	public Builder carbohydrate(int val) {
	    carbohydrate = val;
	    return this;
	}

	public Builder fat(int val) {
	    fat = val;
	    return this;
	}

	public Builder sodium(int val) {
	    sodium = val;
	    return this;
	}
    }

    public static void main(String[] args) {

	new NutritionFactsBuilder.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
    }

    private NutritionFactsBuilder(Builder builder) {
    }
}
import java.util.ArrayList;
import java.util.Arrays;

public class IngredientCollection {
	private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	// Create default constructor
	public IngredientCollection() {
		this.ingredients = new ArrayList<Ingredient>();
	}
	
	// Create an addIngredientToCollection method
	public void addIngredientToCollection(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	public void removeIngredientFromCollection(Ingredient ingredient) {
		ingredients.remove(ingredient);
	}
	public void printIngredientCollection() {
		System.out.println(ingredients);
	}

	
}

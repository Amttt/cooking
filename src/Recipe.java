import java.util.ArrayList;
import java.util.Arrays;

public class Recipe extends IngredientCollection {
	private String recipeName;
	private IngredientCollection ingredients;
	
	public Recipe(String recipeName) {
		this.recipeName = recipeName;
		this.ingredients = new IngredientCollection();
	}

	// Create a new recipe
	public void createRecipe(String recipeName) {
		IngredientCollection ingredients = new IngredientCollection();
	}
	public void printRecipe(String recipeName) {
		System.out.println(ingredients);
	}

	@Override
	public String toString() {
		return "Recipe [recipeName=" + recipeName + ", ingredients=" + ingredients + "]";
	}
	
}

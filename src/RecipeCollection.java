
public class RecipeCollection {
	public static final int DEFAULT_SIZE = 20;
	private Recipe[] recipes;
	
	public RecipeCollection() {
		this.recipes = new Recipe[DEFAULT_SIZE];
	}
	
	// Method to add a new recipe entry
	public void addRecipe(Recipe recipe) {
		if(recipe == null)
			return;
		if(recipes[recipes.length-1] != null)
			return;
		// Find the first null element and add the recipe there
		for(int i=0;i<recipes.length;i++) {
			if(recipes[i] == null) {
				recipes[i] = recipe;
				break;
			}
		}
	}
	
	// Method to remove a recipe entry
	public void removeRecipe(Recipe recipe) {
		boolean recipeRemoved = false;
		
		// Search for recipe entry to be removed
		for(int i=0;i<recipes.length;i++) {
			if(recipe.equals(recipes[i])) // Found recipe to be removed
			{
				System.out.println(recipe + " has been removed from the cookbook.");
				recipes[i] = null;
				recipeRemoved = true;
			}
		}
		if(recipeRemoved != true)
			System.out.println("Recipe was not found.");
	}
	
	// Method to print the recipe entries
	public void printRecipe(String recipeName)
	{
		for(int i=0;i<recipes.length;i++) {
			if(recipes[i] != null)
				System.out.println(recipes[i].toString());
		}
		if(recipes[0] == null)
			System.out.println("The cookbook is empty");
	}
	
	
	
	
	
}

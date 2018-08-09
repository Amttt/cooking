import java.util.Scanner;

public class CookbookFrontEnd {

	public static final int DEFAULT_SIZE = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		IngredientCollection ingredientList = new IngredientCollection();
		//RecipeCollection manager = new RecipeCollection();
		System.out.println("Welcome to Ann-Marie's cookbook.");
		boolean quit = false;
		
		// Begin Cookbook editing 
		while(quit == false) {
			System.out.println("Enter 1 to add an ingredient to the collection\n"+
								"Enter 2 to create a recipe\n"+
								"Enter 3 to print a recipe by name\n"+
								"Enter 4 to remove a recipe by name\n"+
								"Enter 5 to print all of the recipes by name\n"+
								"Enter 6 to show the nutrition info for a recipe by name\n"+
								"Enter 9 to quit");
			int choice = keyboard.nextInt();
			keyboard.nextLine(); // Fix Java bug
			
			String foodName, servingType, recipeName;
			double calories, fat, protein, carbs, fiber;
			boolean recipeDone = false;
			
			switch(choice) {
			case 1: // Creating an ingredient and storing it in a master collection of ingredients
				System.out.println("Enter the ingredient's information:\n"
						+ "Name, Serving Type, Calories, Fat, Protein, Carbs, Fiber");
				foodName = keyboard.nextLine();
				servingType = keyboard.nextLine();
				calories = keyboard.nextDouble();
				fat = keyboard.nextDouble();
				protein = keyboard.nextDouble();
				carbs = keyboard.nextDouble();
				fiber = keyboard.nextDouble();
				Ingredient newIngredient = new Ingredient(foodName, servingType, calories, fat, protein, carbs, fiber);
				ingredientList.addIngredientToCollection(newIngredient);
				ingredientList.printIngredientCollection();
				
			case 2: // Creating a recipe and storing it in a master collection of recipes
				System.out.println("Enter the recipe name.");
				recipeName = keyboard.nextLine();
				Recipe newRecipe = new Recipe(recipeName);
				newRecipe.createRecipe(recipeName);
				System.out.println("What are the ingredients? Type 'done' when recipe is completed.");
				while(recipeDone != true) {
					foodName = keyboard.nextLine();
					if(foodName.toLowerCase().equals("done"))
							recipeDone = true;
					Ingredient ingredient = new Ingredient(foodName);
					newRecipe.addIngredientToCollection(ingredient);
				}
				newRecipe.printRecipe(recipeName);
			}

		}
	}

}

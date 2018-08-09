
public class Ingredient {
	// Initialize variables
	private String foodName;
	private String servingType;
	private double calories;
	private double fat;
	private double protein;
	private double carbs;
	private double fiber;
	
	// Create a default constructor
	public Ingredient() {
		this.foodName = "Unknown";
		this.servingType = "Unknown";
		this.calories = 0.00;
		this.fat = 0.00;
		this.protein = 0.00;
		this.carbs = 0.00;
		this.fiber = 0.00;
	}
	public Ingredient(String foodName) {
		this.foodName = foodName;
	}
	// Create a parameterized constructor
	public Ingredient(String foodName, String servingType, double calories, double fat, double protein, double carbs, double fiber) {
		this.foodName = foodName;
		this.servingType = servingType;
		this.calories = calories;
		this.fat = fat;
		this.protein = protein;
		this.carbs = carbs;
		this.fiber = fiber;
	}
	
	// Create getters and setters
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getServingType() {
		return servingType;
	}
	public void setServingType(String servingType) {
		this.servingType = servingType;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		if(calories >= 0) 
			this.calories = calories;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		if(fat >= 0.00)
			this.fat = fat;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		if(protein >= 0.00)
			this.protein = protein;
	}
	public double getCarbs() {
		return carbs;
	}
	public void setCarbs(double carbs) {
		if(carbs >= 0.00)
			this.carbs = carbs;
	}
	public double getFiber() {
		return fiber;
	}
	public void setFiber(double fiber) {
		if(fiber >= 0.00)
			this.fiber = fiber;
	}

	// Create a toString method
//	public String toString() {
//		return "foodName=" + foodName + ", servingType=" + servingType + ", calories=" + calories + ", fat="
//				+ fat + ", protein=" + protein + ", carbs=" + carbs + ", fiber=" + fiber + "\n";
//	}
	public String toString() {
		return "Food Name: "+foodName+"\n"+
				"Serving Type: "+servingType+"\n"+
				"Calories: "+calories+"\n"+
				"Fat: "+fat+"\n"+
				"Protein: "+protein+"\n"+
				"Carbs: "+carbs+"\n"+
				"Fiber: "+fiber+"\n";
	}
	
	
}

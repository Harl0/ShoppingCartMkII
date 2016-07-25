package main.java;

/**
 *
 * @author Jason
 */
public class ShoppingCart {

	// global variables
	public static String special_offer = "off";

	public static int apple_value = 25;
	public static int orange_value = 60;

	public static int twoForOne = 2;
	public static int threeForTwo = 3;

	public static void main(String[] args) {

		String[] fruits = { "orange", "orange" }; // use String array for input

		// method call to pass fruits into calculateFruits
		double total_basket_cost = calculateFruits(fruits);
		System.out.format("Cost to customer: £%.2f%n", total_basket_cost / 100);

	}

	// method to calculate how many of each fruit and return total cost
	public static double calculateFruits(String[] fruits) {
		int apple_count = 0;
		int orange_count = 0;

		// accepts fruits array, calculates how many apples and oranges
		for (String fruit : fruits) {
			// apple count
			if (fruit.equalsIgnoreCase("apple")) {
				apple_count++;
			}
			// orange count
			if (fruit.equalsIgnoreCase("orange")) {
				orange_count++;
			}

		}

		// Method calls to work out cost of items including any discounts
		int total_apple_cost = cost_of_items(twoForOne, apple_count, apple_value);
		int total_orange_cost = cost_of_items(threeForTwo, orange_count, orange_value);
		// Total cost of shop
		double total_basket_cost = total_basket_cost(total_apple_cost, total_orange_cost);

		return total_basket_cost;

	}

	// Calculate cost of items in shopping basket
	public static int cost_of_items(int deal, int item_count, int item_value) {

		int cost_to_customer = 0;

		// If special offer is on, work out discounts
		if (special_offer.equalsIgnoreCase("on")) {

			int timesDiscountTriggered = item_count / deal;
			int total_to_bill = item_count - timesDiscountTriggered;
			cost_to_customer = total_to_bill * item_value;

		} else {

			cost_to_customer = item_count * item_value;
		}

		return cost_to_customer;

	}

	// Calculate total cost of shop
	public static int total_basket_cost(int apple_total_cost, int orange_total_cost) {

		int basket_grand_total = apple_total_cost + orange_total_cost;
		return basket_grand_total;
	}

}

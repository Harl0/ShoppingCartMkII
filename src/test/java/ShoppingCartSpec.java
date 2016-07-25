package test.java;

//Imports
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import main.java.ShoppingCart;

public class ShoppingCartSpec {

	@Before
	public void initShoppingCart() {
		new ShoppingCart();
	}

	@Ignore
	@Test
	public void testItems() {
		ShoppingCart.special_offer = "off";
		int cost_to_customer = ShoppingCart.cost_of_items(2, 4, 2);
		assertEquals(8, cost_to_customer); // Testing cost_to_customer method
	}

	@Test
	public void testOranges() {
		ShoppingCart.special_offer = "off";
		String[] fruits = { "orange", "orange" };
		double calculateFruitList = ShoppingCart.calculateFruits(fruits);
		assertEquals(120, calculateFruitList, 0); // Testing orange calculation
	}

	@Test
	public void testApples() {
		ShoppingCart.special_offer = "off";
		String[] fruits = { "apple", "apple" };
		double calculateFruitList = ShoppingCart.calculateFruits(fruits);
		assertEquals(50, calculateFruitList, 0); // Testing apple calculation
	}

	@Test
	public void testApplesAndOranges() {
		ShoppingCart.special_offer = "off";
		String[] fruits = { "orange", "apple" };
		double calculateFruitList = ShoppingCart.calculateFruits(fruits);
		assertEquals(85, calculateFruitList, 0); // Testing apple and orange calculation
	}
	
	@Test
	public void testOrangesDeal() {
		ShoppingCart.special_offer = "on";
		String[] fruits = { "orange", "orange", "orange", "orange" };
		double calculateFruitList = ShoppingCart.calculateFruits(fruits);
		assertEquals(180, calculateFruitList, 0); // Testing orange deal calculation
	}

	@Test
	public void testApplesDeal() {
		ShoppingCart.special_offer = "on";
		String[] fruits = { "apple", "apple", "apple", "apple" };
		double calculateFruitList = ShoppingCart.calculateFruits(fruits);
		assertEquals(50, calculateFruitList, 0); // Testing apple deal calculation
	}

	@Test
	public void testApplesAndOrangesDeal() {
		ShoppingCart.special_offer = "on";
		String[] fruits = { "orange", "apple", "apple", "apple", "orange" };
		double calculateFruitList = ShoppingCart.calculateFruits(fruits);
		assertEquals(170, calculateFruitList, 0); // Testing apple and orange calculation
	}

}

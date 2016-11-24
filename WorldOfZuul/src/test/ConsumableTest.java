package test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import item.Consumable;
import item.Inventory;


/**
 * The test class ConsumableTest
 * Unit tests of the Consumable class
 * @author Group4
 * @version 22/11/2016
 *
 */
public class ConsumableTest
{
	private Consumable myConsumable;
	private Inventory myInventory;

	/**
	 * Sets up the test fixture.
	 * Called before every test case method.
	 * Initialize one consumable for each test, whose name is "Bread".
	 */
	@Before
	public void setUp()
	{
		myConsumable=new Consumable("Bread", "This bread was cooked by the baker of the village", 20, true, "This bread get 2 health points to the person who eats it", 0, 3, true);
		myInventory=new Inventory();
	}
	
	/**
	 * Tears down the test fixture.
	 * Called after every test case method. Nothing to do in this case.
	 */
	@After
	public void tearDown()
	{
	}

	/**
	 * Method testBread
	 * Checks if the name given as parameter in the constructor is correctly set to the attribute.
	 * 
	 */
	@Test
	public void testBread()
	{
		assertEquals("Bread",myConsumable.getName());
		assertEquals("This bread was cooked by the baker of the village",myConsumable.getDescription());
		assertEquals(20,myConsumable.getPrice());
		assertEquals("This bread get 2 health points to the person who eats it",myConsumable.getEffect());
		assertEquals(0,myConsumable.getCare());
		assertEquals(3,myConsumable.getDamage());
		assertEquals(true,myConsumable.getWeapon());
	}
	
	/**
	 * Method testDefault
	 * Checks the default parameters
	 * 
	 */
	@Test
	public void testDefault()
	{
		Consumable bad = new Consumable("", "", -10, true, "An effect",-2,-3,true);
		assertEquals("Unidentified object",bad.getName());
		assertEquals("This object seems strange and come from nowhere.",bad.getDescription());
		assertEquals(100,bad.getPrice());
		assertEquals("This bread get 2 health points to the person who eats it",myConsumable.getEffect());
		assertEquals(0,bad.getCare());
		assertEquals(0,bad.getDamage());
		assertEquals(false,bad.getWeapon());
	}
	
	/**
	 * Method testAddConsumableInInventory
	 * <p>Checks if the consumable is correctly added in an inventory</p>
	 */
	@Test
	public void testAddConsumableInInventory()
	{
		
	}
	
	/**
	 * Method testDeleteConsumableInInventory
	 * <p>Checks if the consumable is correctly deleted in an inventory</p>
	 */
	@Test
	public void testDeleteConsumableInInventory()
	{
		
	}
}

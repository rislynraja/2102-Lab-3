/*
	Classic testing method for System.out and System.err streams
	Seen on the Internet
*/
import java.lang.Math;
import static org.junit.Assert.*;

import java.beans.Transient;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class PizzaTests {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	PizzaInterface pizza; // cheese pizza
	PizzaInterface pizza2; // greek pizza
	PizzaInterface pizza3; // gluten free pizza
	PizzaInterface pizza4; // pepperoni pizza

	@Before
	public void setUp() throws Exception {
		pizza  = new CheesePizza();
		pizza2 = new GreekPizza();
		pizza3 = new GlutenFreePizza();
		pizza4 = new PepperoniPizza();
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
    }
	
	@After
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	public void outHelloCheck() {
		System.out.print("hello");
		assertEquals("hello", outContent.toString());
	}

	@Test
	public void errHelloAgain() {
		System.err.print("hello again");
		assertEquals("hello again", errContent.toString());
	}

	// CHEESE PIZZA TESTS BELOW
	@Test
	public void CheesePizzaTest_1() {
		pizza.prepare();
		String newString = outContent.toString();
		assertEquals("Preparing a cheese pizza\n", newString);
	}
  	@Test
	public void CheesePizzaTest_2() {
		pizza.bake();
		assertEquals("Baking a cheese pizza\n", outContent.toString());
	}
	@Test
	public void CheesePizzaTest_3() {
		pizza.cut();
		assertEquals("Cutting a cheese pizza\n", outContent.toString());
	}
	@Test
	public void CheesePizzaTest_4() {
		pizza.box();
		assertEquals("Boxing a cheese pizza\n", outContent.toString());
	}

	// GREEK PIZZA TESTS BELOW
	@Test
	public void GreekPizzaTest_1() {
		pizza2.prepare();
		assertEquals("Preparing a greek pizza\n", outContent.toString());
	}
	@Test
	public void GreekPizzaTest_2() {
		pizza2.bake();
		assertEquals("Baking a greek pizza\n", outContent.toString());
	}
	@Test
	public void GreekPizzaTest_3() {
		pizza2.cut();
		assertEquals("Cutting a greek pizza\n", outContent.toString());
	}
	@Test
	public void GreekPizzaTest_4() {
		pizza2.box();
		assertEquals("Boxing a greek pizza\n", outContent.toString());
	}

	// GLUTEN FREE PIZZA TESTS BELOW
	@Test
	public void GlutenFreePizzaTest_1() {
		pizza3.prepare();
		assertEquals("Preparing a gluten free pizza\n", outContent.toString());
	}
	@Test
	public void GlutenFreePizzaTest_2() {
		pizza3.bake();
		assertEquals("Baking a gluten free pizza\n", outContent.toString());
	}
	@Test
	public void GlutenFreePizzaTest_3() {
		pizza3.cut();
		assertEquals("Cutting a gluten free pizza\n", outContent.toString());
	}
	@Test
	public void GlutenFreePizzaTest_4() {
		pizza3.box();
		assertEquals("Boxing a gluten free pizza\n", outContent.toString());
	}

	// PEPPERONI PIZZA TESTS BELOW
	@Test
	public void PepperoniPizzaTest_1() {
		pizza4.prepare();
		assertEquals("Preparing a pepperoni pizza\n", outContent.toString());
	}
	@Test
	public void PepperoniPizzaTest_2() {
		pizza4.bake();
		assertEquals("Baking a pepperoni pizza\n", outContent.toString());
	}
	@Test
	public void PepperoniPizzaTest_3() {
		pizza4.cut();
		assertEquals("Cutting a pepperoni pizza\n", outContent.toString());
	}
	@Test
	public void PepperoniPizzaTest_4() {
		pizza4.box();
		assertEquals("Boxing a pepperoni pizza\n", outContent.toString());
	}

}

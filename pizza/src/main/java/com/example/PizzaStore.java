public class PizzaStore {

	public static void main(String[] args) {
		PizzaFactory pf = new PizzaFactory();

		// PizzaInterface myPizza = pf.makePizza(type: "Cheese");
        PizzaInterface myPizzaCheese = pf.makePizza("Cheese");
		PizzaInterface myPizzaGreek = pf.makePizza("Greek");
		PizzaInterface myPizzaGlutenFree = pf.makePizza("Gluten Free");
		PizzaInterface myPizzaPepperoni = pf.makePizza("Pepperoni");

        // Pizza store class must contain instance of factory

		myPizzaCheese.prepare();
		myPizzaCheese.bake();
		myPizzaCheese.cut();
		myPizzaCheese.box();

		myPizzaGreek.prepare();
		myPizzaGreek.bake();
		myPizzaGreek.cut();
		myPizzaGreek.box();

		myPizzaGlutenFree.prepare();
		myPizzaGlutenFree.bake();
		myPizzaGlutenFree.cut();
		myPizzaGlutenFree.box();

		myPizzaPepperoni.prepare();
		myPizzaPepperoni.bake();
		myPizzaPepperoni.cut();
		myPizzaPepperoni.box();

	}



}
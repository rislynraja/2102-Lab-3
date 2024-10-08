public class PizzaFactory {

	public PizzaInterface makePizza(String type) {
		if (null == type || type.isEmpty()) {
			System.err.println("No such pizza type");
			return null;
		}

		switch(type) {
			case "Cheese":
				return new CheesePizza();
			
			case "Greek":
				return new GreekPizza();
			
			case "Gluten Free":
				return new GlutenFreePizza();
			
			case "Pepperoni":
				return new PepperoniPizza();
				
			default:
				// System.out.println(x: "No such pizza type");
                System.out.println("No such pizza type");
				return null;

		}

	}


}
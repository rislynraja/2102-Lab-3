public class PepperoniPizza implements PizzaInterface{
    
    @Override
	public void prepare() {
        System.out.println("Preparing a pepperoni pizza");
	}

	@Override
	public void bake() {
        System.out.println("Baking a pepperoni pizza");
	}

	@Override
	public void cut() {
        System.out.println("Cutting a pepperoni pizza");
	}
	
	@Override
	public void box() {
        System.out.println("Boxing a pepperoni pizza");
	}

}

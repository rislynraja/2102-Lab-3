public class GlutenFreePizza implements PizzaInterface{

    @Override
	public void prepare() {
        System.out.println("Preparing a gluten free pizza");
	}

	@Override
	public void bake() {
        System.out.println("Baking a gluten free pizza");
	}

	@Override
	public void cut() {
        System.out.println("Cutting a gluten free pizza");
	}
	
	@Override
	public void box() {
        System.out.println("Boxing a gluten free pizza");
	}
}

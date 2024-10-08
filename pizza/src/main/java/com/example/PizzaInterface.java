public interface PizzaInterface {

    // prepare, bake, cut, and box will be in an interface 
    // and each separate type cheese, greek ,etc. will implement it

	void prepare();

	void bake();

	void cut();

	void box();

}
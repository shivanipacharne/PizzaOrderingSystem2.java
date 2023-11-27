package PizzaBillGenrator;

public class Main {

	public static void main(String[] args) {
		
		//Pizza basePizza=new Pizza(true);
		//basePizza.addExtraCheese();
		//basePizza.addExtraToppings();
		
		//basePizza.getBill();
		
		DeluxPizza dp=new DeluxPizza(true);
		dp.addExtraToppings();
		dp.takeAway();
	      dp.getBill();

	}

}

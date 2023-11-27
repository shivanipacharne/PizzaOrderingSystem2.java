package PizzaBillGenrator;

public class Pizza {
	private int Price;
	private boolean Veg;
	private int extraCheesePrice=100;
	private int extraToppingsPrice=150;
	private int backPackPrice=20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingsAdded=false;
	private boolean isExtraOptedForTakeAway=false;
	
	
	
	
	public Pizza (Boolean veg) {
		this.Veg=Veg;
		if(this.Veg) {
			this.Price=300;
		}else {
			this.Price=400;
			
		}
		basePizzaPrice=this.Price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded=true;
		System.out.println("Extra cheese Added");
		this.Price+=extraCheesePrice;
	}
	public void addExtraToppings() {
		isExtraToppingsAdded=true;
		System.out.println("Extra Topping Added");
		this.Price+=extraToppingsPrice;
	}
	public void takeAway() {
		isExtraOptedForTakeAway=true;
		System.out.println("Take away opted");
		this.Price+=backPackPrice;
	}
	public void getBill() {
		String bill="";
		System.out.println("Pizza:"+basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill+="Extra cheese added:"+extraCheesePrice+"\n";
		}
		if(isExtraToppingsAdded) {
			bill+="Extra Toppings added:"+extraToppingsPrice+"\n";
		}
			if(isExtraOptedForTakeAway) {
				bill+="Take Away:"+backPackPrice+"\n";
			}
			bill +="Bill:"+this.Price +"\n";
			System.out.println(bill);
		
	}

	
	

}

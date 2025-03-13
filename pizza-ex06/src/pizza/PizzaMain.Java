import java.util.Scanner;

public class PizzaMain {
	private Pizza pizza;
	private Scanner input;
	
	public PizzaMain() {
		pizza = new Pizza();
		input = new Scanner(System.in);
	}
	
	private void inputCrustChoice() {
		Boolean validChoice = false;
		System.out.println("What kind of crust would you like:");
		System.out.println("1 - Thin Crust");
		System.out.println("2 - Thick Crust");
		System.out.print("Your choice: ");
		while (!validChoice) {
			Integer choice = input.nextInt();
			switch(choice) {
				case 1: 
					pizza.setCrust(new ThinCrust());
					validChoice = true;
					break;
				case 2: 
					pizza.setCrust(new ThickCrust());
					validChoice = true;
					break;
				default:
					System.out.println("Pick between 1-2");
			}
		}
	}

	private void inputSauceChoice() {
		Boolean validChoice = false;
		System.out.println("What kind of sauce would you like:");
		System.out.println("1 - Tomato Sauce");
		System.out.println("2 - Alfredo Sauce");
		System.out.print("Your choice: ");
		while (!validChoice) {
			Integer choice = input.nextInt();
			switch(choice) {
				case 1: 
					pizza.setSauce(new TomatoSauce());
					validChoice = true;
					break;
				case 2: 
					pizza.setSauce(new AlfredoSauce());
					validChoice = true;
					break;
				default:
					System.out.println("Pick between 1-2");
			}
		}
	}

	private void inputToppingChoices() {
		System.out.print("How many toppings? ");
		Integer numToppings = input.nextInt();
		for (Integer i = 0; i < numToppings; i++) {
			Boolean validChoice = false;
			System.out.println("1 - Pepperoni");
			System.out.println("2 - Sausage");
			System.out.println("3 - Pepper");
			System.out.println("4 - Mushroom");
			System.out.println("5 - Mozzarella");
			System.out.println("6 - Asiago");
			System.out.println("7 - Ham");
			System.out.println("8 - Onion");
			System.out.println("9 - Bacon");
			System.out.println("10 - Olive");
			System.out.print("Your choice: ");
			while (!validChoice) {
				Integer choice = input.nextInt();
				switch(choice) {
					case 1: 
						pizza.addTopping(new PepperoniTopping());
						validChoice = true;
						break;
					case 2: 
						pizza.addTopping(new SausageTopping());
						validChoice = true;
						break;
					case 3: 
						pizza.addTopping(new PepperTopping());
						validChoice = true;
						break;
					case 4: 
						pizza.addTopping(new MushroomTopping());
						validChoice = true;
						break;
					case 5: 
						pizza.addTopping(new MozzarellaTopping());
						validChoice = true;
						break;
					case 6: 
						pizza.addTopping(new AsiagoTopping());
						validChoice = true;
						break;
					case 7: 
						pizza.addTopping(new HamTopping());
						validChoice = true;
						break;
					case 8: 
						pizza.addTopping(new OnionTopping());
						validChoice = true;
						break;
					case 9: 
						pizza.addTopping(new BaconTopping());
						validChoice = true;
						break;
					case 10: 
						pizza.addTopping(new OliveTopping());
						validChoice = true;
						break;
					default:
						System.out.println("Pick between 1-10");
				}
			}
		}
	}
	
	private void showPizza() {
		pizza.display();
	}
	
	public void runMenu() {
		inputCrustChoice();
		inputSauceChoice();
		inputToppingChoices();
		showPizza();
	}
	
	public static void main(String[] args) {
		PizzaMain pm = new PizzaMain();
		pm.runMenu();
	}
}

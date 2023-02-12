package Milestone2;

public class Product2 {
	static String name;
	static String Description;
	static int price;
	static int inventory;

		public static void Sword() {
			name = "Sword";
			Description = "A longsword to take out your enemy at close range";
			price = 250;
			inventory = 15;
			System.out.print("Item: " + name +"\nDescription: \n"+Description+"\n"+"\nInventory: " + inventory + "\nPrice: " + price+"\n\n");
			
		}
		public static void Shurikan() {
			name = "Shurikan";
			Description = "A throwing Shurikan to take out your enemy at long range ";
			price = 25;
			inventory = 750;
			System.out.print("Item: " + name +"\nDescription: \n"+Description+"\n"+  "\nInventory: " + inventory + "\nPrice: " + price+"\n\n");
			
		}
		public static void Helmet() {
			name = "Helmet";
			Description = "A helmet to pretect your head from hits";
			price = 150;
			inventory = 200;
			System.out.print("Item: " + name +"\nDescription: \n"+Description+"\n"+ "\nInventory: " + inventory + "\nPrice: " + price+"\n\n");
			
		}
		public static void Boots() {
			name = "Boots";
			Description = "Boots to lighten the damage of falling";
			price = 125;
			inventory = 175;
			System.out.print("Item: " + name +"\nDescription: \n"+Description+"\n"+ "\nInventory: " + inventory + "\nPrice: " + price+"\n\n");
			
		}
		public static void Health() {
			name = "Health potion";
			Description = "Completely refills your health";
			price = 50;
			inventory = 500;
			System.out.print("Item: " + name +"\nDescription: \n"+Description+"\n"+ "\nInventory: " + inventory + "\nPrice: " + price+"\n\n");
			
		}
	}



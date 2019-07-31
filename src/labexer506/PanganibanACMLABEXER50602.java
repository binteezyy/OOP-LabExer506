package labexer506;
import java.awt.*;
import java.applet.*;
 
public class PanganibanACMLABEXER50602 extends Frame{
	Choice entree, dessert;
	List beverage;

	 public PanganibanACMLABEXER50602() {
		 entree = new Choice();
		 entree.addItem("Golden Fried Shrimp");
		 entree.addItem("Beef with Oyster Sauce");
		 entree.addItem("Calamares");
		 entree.addItem("Chicken Curry");
		 entree.addItem("Lengua");
		 dessert = new Choice();
		 dessert.addItem("Blueberry Cheesecake");
		 dessert.addItem("Apple Pie");
		 dessert.addItem("Sansrival");
		 dessert.addItem("Leche Flan");
		 dessert.addItem("Chocolate Mousse");
		 beverage = new List(0,true);
		 beverage.addItem("Beers");
		 beverage.addItem("Rhum");
		 beverage.addItem("Wines");
		 beverage.addItem("Coffee/Tea");
		 beverage.addItem("Juices");
		 beverage.addItem("Vodka");
		 beverage.addItem("Zombie");
		 beverage.addItem("Mineral Water");
		 Panel p = new Panel();
		 p.setLayout(new GridLayout(2,1));
		 p.add(entree);
		 p.add(dessert);
		 add("West",p);
		 add("Center",beverage);
		 pack();
		 show();
		}
	 
	 public static void main(String[] args) {
		 new PanganibanACMLABEXER50602();
	 }
	 
}

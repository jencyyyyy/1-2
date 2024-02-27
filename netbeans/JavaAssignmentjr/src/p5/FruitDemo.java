package p5;

public class FruitDemo {

	public static void main(String[] args) {

		Mango mangoOne = new Mango("Fazli","khulna","sweet");

		mangoOne.getInfo();

		Mango mangoTwo = new Mango("Langra", "Rajshahi", "sweet-sour");

		System.out.println(mangoTwo);

		Mango mangoThree = new Mango("Maldhahi");

		mangoThree.getInfo();



		JackFruit jackFruitOne = new JackFruit("Aayi's Recipes", "Barisal", "sour");

	//	jackFruitOne.setPlace(mangoOne);

		jackFruitOne.getInfo();
	}
}

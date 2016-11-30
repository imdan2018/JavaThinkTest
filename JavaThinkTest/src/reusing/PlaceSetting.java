package reusing;

class Plate {
	Plate(int i) {
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

// ³ø·¿ÓÃ¾ß
class Utensil {
	Utensil(int i) {
		System.out.println("Utensil constructor");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		System.out.println("Fork constructor");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		System.out.println("Knife constructor");
	}
}


class Custom{
	Custom(int i){

		System.out.println("Custom constructor");
	}
}
public class PlaceSetting extends Custom {

	private Spoon spoon;
	private Fork fork;
	private Knife knife;
	private DinnerPlate plate;
	
	PlaceSetting(int i){
		super(i+1);
		spoon=new Spoon(i+2);
		fork=new Fork(i+3);
		knife = new Knife(i+4);
		plate=new DinnerPlate(i+5);
		System.out.println("PlaceSetting constructor");
	}
	public static void main(String[] args) {
		PlaceSetting xPlaceSetting = new PlaceSetting(9);

	}

}

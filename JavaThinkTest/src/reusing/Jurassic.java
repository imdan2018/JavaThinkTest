package reusing;

class SmallBrain {
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain xBrain = new SmallBrain();

	void f() {
	}
}

//class DinosaurSon extends Dinosaur { }

public class Jurassic {
	public static void main(String[] args) {
		Dinosaur nDinosaur = new Dinosaur();
		nDinosaur = new Dinosaur();
		nDinosaur.f();
		nDinosaur.i = 40;
		nDinosaur.j++;
	}
}

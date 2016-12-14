package polymorphism.music;

class Stringed extends Instrument{
	public void play(Note n){
		System.out.println("Stringed.play()" + n);
	}
}

class Brass extends Instrument{
	public void play(Note n){
		System.out.println("Brass.play()" + n);
	}
}


public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}

}


















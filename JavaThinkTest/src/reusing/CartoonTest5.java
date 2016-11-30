package reusing;
//A
class ArtTest {
	ArtTest() {
		System.out.println("Art constructor");
	}
}


//B
class MusicTest {
	MusicTest() {
		System.out.println("Music constructor");
	}
}

//C
class CartoonTest5 extends ArtTest {
	public static void main(String[] args) {
		MusicTest x = new MusicTest();

	}

}
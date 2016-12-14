package reusing;

class Poppet{
	private int i;
	Poppet(int ii){i=ii;}
}

public class BlankFinal {
	private final int i=0;
	private final int j;
	private final Poppet poppet;
	public BlankFinal(){
		j=1;
		poppet=new Poppet(1);
	}
	public BlankFinal(int x){
		j=x;
		poppet=new Poppet(x);
	}
	
		
	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);
	}

}

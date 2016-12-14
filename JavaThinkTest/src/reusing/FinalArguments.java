package reusing;

class Gizmo{
	public void spin(){}
}

public class FinalArguments {
	void with(final Gizmo g)
	{
		
	}
	
	void without(Gizmo g){
		g= new Gizmo();
		g.spin();
	}

	//void g2(final int i){ i++;}
	int g(final int i){return i+1;}
	public static void main(String[] args) {
		FinalArguments bFinalArguments = new FinalArguments();
		bFinalArguments.without(null);
		bFinalArguments.with(null);

	}

}

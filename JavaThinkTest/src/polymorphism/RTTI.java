package polymorphism;

class Useful{
	public void f(){}
	public void g(){}
}

class MoreUseful extends Useful{
	public void f(){}
	public void g(){}
	public void u(){}
	public void v(){}
	public void w(){}
} 
public class RTTI {

	public static void main(String[] args) {
		Useful[] xUsefuls={
				new Useful(),
				new MoreUseful()
		};
		xUsefuls[0].g();
		xUsefuls[1].g();

		((MoreUseful)xUsefuls[1]).u();
		((MoreUseful)xUsefuls[0]).u();

	}

}

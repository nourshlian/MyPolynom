package MyMath;

public class main {

	public static void main(String[] args) {
		Polynom p=new Polynom("0.2x^4-1.5x^3+3x^2-x-5");
		System.out.println(p.areaUnderX(-2, 6));
		p.Graph(-2, 6);
	}

}

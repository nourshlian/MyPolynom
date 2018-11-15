/**
 * 
 */
package MyMath;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

/**
 * @author Nour Ilya
 * this class tests both classes Monom and Polynom
 *
 */
class TestMyMath extends Polynom {
	private static Polynom p=new Polynom("-x^3+3x^2-5x-6");
	private static 	Monom m = new Monom(1,2);

	//	private static Polynom_able test =new Polynom();

	/**
	 * Test method for {@link MyMath.Polynom#Polynom(MyMath.Polynom)}.
	 */
	@Test
	void testPolynomPolynom() {
		Polynom_able test =new Polynom(p);
		if(!p.equals(test))
			fail("the copy constactor fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#Polynom(java.lang.String)}.
	 */
	@Test	void testPolynomString() {
		Polynom_able test =new Polynom();
		test.add(new Monom(-1,3));
		test.add(new Monom(3,2));
		test.add(new Monom(-5,1));
		test.add(new Monom(-6,0));
		if(!p.equals(test))
			fail("the String constactor Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#f(double)}.
	 */
	@Test
	void testF() {
		if(p.f(5)!=-81)
			fail("expected another result");
	}

	/**
	 * Test method for {@link MyMath.Polynom#add(MyMath.Polynom_able)}.
	 */
	@Test
	void testAddPolynom_able() {
		Polynom_able test =new Polynom(p);
		test.add(p);
		Polynom test2=new Polynom("-2x^3+6x^2-10x-12");
		if(!test2.equals(test))
			fail("AddPolynom_able Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#add(MyMath.Monom)}.
	 */
	@Test
	void testAddMonom() {
		Polynom test =new Polynom(p);
		test.add(new Monom(-1,1));
		if(!test.equals(new Polynom("-x^3+3x^2-6x-6")))
			fail("Add Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#toString()}.
	 */
	@Test
	void testToString() {
		String test="-x^3+3.0x^2-5.0x-6.0";
		if(!test.equals(p.toString()))
			fail("ToString not as expected");
	}

	/**
	 * Test method for {@link MyMath.Polynom#substract(MyMath.Polynom_able)}.
	 */
	@Test
	void testSubstract() {
		Polynom test =new Polynom(p);
		test.substract(new Polynom("-x^3+3x^2-5x-6"));
		if(!test.equals(new Polynom("0")))
			fail("Substract Fail");
	}


	/**
	 * Test method for {@link MyMath.Polynom#multiply(MyMath.Polynom_able)}.
	 */
	@Test
	void testMultiply() {
		Polynom test =new Polynom(p);
		test.multiply(new Polynom("x^2-5+x"));
		if(!test.equals(new Polynom("-x^5+2x^4+3x^3-26x^2+19x+30")))
			fail("Multiply Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#equals(MyMath.Polynom_able)}.
	 */
	@Test
	void testEqualsPolynom_able() {
		Polynom_able test =new Polynom();
		test.add(new Monom(-1,3));
		test.add(new Monom(3,2));
		test.add(new Monom(-5,1));
		test.add(new Monom(-6,0));
		if(!p.equals(test))
			fail("EqualsPolynom_able Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#isZero()}.
	 */
	@Test
	void testIsZero() {
		if(p.isZero())
			fail("IsZero Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#root(double, double, double)}.
	 */
	@Test
	void testRoot() {
		double x = p.root(-2,0, 0.0001);
		if(x!=-0.7624969482421875)
			fail("Root Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#copy()}.
	 */
	@Test
	void testCopy() {
		Polynom test=(Polynom)p.copy();
		if(!test.equals(p))
			fail("Copy Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#derivative()}.
	 */
	@Test
	void testDerivative() {
		Polynom test = (Polynom)p.copy();
		Polynom test2 = new Polynom("5");
		if(!test.derivative().equals(new Polynom("-3x^2+6x-5")) && !test2.derivative().equals(new Polynom("0")))
			fail("Derivative Fail");
	}

	/**
	 * Test method for {@link MyMath.Polynom#area(double, double, double)}.
	 */
	@Test
	void testArea() {
		double x = p.area(-4,-2, 0.0001);
		if((int)x!=134)
			fail("the area function have to return : 134");
	}
	/**
	 * Test method for {@link MyMath.Monom#Monom(java.lang.String)}.
	 */
	@Test
	void testMonomString() {
		Monom test = new Monom("x^2");
		if(!test.equals(new Monom(1,2)))
			fail("Monom(String) Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#Monom(MyMath.Monom)}.
	 */
	@Test
	void testMonomMonom() {
		Monom test = new Monom(m);
		if(!test.equals(m))
			fail("Monom(Monom) Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#equals(MyMath.Monom)}.
	 */
	@Test
	void testEqualsMonom() {
		Monom test = new Monom(m);
		if(test.get_coefficient()!=m.get_coefficient() || test.get_power()!=m.get_power())
			fail("Monom equals Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#get_coefficient()}.
	 */
	@Test
	void MtestGet_coefficient() {
		Monom test = new Monom(5,4);
		if(test.get_coefficient()!=5)
			fail("Coefficient Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#get_power()}.
	 */
	@Test
	void MtestGet_power() {
		Monom test = new Monom(5,4);
		if(test.get_power()!=4)
			fail("GetPower Fail");
	}
	/**
	 * Test method for {@link MyMath.Monom#derivative()}.
	 */
	@Test
	void MtestDerivative() {
		if(!m.derivative().equals(new Monom("2x")))
			fail("Monom Derivative Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#add(MyMath.Monom)}.
	 */
	@Test
	void testAdd() {
		Monom test = new Monom(5,4);
		test.add(new Monom(3,4));
		if(test.get_coefficient()!=8)
			fail("Monom Add Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#multiply(MyMath.Monom)}.
	 */
	@Test
	void MtestMultiply() {
		Monom test = new Monom(5,4);
		test.multiply(m);
		if(!test.equals(new Monom(5,6)))
			fail("Monom Multiply Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#f(double)}.
	 */
	@Test
	void MtestF() {
		if(m.f(4)!=16)
			fail("F(x) Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#toString()}.
	 */
	@Test
	void MtestToString() {
		if(!m.toString().equals("x^2"))
			fail("MonomToString Fail");
	}

	/**
	 * Test method for {@link MyMath.Monom#isZero()}.
	 */
	@Test
	void MtestIsZero() {
		if(m.isZero())
			fail("MonomIsZero Fail");

	}
}

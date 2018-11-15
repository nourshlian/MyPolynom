
 * This interface represents a general Polynom: f(x) = a_1X^b_1+a_2X^b_2 ... a_nXb_n,
 * where: a_1, a_2 ... a_n are real numbers and b_1<b_2..<b_n >=0 are none negative integers (naturals)
 * when each aX^b is monom , for more details check documentation.
 * For formal definitions see: https://en.wikipedia.org/wiki/Polynomial
   
 * Such polygon has the following functionality:
 * 1. Init:
 * 1.1 Init(String)
  	correct sintix exampls Monoms  ( ax^b | b>0 & b is an integer ) --> (x^2 | x | -x | 5x^4 | -9x^3 ...).
	correct sintix exampls polynom --> (x^2-x+5x^6 | 7x^2+2x-6 ).
	wrong sintix exampls (ax^b | b<=0 & b is a non integer) --> (x^^7 | +-x7 | xx | x^-6 | 5x^-2 | 6x^1.5 ).
	wrong sintix exampls polynom --> (x^2+-x^3-5x^2.5 | x^^2.5-+3 54x ).

 * 1.2 Init() // zero Polygon
 * 1.3 Polynom copy() // deep copy semantics
   
 * 2. Math:
 * 2.1 void add(Polygon p) // add p to this Polynon
 * 2.2 void subtract(Polygon p) // subtract p from this Polygon
 * 2.3 void multiply(Polygon p) // multiply this Polygon by p
   
 * 3. Utils
 * 3.1 isZero()
 * 3.2 Polynom derivative() // returns a new Polygon of the derivative ("NIGZERET").
 * 3.3 double f(x) // return this Polygon value at p(x) 
 * 3.4 boolean equals(Polygon p) // returns true iff for any x: this.f(x) == p.f(x)
 * 3.5 double root(double x0, double x1, double eps) // assuming (f(x0)*f(x1)<=0, returns f(x2) such that:
  													//	(i) x0<=x2<=x2 & (ii) {f(x2)<eps
 * 3.6 String toString() // returns a String such that it can be used for init an equal(s) Polygon
 * 3.7  Graph( x0 , x1) //
 	Method that displays point in an two dimensional coordinate system (x-y plot) of this Polynom_able
 * 3.8  areaUnderX //
 	 this method calculate the area Under x axis and above the function in [x0,x1].
   
 * @author Ilya Nour
  
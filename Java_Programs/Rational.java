import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int num, den;
	public Rational(){
		setRational(1,1);
	}
	
	public Rational(int n, int d){
		setRational(n,d);
	}

	public void setRational(int n, int d){
		num = n;
		den = d;
	}
	
	public int getNum(){
		return num;
	}
	
	public int getDen(){
		return den;
	}

	
	public void add(Rational other)
	{
		int num2 = other.getNum();
		int den2 = other.getDen();
		int numerator = (num * den2) + (num2 * den);
		int denominator = (den * den2);
		num = numerator;
		den = denominator;
		reduce(num, den);
	}

	private void reduce(int numOne, int numTwo)
	{
		int gcd = 1;
		for(int x = 1; x<= numOne && x<= numTwo; x++){
			if(numOne%x ==0 && numTwo%x==0)
				gcd = x;
		}
		num = numOne/gcd;
		den = numTwo/gcd;

	}

	public boolean equals( Object obj)
	{
		Rational other = (Rational) obj;
		double frac1 = ((double)num/den);
		double frac2 = ((double)other.getNum()/other.getDen());
		if(frac1 == frac2){
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		if(  (double)(num/den) > (double)(other.getNum()/other.getDen())){
			return 1;
		}
		return -1;
	}


	public String toString(){
		return "" + num + "/" + den;
	}
	
	
}
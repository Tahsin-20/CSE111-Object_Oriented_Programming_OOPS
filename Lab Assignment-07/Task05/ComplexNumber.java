package Task05;

public class ComplexNumber extends RealNumber{

	public double i_val;

	public ComplexNumber(){
		super(1.0);
		i_val=1.0;
	}

	public ComplexNumber(double rp, double iv){
		super(rp);
		i_val=iv;
	}

	@Override
	public String toString(){
		return super.toString()+"\nImaginaryPart: "+i_val;
	}
}

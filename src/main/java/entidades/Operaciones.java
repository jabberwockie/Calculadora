package entidades;

public class Operaciones{
	
	private double a;
	private double b;
	private String op;
	public Operaciones(String operando, double a, double b){
		this.a=a;
		this.b=b;
		op=operando;
	}
	
	public double sumar(double a, double b){
		return a+b;
	}
	
	public double restar(double a, double b){
		return a-b;
	}
	
	public double multiplicar(double a, double b){
		return a*b;
	}
	
	public double dividir(double a, double b) throws Exception{
		if(b!=0)
			return a/b;
		else
			throw new Exception("NO se puede dividir por cero!"); 
	}

	public double operando() throws Exception{
		double r=0;
		if(op.contains("+"))
			r=sumar(a,b);
		if(op.contains("-"))
			r=restar(a,b);
		if(op.contains("*"))
			r=multiplicar(a,b);
		if(op.contains("/"))
			r=dividir(a,b);
		return r;
	}
	
	
	}


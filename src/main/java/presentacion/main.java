package presentacion;

import java.util.Scanner;

import entidades.Operaciones;


public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer =new Scanner(System.in);
		
		System.out.println("Ingrese operando [+ - * /]:");
		String operando = leer.next();
		
		System.out.println("Ingrese primer número:");
		double a=leer.nextDouble();
		
		System.out.println("Ingrese segundo número:");
		double b=leer.nextDouble();
		
		Operaciones op =new Operaciones(operando, a, b);
		try{
			double result = op.operando();
			System.out.println(result);
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}


	

}

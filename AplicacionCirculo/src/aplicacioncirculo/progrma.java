package aplicacioncirculo;
import java.util.Scanner;

public class progrma {

	public progrma() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		Circulo miCirculo=new Circulo();
		System.out.println("ingrese el radio del circlo");
		miCirculo.setRadio(teclado.nextDouble());		
		
		System.out.println(miCirculo.getArea());
		System.out.println(miCirculo);

	}

}
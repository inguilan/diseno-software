package ejerciciogato02;

public class Gato {
	private String nombre;
	private String genero;
	private int edad ;
	private String color;
	private float peso;
	
	
     public Gato () {
    	 
     }
     
     public void respirar () {
    	 System.out.println("gato respira");
     }
     public void comer (String comida ) {
    	 System.out.println("estoy comiendo" + comida );
     }
     public void correr (String destino ) {
    	 System.out.println("estoy corriendo" + destino );
     } 
     
     public void dormir ( int horas ) {
    	 System.out.println(" estoy durmiendo " +  horas + " horas " );
     }
     
     public void maullar () {
    	 System.out.println("mewwwwwwwwwwwww");
     }
     
     
     
     
}


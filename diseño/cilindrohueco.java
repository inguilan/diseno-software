package poo;

class Cilindro extends Circulo {
    protected double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaSuperficial() {
        return 2 * Math.PI * getRadio() * (getRadio() + altura);
    }

    public double volumen() {
        return Math.PI * getRadio() * getRadio() * altura;
    }
}
package poo;

class Circulo {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double circunferencia() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
package poo;

class CilindroHueco extends Cilindro {
    private double radioInterior;

    public CilindroHueco(double radioExterno, double altura, double radioInterior) {
        super(radioExterno, altura);
        this.radioInterior = radioInterior;
    }

    public double getRadioInterior() {
        return radioInterior;
    }

    public void setRadioInterior(double radioInterior) {
        this.radioInterior = radioInterior;
    }

    public double areaSuperficialExterna() {
        return 2 * Math.PI * getRadio() * (getRadio() + altura);
    }

    public double areaSuperficialInterna() {
        return 2 * Math.PI * radioInterior * (radioInterior + altura);
    }

    @Override
    public double volumen() {
        return Math.PI * altura * (getRadio() * getRadio() - radioInterior * radioInterior);
    }
}
package poo;

public class Mainn {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Circunferencia del círculo: " + circulo.circunferencia());

        Cilindro cilindro = new Cilindro(5, 8);
        System.out.println("Área del cilindro: " + cilindro.areaSuperficial());
        System.out.println("Volumen del cilindro: " + cilindro.volumen());

        CilindroHueco cilindroHueco = new CilindroHueco(8, 1, 2);
        System.out.println("Área superficial externa del cilindro hueco: " + cilindroHueco.areaSuperficialExterna());
        System.out.println("Área superficial interna del cilindro hueco: " + cilindroHueco.areaSuperficialInterna());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.volumen());
    }
}
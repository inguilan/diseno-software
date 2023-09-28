package poo;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los detalles de una persona:");
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Dirección: ");
        String address = scanner.nextLine();

        Person person = new Person(name, address);
        System.out.println("Información de la persona: " + person);

        System.out.println("\nIngrese los detalles de un estudiante:");
        System.out.print("Programa: ");
        String program = scanner.nextLine();
        System.out.print("Año: ");
        int year = scanner.nextInt();
        System.out.print("Tarifa: ");
        double fee = scanner.nextDouble();

        Student student = new Student(name, address, program, year, fee);
        System.out.println("Información del estudiante: " + student);

        scanner.nextLine(); 

        System.out.println("\nIngrese los detalles de un miembro del personal:");
        System.out.print("Escuela: ");
        String school = scanner.nextLine();
        System.out.print("Pago: ");
        double pay = scanner.nextDouble();

        Staff staff = new Staff(name, address, school, pay);
        System.out.println("Información del miembro del personal: " + staff);

        scanner.close();
    }
}
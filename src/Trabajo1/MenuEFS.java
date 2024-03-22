package Trabajo1;

import java.util.Scanner;

public class MenuEFS 
{
	
	public static void main(String[] args) 
	{
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la persona:");
        String nombrePersona = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        int edadPersona = scanner.nextInt();
        
        Persona persona = new Persona(nombrePersona, edadPersona);
        
        System.out.println("\nInformacion de la persona:");
        persona.MostrarInformacion();
        
        scanner.nextLine(); 
        
        System.out.println("\nIngrese el nombre del empleado:");
        String nombreEmpleado = scanner.nextLine();
        System.out.println("Ingrese la edad del empleado:");
        int edadEmpleado = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese el cargo del empleado:");
        String cargoEmpleado = scanner.nextLine();
        System.out.println("Ingrese el salario del empleado:");
        double salarioEmpleado = scanner.nextDouble();
        
        Empleado empleado = new Empleado(nombreEmpleado, edadEmpleado, salarioEmpleado, cargoEmpleado);
        
        System.out.println("\nInformacion del empleado:");
        empleado.MostrarInformacion();
        
        
        System.out.println("\nPreguntas QUIZ:");
        persona.responderPreguntas();
        
        
        
        
        
        
       
        scanner.close();
    }

}

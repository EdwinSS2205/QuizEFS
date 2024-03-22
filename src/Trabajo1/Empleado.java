package Trabajo1;

public class Empleado extends Persona
{
	private Double salario;
	private String cargo;
	
	
	
	public Empleado(String nombre, int edad, Double salario, String cargo) 
	{
		super(nombre, edad);
		this.salario = salario;
		this.cargo = cargo;
	}
	

	 public void MostrarInformacion()
	 {
	        super.MostrarInformacion(); 
	        System.out.println("Cargo: " + cargo);
	        System.out.println("Salario: " + salario);
	    }
}

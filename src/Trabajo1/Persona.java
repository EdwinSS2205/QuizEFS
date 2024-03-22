package Trabajo1;

public class Persona 
{
	
	private String nombre;
	private int edad;
	

	
	public Persona(String nombre, int edad) 
	{
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
	
	public void MostrarInformacion() 
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}	
	
	
	
	   public void responderPreguntas()
	   
	   {
	        System.out.println("SOLUCIONARIO");
	        System.out.println("1. ¿Cual es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos?");
	        System.out.println("La diferencia es que en la clase Empleado se tienen dos atributos adicionales que hereda de persona, en cuanto a metodos es lo mismo, Empleado hereda metodos adicionales para manejar la información adicional relacionada con el empleo" + ".");
	        
	        
	        System.out.println("2. ¿Como se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
	        System.out.println("Se establece con la palabra Extends después de crear la clase.");
	        
	        
	        System.out.println("3. ¿Que es un constructor en Java y cual es su proposito?");
	        System.out.println("Es como un metodo especial para poder inicializar los estados de los objetos.");
	        
	        
	        System.out.println("3. ¿Que es un constructor en Java y cual es su proposito?");
	        System.out.println("Es como un metodo especial para poder inicializar los estados de los objetos.");
	        
	        
	        System.out.println("4. ¿Por que es util utilizar la herencia en la programacion orientada a objetos?");
	        System.out.println("Eso permite reutilizar el codigo ya existente y ahorrar trabajo.");
	        
	        
	        System.out.println("5. ¿Como se llama el proceso de crear un objeto a partir de una clase en Java?");
	        System.out.println("Se llama crear una instancia de clase o instanciacion");
	        
	    }
}





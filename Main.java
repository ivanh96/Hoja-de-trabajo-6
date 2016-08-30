import java.util.Scanner;

public class Main 
{
	private static Scanner scan;

	public static void main(String[] args) 
	{
		scan = new Scanner(System.in);
		int implement = 0;
		int ingreso;
		
		System.out.println("Bienvenido al programa sobre programadores");
		
		while (implement == 0)
		{
			System.out.println("Por favor seleccione la implementacion a utilizar: ");
			System.out.println("1.HashTable \n2.LinkedHashTable \n3.TreeTable\n");
			try
			{
				implement = Integer.valueOf(scan.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Error, Caracter Invalido.\n.");
				implement = 0;
			}
			if (implement < 1 || implement > 3)
				System.out.println("Error, Opcion Invalida.\n.");
				implement = 0;

			if (implement == 1)
            		//Factory de HASHSET
       			if (implement == 2)
            		//Factory de TREESET
        		if (implement == 3)
            		//Factory de LINKEDHASHSET
        		ingreso = 0;
			
		}
	    	
		
		//Creacion de Interface a Utilizar 
		//Hay que crear la clase "X"
		X desarrollo_Java = new X(implement);
		X desarrollo_Web = new X(implement);
		X desarrollo_Movil = new Tables(implement);
		

		while(ingreso == 0){
			String nombre = " "; 
			Integer experiencia = 0; 
			
			System.out.println("Ingrese el nombre del desarrollador: ");
			nombre = scan.nextLine();
			
			System.out.println("Ingrese los numeros correspondientes a las habilidades del desarrollador (numeros juntos. ej: 123): ");
			System.out.println("1.Java \n2.Web \n3.Moviles");
			experiencia = Integer.valueOf(scan.nextLine());
			
			switch(experiencia){
				case 1:
					desarrollo_Java.addElement(nombre);
					break;
				case 2:
					desarrollo_Web.addElement(nombre);
					break;
				case 3:
					desarrollo_Movil.addElement(nombre);
					break;
				case 12:
					desarrollo_Java.addElement(nombre);
					desarrollo_Web.addElement(nombre);
					break;
				case 13:
					desarrollo_Java.addElement(nombre);
					desarrollo_Movil.addElement(nombre);
					break;
				case 23:
					desarrollo_Web.addElement(nombre);
					desarrollo_Movil.addElement(nombre);
					break;
				case 123:
					desarrollo_Java.addElement(nombre);
					desarrollo_Web.addElement(nombre);
					desarrollo_Movil.addElement(nombre);
					break;
			

			System.out.println("¿Desea ingresar otro desarrollador?");
			System.out.println("1.Si \n2.No");

			try
			{
				ingreso = Integer.valueOf(scan.nextLine());
			}
			catch (NumberFormatException e)
			{
				System.out.println("Error, Opcion Invalida.\n.");
				System.out.println("¿Desea ingresar otro desarrollador?");
				System.out.println("1.Si \n2.No");
			}
			if (ingreso == 1)
				ingreso = 0;

			if (ingreso == 2)
				ingreso = 1;

			}	
		}

		System.out.println("Los desarrolladores con experiencia en Java, web y en celulares son: ");
		System.out.println("Los desarrolladores con experiencia en Java pero sin experiencia web son: ");
		System.out.println("Los desarrolladores con experiencia web y en celulares, pero no en Java son: ");
		System.out.println("Los desarrolladores con experiencia en Java, con web o en celulares son: ");
		System.out.println("Los conjunto de desarrolladores es: ");
		System.out.println("Los desarrolladores de este conjunto son: ");

	}

}

import java.util.Scanner;
import java.util.Set;

public class Main 
{
	private static Scanner scan;

	public static void main(String[] args) 
	{
		scan = new Scanner(System.in);
		int implement = 0;
		int ingreso = 0;
		
		System.out.println("Bienvenido al programa sobre programadores");
		
		while (implement == 0){

			System.out.println("Por favor seleccione la implementacion a utilizar: ");
			System.out.println("1.HashTable \n2.LinkedHashTable \n3.TreeTable\n");

			try{
				implement = Integer.valueOf(scan.nextLine());
			}

			catch (NumberFormatException e){
			}

			if (implement < 1 || implement > 3){
				System.out.println("Error. Opcion Invalida.\n");
				implement = 0;
			}

			if (implement == 1){
			//Factory de HASHSET
			}
       		if (implement == 2){
            //Factory de TREESET
       		}
        	if (implement == 3){
            //Factory de LINKEDHASHSET
        	}
		}
	    	
		
		//Creacion de Interface a Utilizar 
		Hash<String> desarrollo_Java = new Hash(implement);
		Hash<String> desarrollo_Web = new Hash(implement);
		Hash<String> desarrollo_Movil = new Hash(implement);
		Hash<String> temp = new Hash(implement);
		

		while(ingreso == 0){

			String nombre = " "; 
			Integer experiencia = 0; 
			
			System.out.println("Ingrese el nombre del desarrollador: ");
			nombre = scan.nextLine();
			
			System.out.println("Ingrese el numero que corresponde a la experiencia del desarrollador\nSi el desarrollador tiene experiencia en dos o los tres conjuntos ingrese todos los numeros juntos [ej. 123] ");
			System.out.println("1.Java \n2.Web \n3.Moviles\n");
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
				}
				
			
			System.out.println("Desea ingresar otro desarrollador?");
			System.out.println("1.Si \n2.No\n");

			try{

				ingreso = Integer.valueOf(scan.nextLine());
			}

			catch (NumberFormatException e){

				System.out.println("Error. Opcion Invalida.\n");
				
			}

			if (ingreso == 1){
				ingreso = 0;
			}

		}

		Set<String> javac = desarrollo_Java.getConjunto();
		Set<String> webc = desarrollo_Web.getConjunto();
		Set<String> movilc = desarrollo_Movil.getConjunto();
		Set<String> tempc = desarrollo_Java.getConjunto();

		tempc = temp.getIntersec3(javac, webc, movilc);
		System.out.println("Los desarrolladores con experiencia en Java, web y en celulares son: \n"+tempc+"");

		tempc = temp.getResta(javac, webc);
		System.out.println("Los desarrolladores con experiencia en Java pero sin experiencia web son: \n"+tempc+"");

		tempc = desarrollo_Web.getResta(movilc, javac);
		System.out.println("Los desarrolladores con experiencia web y en celulares, pero no en Java son: \n"+tempc+"");

		tempc = desarrollo_Java.getJuntos(webc, movilc);
		System.out.println("Los desarrolladores con experiencia en Java, con web o en celulares son: \n"+tempc+"");

		int j = desarrollo_Java.getElementos();
		int w = desarrollo_Web.getElementos();
		int m = desarrollo_Movil.getElementos();
		String mayor = "";
		if (j > w && j > m){
			mayor = "JAVA";
			tempc = javac;
		}

		if (w > j && w > m){
			mayor = "WEB";
			tempc = webc;
		}

		if (m > j && m > w){
			mayor = "MOVIL";
			tempc = movilc;
		}
		System.out.println("El conjunto con la mayor cantidad de desarrolladores es: "+mayor+"");
		System.out.println("Los desarrolladores de este conjunto son: \n"+tempc+"");

	}

}

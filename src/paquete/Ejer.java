package paquete;
import java.io.*;
import java.util.*;

public class Ejer {
	
	public int var1;
	public String cad1;
	
	// pueden agregarse otros atributos
	//
	// A continuacion se escriben los constructores
	// y lo metodos accesores y modificadores

	public int getVar1() {
		return var1;
	}



	public void setVar1(int var1) {
		this.var1 = var1;
	}



	public String getCad1() {
		return cad1;
	}



	public void setCad1(String cad1) {
		this.cad1 = cad1;
	}



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ent1;
		String c1;
		
		System.out.println("Creando objeto 'e1' utilizando el constructor default");
		Ejer e1 = new Ejer();
		
		System.out.println("Escribe un valor entero: ");
		ent1 = sc.nextInt();
		
		System.out.println("Escribe una cadena: ");
		c1 = sc.next();
		
		System.out.println("Creando objeto 'e2' utilizando los valores");
		System.out.println(ent1 + " y " + c1);
		Ejer e2= new Ejer();
		
		e2.setVar1(ent1); // este metodo modifica el atributo var1
        e2.setCad1(c1); // este metodo modifica el atributo cad1
		
		System.out.println("Escribe un valor entero: ");
		ent1 = sc.nextInt();
		
		System.out.println("Escribe una cadena: ");
        c1 = sc.next();
        
        System.out.println("Modificando objeto 'e1' utilizando los valores");
        System.out.println(ent1 + " y " + c1);
        e1.setVar1(ent1); // este metodo modifica el atributo var1
        e1.setCad1(c1); // este metodo modifica el atributo cad1
        
        
        
        System.out.println("Imprimiendo el contenido del objeto e1");
        System.out.println("e1.var1: " + e1.getVar1());
        System.out.println("e1.cad1: " + e1.getCad1());
        System.out.println("Imprimiendo el contenido del objeto e2");
		System.out.println("e2.var1: " + e2.getVar1());
        System.out.println("e2.cad1: " + e2.getCad1());
	}

	

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_i;

/**
 *
 * @author fabia
 */
public class Test_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        String Nombre="Fabian";
        int nro1=10;
        short nroshort1=0;
        char caracter='a';
        double elFloat=10.5;
        boolean flag = false;
        
        System.out.println("Hola"); 
        System.out.println(Nombre);
        
        
        // Operadores
        int num1 = 5;
	int num2 = 5;
    
	int suma = num1 + num2;
    
	double division = num1 / num2;
    
	boolean logico = num2 < num1;
    
	num1++;

        System.out.println(num1);
        
        // Viendo system OUT
        int num = 10;
    
	System.out.println("La variable tiene el valor de: " + num);
    
	System.out.print("Hola");
	System.out.println("Mundo");
        
        
        //Conversion de tipos strin o integer
        int numEntero = 4;	
        String numCadena = String.valueOf(numEntero);

        //Si quisiÃ©ramos hacerlo al revÃ©s, de String a int se usa el mÃ©todo de la clase Integer, parseInt().
        //Ejemplo:
        String numCadena2 = "1";  	
        int numEntero2 = Integer.parseInt(numCadena2);

         System.out.println(numCadena + " " + numCadena2);

         //ramdon   
        int numero = (int) (Math.random() * 10);

        System.out.println(numero);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrar;

/**
 *
 * @author Fabian M. Urchueguia
 */
import java.util.Arrays;

public class Cifrador {

    public static void Cifrar(char[] glbparam) {
        int[] Nums = {193, 254, 124, 65, 47, 153, 231, 12, 76, 44, 11, 236, 31, 113, 221, 111, 24, 188};
        char[] Clave = new char[60];
        char[] Extra = new char[20];
        int i, j, k;
        Arrays.fill(Clave, '\0');
        
        //if (glbparam.length >= 10) {
            System.arraycopy(glbparam, 0, Clave, 0, glbparam.length);
       //} else {
            // Tratar el caso de que la cadena tenga menos de 10 caracteres
        //   throw new IllegalArgumentException("El parámetro debe tener al menos 10 caracteres");
        //}
        
        for (i = 0; Clave[i] != '\0'; i++) {
            if (Clave[i] == ' ') {
                Clave[i] = '\0';
            }
        }
        Arrays.fill(Extra, '\0');
        for (i = 0; Clave[i] != '\0'; i++) {
            j = Clave[i] ^ Nums[i];
            j = ~j;
            k = j / 26;
            Clave[i] = (char) ('A' + (j % 26));
            Extra[i] = (char) ('0' + k);
        }
        //System.arraycopy(Extra, 0, Clave, Clave.length - Extra.length, Extra.length);
        System.arraycopy(Clave, 0, glbparam, 0, glbparam.length);
        
    }

    // Ejemplo de uso:
    public static void main(String[] args) {
        System.out.println("Bersa123 => UWHXVJQK43976317");
        
        char[] texto = "Bersa123".toCharArray();
        System.out.println("Texto original: " + new String(texto));
        Cifrar(texto);
        System.out.println("Texto cifrado: " + new String(texto));
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrar;

import java.util.Arrays;

/**
 *
 * @author Fabian M. Urchueguia
 *
 * #include <stdlib.h>
 * #include <malloc.h>
 * #include <string.h>
 * #include <stdio.h>
 * #include <ctype.h>
 *
 * void Cifrar ( char *glbparam ) { int i, Nums[] = {
 * 193,254,124,65,47,153,231,12,76,44,11,236,31,113,221,111,24,188}; static
 * unsigned char Clave[60], Extra[20]; div_t Div; char *p; memset(
 * Clave,0,sizeof(Clave) ); strncpy((char *)Clave, (char *)glbparam , 10);
 * for(i=0; i<20;i++){ if ( (int) (Clave[i]) == (int) 32 ) Clave[i] = 0; }
 * memset( Extra, 0, sizeof(Extra) ); for( i=0; Clave[i]; i++) { Clave[i] ^=
 * Nums[i]; Clave[i] = (char) ~Clave[i];
 *
 * Div = div( Clave[i], 26); Clave[i] = (char)('A' + Div.rem); Extra[i] =
 * (char)('0' + Div.quot);
 *
 * }
 * strcat( (char *)Clave,(char *)Extra); strcpy((char *)glbparam, (char *)Clave
 * ); }
 *
 *
 */
public class Cifrado {

    private static final int[] nums = {193, 254, 124, 65, 47, 153, 231, 12, 76, 44, 11, 236, 31, 113, 221, 111, 24, 188};

    public static String cifrar(char[] mensaje) {
        char[] clave = new char[60];
        char[] extra = new char[20];
        int i;

        System.out.println("Longitud Mensaje: " + mensaje.length);
        //Lleno vector clave con espacios
        for (i = 0; i < 60; i++) {
            clave[i] = ' ';
        }

        //Lleno vector extra con espacios
        for (i = 0; i < 20; i++) {
            extra[i] = ' ';
        }

        //Toma los 10 primeros caracteres y los carga en el vector clave
        for (i = 0; i < 10 && i < mensaje.length; i++) {
            clave[i] = mensaje[i];
        }

        // Rellena con 0 donde hayan quedado vacios vector clave
        for (i = 0; i < 20; i++) {
            if (clave[i] == ' ') {
                clave[i] = 0;
            }
            System.out.print("[" + clave[i] + "]");
        }
        System.out.println("");

        String resultado3="";
        for (i = 0; clave[i] != 0; i++) { // Para I desde 0 hasta que encuentre el primer 0 en el vector clave
            clave[i] ^= nums[i]; // el valor de clave a la pontencia por nums[i]
            clave[i] = (char) ~clave[i]; // el operador ~, da vuelta el valor binario
            int div = clave[i] / 26;
            clave[i] = (char) ('A' + clave[i] % 26);
            extra[i] = (char) ('0' + div);
            System.out.print(clave[i]+""+extra[i]);
            resultado3=resultado3.concat(clave[i]+""+extra[i]);
        }

        //System.out.println("Longitud extra: "+extra.length);
        //System.out.println("Longitud clave: "+clave.length);
        System.arraycopy(extra, 0, clave, i, 20);
//        System.arraycopy(clave, 0, mensaje, i, 8);
        //System.arraycopy(Extra, 0, Clave, Clave.length - Extra.length, Extra.length);
        System.arraycopy(clave, 0, mensaje, 0, mensaje.length);
        System.out.println("");


        char[] resultado = Arrays.copyOf(clave, clave.length + extra.length);
        System.arraycopy(extra, 0, resultado, clave.length, extra.length);
        String concat;
        

        //return Arrays.toString(resultado);
        return resultado3;
    }



}

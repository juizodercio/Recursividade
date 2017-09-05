/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficharecursividade;

import java.util.ArrayList;

/**
 *
 * @author Dercio
 */
public class FichaRecursividade {

    

    public static double multipilcacao(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        
        
        return a + multipilcacao(a, b - 1);

    }

    public static int somaDeAlgarismos(int numero, int soma) {

        if (numero < 1) {
            return soma;
        }

        soma += (numero % 10);
        return somaDeAlgarismos(numero / 10, soma);
    }

         int k=0;
    int numeroVezes(int n, int chave) {
        if (n == 0) 
            return 0;
        
        if (chave == (n % 10)) 
            k++;
      numeroVezes(n / 10, chave);
         return k;

    }


    
    
    public static int conversaoBinaria(int n, int num) {
        if (n == 0) {
            return (10 * num);
        }
        return conversaoBinaria(n / 2, (n % 2 + (10 * num)));

    }
    
    public static int multi(int a, int b){
    if(a==1)
        return b;
    
    
    return b+ multi(a-1, b);
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        FichaRecursividade f = new FichaRecursividade();
        System.out.println(" multiplicao de valores "+multipilcacao(4, 1));
       System.out.println(" soma de Algarismos " + somaDeAlgarismos(57, 0));
        System.out.println(" numero vezes " + f.numeroVezes(44444, 4));
         System.out.println(" soma de valores "+multi(4, 1));

    }

}

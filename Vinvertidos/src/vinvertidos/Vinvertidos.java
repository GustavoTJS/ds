/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vinvertidos;

/**
 *
 * @author Aluno CA
 */
public class Vinvertidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v1 = 1;
        int v2 = 7;
        
        System.out.println("Valores originais");
        System.out.println("valor 1 = " + v1);
        System.out.println("valor 2 = " + v2);
        
        int aux = v1;
        v1 = v2;
        v2 = aux;
        
        System.out.println("Valores invertidos");
        System.out.println("valor 1 = " + v1);
        System.out.println("valor 2 = " + v2);
                
        
    }
    
}

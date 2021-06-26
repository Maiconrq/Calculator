/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

/**
 *
 * @author USER
 */
public class Fatorial {
    
    // 
    public static double fatorial(double x){
        if(x==0){
            return 1;
        }
        return x * fatorial (x-1);
        
    }
}

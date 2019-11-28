/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.logika.ekslusive.or;

/**
 *
 * @author baciel
 */
public class OperatorLogikaEkslusiveOR
{
    public static void main( String[] args ){
        
        boolean vall = true;
        boolean val2 = true;
        System.out.println(vall ^ val2);
        
        vall = false;
        val2 = true;
        System.out.println(vall ^ val2);
        
        vall = false;
        val2 = false;
        System.out.println(vall ^ val2);
        
        vall = true;
        val2 = false;
        System.out.println(vall ^ val2);
    }
    
}

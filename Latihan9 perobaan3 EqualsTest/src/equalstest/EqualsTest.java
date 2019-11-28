/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalstest;

/**
 *
 * @author baciel
 */
public class EqualsTest {
    public static void main(String[] arguments){
      String strl, str2;
      strl = "Free the bound periodicals.";
      str2 = strl;
      System.out.println("String: " + strl);
      System.out.println("String: " + str2);
      System.out.println("Same object? " + (strl == str2));
      str2 = new String(strl);
      System.out.println("String: " + strl);
      System.out.println("String: " + str2);
      System.out.println("Same object? " + (strl == str2));
      System.out.println("Same value? " + (strl == str2));
      
    }

}

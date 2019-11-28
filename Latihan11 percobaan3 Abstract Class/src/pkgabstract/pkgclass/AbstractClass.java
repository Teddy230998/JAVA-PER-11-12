/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.pkgclass;

/**
 *
 * @author baciel
 */
public class AbstractClass {
    public void breath(){
        System.out.println("Living Thing breathing..."); }
    public void eat(){
        /**
         * abstract method walk
         * Kita ingin method ini di-overridde oleh subclasses
         */
        public abstract void walk();
        
}
public class Human extends LivingThing{
    public void walk(){
        System.out.println("Human walks...");
        
    }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatepattern;

/**
 *
 * @author ASUS
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Pha như pha một ly trà");
    }

    @Override
    public void addCondiments() {
        System.out.println("Thêm vào lá trà");
    }
    
}

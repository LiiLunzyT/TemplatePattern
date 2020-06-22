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
public abstract class CaffeineBeverage {

    public CaffeineBeverage() {
        System.out.println("Cách pha thức uống: ");
        repareRecipe();
        boilWater();
        addCondiments();
        brew();
        pourInCup();
    }
    
    public void repareRecipe() {
        System.out.println("Chuẩn bị nguyên liệu");
    }
    
    public void boilWater() {
        System.out.println("Đun nước nóng");
    }
    
    public void pourInCup() {
        System.out.println("Rót vào cốc");
    }
    
    public abstract void brew();
    public abstract void addCondiments();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author ASUS
 */
public class SortProductByName extends SortCollection<Product> {

    @Override
    public int compare(Product t1, Product t2) {
        String s1 = t1.getName();
        String s2 = t2.getName();
        
        return s1.compareTo(s2);
    }
}

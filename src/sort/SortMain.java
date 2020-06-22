/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product("Thước Kẻ", 2000, 5));
        listProduct.add(new Product("Bút Chì", 1000, 5));
        listProduct.add(new Product("Bút Mực", 4000, 5));
        
        SortCollection s = new SortProductByPrice();
        SortCollection s2 = new SortProductByName();
        s.sort(listProduct);
        for(Product pro : listProduct) {
            System.out.println(pro.toString());
        }
        
        s2.sort(listProduct);
        for(Product pro : listProduct) {
            System.out.println(pro.toString());
        }
    }
}

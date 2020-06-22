/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class SortCollection<T> {
    public abstract int compare(T t1, T t2);
    
    public void sort(List<T> list) {
        int len = list.size();
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                T t1 = list.get(i);
                T t2 = list.get(j);
                if( compare(t1, t2) <= 0) {
                    list.set(i, t2);
                    list.set(  j, t1);
                }
            }
        }
    }
}

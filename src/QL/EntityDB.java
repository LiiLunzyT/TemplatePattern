/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public abstract class EntityDB<T> {
    ArrayList<T> list;
    
    public boolean add(T t) {
        int id = getKey(t);
        if(findById(id) == null) {
            return list.add(t);
        }
        return false;
    }
    
    public int update(T t) {
        int id = getKey(t);
        
        if(findById(id) == null) {
            return 0;
        }
        
        list.set(id, t);
        return 1;
    }
    
    public int delete(T t) {
        int id = getKey(t);
        
        if(findById(id) == null) {
            return 0;
        }
        
        list.remove(id);
        return 1;
    }
    
    public int deleteByKey(int id) {
        if(findById(id) == null) {
            return 0;
        }
        
        list.remove(findById(id));
        return 1;
    }
    
    public abstract T findById(int id);
    
    public abstract int getKey(T t);
    
}

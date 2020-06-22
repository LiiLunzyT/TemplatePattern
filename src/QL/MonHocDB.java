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
public class MonHocDB extends EntityDB<MonHoc> {

    public MonHocDB() {
        list = new ArrayList<MonHoc>();
    }

    @Override
    public MonHoc findById(int id) {
        for(MonHoc mh : list) {
            if(mh.getMaMH() == id) {
                return mh;
            }
        }
        return null;
    }

    @Override
    public int getKey(MonHoc t) {
        return t.getMaMH();
    }
    
    @Override
    public String toString() {
        String str = "";
        return list.stream().map((mh) -> mh.toString() + "\n").reduce(str, String::concat);
    }
}

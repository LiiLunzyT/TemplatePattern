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
public class SinhVienDB extends EntityDB<SinhVien>  {

    public SinhVienDB() {
        list = new ArrayList<SinhVien>();
    }
    
    @Override
    public SinhVien findById(int id) {
        for(SinhVien sv : list) {
            if(sv.getMaSV() == id) {
                return sv;
            }
        }
        return null;
    }

    @Override
    public int getKey(SinhVien t) {
        return t.getMaSV();
    }

    @Override
    public String toString() {
        String str = "";
        return list.stream().map((sv) -> sv.toString() + "\n").reduce(str, String::concat);
    }
}

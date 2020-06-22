/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL;

/**
 *
 * @author ASUS
 */
public class QLMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityDB svDB = new SinhVienDB();
        svDB.add(new SinhVien(59131333, "Võ Thành Luân", "23/12/1999", "Nha Trang"));
        svDB.add(new SinhVien(59131332, "Võ Thành Luân", "23/12/1999", "Nha Trang"));
        svDB.deleteByKey(59131333);
        System.out.println(svDB);
        
        EntityDB mhDB = new MonHocDB();
        mhDB.add(new MonHoc(123, "Xác xuất Thống kê", 3));
        System.out.println(mhDB);
    }
    
}

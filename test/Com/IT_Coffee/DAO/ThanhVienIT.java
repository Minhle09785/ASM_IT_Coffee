/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Com.IT_Coffee.DAO;

import Com.IT_Coffee.Entity.ThanhVien;
import Com.IT_Coffee.utils.XDate;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author Windows 10 21H1
 */
public class ThanhVienIT {
    
    ThanhVienDAO dao2;
    ThanhVien thanhvien;
    public ThanhVienIT() {
    }
    @Before
    public void setUp() {
        dao2 = new ThanhVienDAO();
        thanhvien = new ThanhVien();
    }
   
    @Test
    public void TestInsert() {
        thanhvien.setMaTV("KienKT12");
        thanhvien.setTenTV("Võ Trung Kiên");
        thanhvien.setMaNV("Duy");
        thanhvien.setNgayThem(XDate.toDate("12-03-2005", "dd-MM-YYYY"));
        thanhvien.setLoaiThe("Vip");
        thanhvien.setSDT("012235147");
        thanhvien.setEmail("kientv123@gmail.com");
        thanhvien.setGhiChu("Ít đá");
        assertEquals(1,  dao2.insert(thanhvien));
    }
    @Test()
    public void TestUpdate() {  
        thanhvien.setTenTV("Võ Kiên");
        thanhvien.setMaNV("Duy");
        thanhvien.setNgayThem(XDate.toDate("12-03-2005", "dd-MM-YYYY"));
        thanhvien.setLoaiThe("Vip");
        thanhvien.setSDT("012235147");
        thanhvien.setEmail("kientv123@gmail.com");
        thanhvien.setGhiChu("nhiều đá");
        thanhvien.setMaTV("KienKT");
        assertEquals(1,  dao2.update(thanhvien));
    }
    @Test
    public void TestDelete() {
        assertEquals(1,dao2.delete("KienKT"));
    }
    
}

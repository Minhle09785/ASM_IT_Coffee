/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Com.IT_Coffee.DAO;

import Com.IT_Coffee.Entity.*;
import Com.IT_Coffee.DAO.SanPhamDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windows 10 21H1
 */
public class SanPhamIT {
    
    SanPhamDAO dao;
    SanPham sanpham;
    public SanPhamIT() {
    }
    @Before
    public void setUp() {
        dao = new SanPhamDAO();
        sanpham = new SanPham();
    }
   
    @Test
    public void TestInsert() {
        sanpham.setMaSP("CF8");
        sanpham.setTenSP("Sữa tươi trân châu đường đen");
        sanpham.setDonGia(26.500);
        sanpham.setSize("Lớn");
        sanpham.setHinh("sp-cf1.jpg");
        sanpham.setLoaiSP("CF");
        assertEquals(1,  dao.insert(sanpham));
    }
    @Test()
    public void TestUpdate() {
        sanpham.setTenSP("Sữa tươi đường đen");
        sanpham.setDonGia(22000);
        sanpham.setSize("Nhỏ");
        sanpham.setHinh("sp-cf1.jpg");
        sanpham.setLoaiSP("CF");
        sanpham.setMaSP("CF8");
        assertEquals(1,  dao.update(sanpham));
    }
    @Test
    public void TestDelete() {
        assertEquals(1,dao.delete("CF8"));
    }
    
}

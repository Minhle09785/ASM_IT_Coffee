/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Com.IT_Coffee.DAO;

import Com.IT_Coffee.Entity.*;
import Com.IT_Coffee.DAO.NhanVienDAO;
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
public class NhanVienIT {
    
    NhanVienDAO dao;
    NhanVien nhanvien;
    public NhanVienIT() {
    }
    
    @Before
    public void setUp() {
        dao = new NhanVienDAO();
        nhanvien = new NhanVien();
    }
   
    @Test
    public void TestInsert() {
        nhanvien.setMaNV("Khang");
        nhanvien.setMatKhau("admin2003");
        nhanvien.setHoTen("LÊ THANH TUẤNN");
        nhanvien.isGioiTinh();
        nhanvien.isVaiTro();
        nhanvien.setDiaChi("40/11/12 Hồ Văn Long, quận Bình Tân");
        nhanvien.setsDT("0123456788");
        nhanvien.setEmail("lethanhtuan9189@gmail.com");
        nhanvien.setLuong(850.000);
        nhanvien.setHinh("letuan.jpg");
        assertEquals(1,  dao.insert(nhanvien));
    }
    
    @Test()
    public void TestUpdate() {
        nhanvien.setMatKhau("admin2004");
        nhanvien.setHoTen("Vo kien");
        nhanvien.isGioiTinh();
        nhanvien.isVaiTro();
        nhanvien.setDiaChi("40/11/12 Hồ Văn Long, quận Bình Tân");
        nhanvien.setsDT("0123456788");
        nhanvien.setEmail("kien123@gmail.com");
        nhanvien.setLuong(850.000);
        nhanvien.setHinh("letuan1.jpg");
        nhanvien.setMaNV("PS160");
        assertEquals(1,  dao.update(nhanvien));
    }
    @Test
    public void TestDelete() {
        assertEquals(1,dao.delete("Dang"));
    }
    
    @Test 
    public void TestInsert1() {
        nhanvien.setMaNV("Dang");
        nhanvien.setMatKhau("123A");
        nhanvien.setHoTen("Nguyễn Bá Hùng");
        nhanvien.isGioiTinh();
        nhanvien.isVaiTro();
        nhanvien.setDiaChi("40/11/12 Hồ Văn Long, quận Bình Tân");
        nhanvien.setsDT("0123456788");
        nhanvien.setEmail("lethanhtuan9189@gmail.com");
        nhanvien.setLuong(850.000);
        nhanvien.setHinh("hungba123.jpg");
        assertEquals(1,  dao.insert(nhanvien));
    }
}

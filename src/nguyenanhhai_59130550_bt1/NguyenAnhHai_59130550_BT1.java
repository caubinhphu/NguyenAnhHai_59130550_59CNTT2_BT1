/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenanhhai_59130550_bt1;

import java.util.Scanner;
import util.GiaoVien;
import util.HocSinh;
import util.LopHoc;

/**
 *
 * @author Hai Tran Do
 */
public class NguyenAnhHai_59130550_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tao giao vien chu nhiem
        GiaoVien gvch = new GiaoVien();
        gvch.setHoTen("Nguyen Chu Nhiem");
        gvch.setTuoi(30);
        gvch.setDiaChi("Nha Trang - Khanh Hoa");
        gvch.setSdt("0123456789");
        gvch.setMonDay("Lap Trinh Cao Cap");
        gvch.setToBoMon("Lap Trinh Nang Cao");

        // tao lop hoc voi giao vien chu nhiem
        LopHoc lopHoc = new LopHoc(gvch);

        // them danh sach hoc hinh vao lop
        // tao hoc sinh
        HocSinh hs1 = new HocSinh();
        hs1.setHoTen("Nguyen Sinh Mot");
        hs1.setTuoi(12);
        hs1.setDiaChi("Nha Trang - Khanh Hoa");
        hs1.setSdt("0123458329");
        hs1.setLop("LTCC");
        hs1.setNangKhieu("Nhay");
        // them hs vao lop
        lopHoc.themHocSinh(hs1);

        // tao them hoc sinh
        HocSinh hs2 = new HocSinh("Nguyen Sinh Hai", 12, "Tuy Hoa - Yen", "0231546794", "LTCC", "Hat");
        // them hs vao lop
        lopHoc.themHocSinh(hs2);

        Scanner input = new Scanner(System.in);
        // tao them hoc sinh
        HocSinh hs3 = new HocSinh();
        System.out.print("ten hoc sinh: ");
        hs3.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        hs3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        hs3.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        hs3.setSdt(input.nextLine());
        System.out.print("lop: ");
        hs3.setLop(input.nextLine());
        System.out.print("nang khieu: ");
        hs3.setNangKhieu(input.nextLine());
        // them hs vao lop
        lopHoc.themHocSinh(hs3);

        // them giao vien giang day vao lop hoc
        // tao giao vien

        // in danh sach hoc sinh trong lop
        lopHoc.inDSHS();
    }
}

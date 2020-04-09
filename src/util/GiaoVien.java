/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Hai Tran Do
 */
public class GiaoVien extends CaNhan {
    // attributes
    private String monDay;
    private String toBoMon;
  
    // contructor
    // no params
    public GiaoVien() {
      super();
      this.monDay = "";
      this.toBoMon = "";
    }
    // wirh params
    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
      super(hoTen, tuoi, diaChi, sdt);
      this.monDay = monDay;
      this.toBoMon = toBoMon;
    }
  
    // getter, setter
    public void setMonDay(String monDay) { this.monDay = monDay; }
    public void setToBoMon(String toBoMon) { this.toBoMon = toBoMon; }
    public String getMonDay() { return this.monDay; }
    public String getToBoMon() { return this.toBoMon; }

    // methods
    // hien thi thong tin
    @Override
    public String hienThiTT() {
      String thongTin = "";
      thongTin = "ho ten: " + this.hoTen + ", tuoi: " + this.tuoi + ", dia chi: " + this.diaChi
        + ", sdt: " + this.sdt + ", mon day: " + this.monDay + ", to bo mon: " + this.toBoMon;
  
      System.out.println(thongTin);
      return thongTin;
    }
}

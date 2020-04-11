/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import interfaces.IQLDS;
import java.util.ArrayList;

/**
 *
 * @author Hai Tran Do
 */
public class QLDS implements IQLDS {
    // attributes
    private ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    // constructor
    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }
    
    // methods
    // them ca nhan
    @Override
    public int them(CaNhan cn) {
      dsCaNhan.add(cn);
      return 1;
    }

    // xoa ca nhan
    @Override
    public int xoa(String ten) {
      if (dsCaNhan.removeIf(cn -> cn.hoTen.equals(ten))) {
        return 1;
      }
      return 0;
    }

    // in ds ca nhan
    @Override
    public void inDS() {
      dsCaNhan.forEach(cn -> System.out.println(cn.hienThiTT()));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bill;

/**
 *
 * @author Zo
 */
public class BillTotal {
    private int ser,fo,dri,total;

    public int getSer() {
        return ser;
    }

    public int getFo() {
        return fo;
    }

    public int getDri() {
        return dri;
    }

    public int getTotal() {
        return total;
    }

    public BillTotal() {
    }

    public BillTotal(int ser, int fo, int dri, int total) {
        this.ser = ser;
        this.fo = fo;
        this.dri = dri;
        this.total = total;
    }
    
    
}

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
public class BillDrink {
    private String nameDri;

    public String getNameDri() {
        return nameDri;
    }

    public void setNameDri(String nameDri) {
        this.nameDri = nameDri;
    }

    public int getPriceDri() {
        return priceDri;
    }

    public void setPriceDri(int priceDri) {
        this.priceDri = priceDri;
    }
    private int priceDri;

    public BillDrink() {
    }

    public BillDrink(String nameDri, int priceDri) {
        this.nameDri = nameDri;
        this.priceDri = priceDri;
    }
    
    
}

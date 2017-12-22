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
public class BillFood {
    private String nameFo;

    public String getNameFo() {
        return nameFo;
    }

    public void setNameFo(String nameFo) {
        this.nameFo = nameFo;
    }

    public int getPriceFo() {
        return priceFo;
    }

    public void setPriceFo(int priceFo) {
        this.priceFo = priceFo;
    }
    private int priceFo;

    public BillFood() {
    }

    public BillFood(String nameFo, int priceFo) {
        this.nameFo = nameFo;
        this.priceFo = priceFo;
    }
    
    
}

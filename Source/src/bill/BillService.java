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
public class BillService {
    private String nameSer;
    private int priceSer;

    public String getNameSer() {
        return nameSer;
    }

    public void setNameSer(String nameSer) {
        this.nameSer = nameSer;
    }

    public int getPriceSer() {
        return priceSer;
    }

    public void setPriceSer(int priceSer) {
        this.priceSer = priceSer;
    }

    public BillService() {
    }

    public BillService(String nameSer, int priceSer) {
        this.nameSer = nameSer;
        this.priceSer = priceSer;
    }
    
    
}

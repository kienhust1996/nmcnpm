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
public class BillCus {
    private String name,typeCus,typeRoom,inDate,outDate;
    private int sumDate,priceRoom,amount,roomNo;

    public BillCus() {
    }

    public BillCus(String name, String typeCus, String typeRoom, String inDate, String outDate, int sumDate, int priceRoom, int amount,int roomNo) {
        this.name = name;
        this.typeCus = typeCus;
        this.typeRoom = typeRoom;
        this.inDate = inDate;
        this.outDate = outDate;
        this.sumDate = sumDate;
        this.priceRoom = priceRoom;
        this.amount = amount;
        this.roomNo = roomNo;
    }

    public String getName() {
        return name;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeCus() {
        return typeCus;
    }

    public void setTypeCus(String typeCus) {
        this.typeCus = typeCus;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public int getSumDate() {
        return sumDate;
    }

    public void setSumDate(int sumDate) {
        this.sumDate = sumDate;
    }

    public int getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(int priceRoom) {
        this.priceRoom = priceRoom;
    }
    
    
}

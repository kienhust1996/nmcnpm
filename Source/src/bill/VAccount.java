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
public class VAccount {
    private int empID;

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    private String name, user, pass;

    public VAccount() {
    }

    public VAccount(int empID, String name, String user, String pass) {
        this.empID = empID;
        this.name = name;
        this.user = user;
        this.pass = pass;
    }
    
    
}

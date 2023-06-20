/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepak
 */
class Vendor {
    private int sno;
    private String name, username, amount;
    
    public Vendor(int sno, String name, String username, String amount){
        this.sno=sno;
        this.name=name;
        this.username=username;
        this.amount=amount;
    }

    public int getsno(){
        return sno;
    }
    public String getname(){
        return name;
    }
    public String getusername(){
        return username;
    }
    public String getamount(){
        return amount;
    }

}

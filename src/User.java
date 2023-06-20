/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deepak
 */
class User {
    private int sno, phn_no, pricingsstd, pricingspro;
    private String name, services, address, email;
    
    public User(int sno, String name, String services, String address, String email, int phn_no, int pricingsstd, int pricingspro){
        this.sno=sno;
        this.name=name;
        this.services=services;
        this.address=address;
        this.email=email;
        this.phn_no=phn_no;
        this.pricingsstd=pricingsstd;
        this.pricingspro=pricingspro;
    }

    User(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getsno(){
        return sno;
    }
    public String getname(){
        return name;
    }
    public String getservices(){
        return services;
    }
    public String getaddress(){
        return address;
    }
    public String getemail(){
        return email;
    }
    public int getphn_no(){
        return phn_no;
    }
    public int getpricingsstd(){
        return pricingsstd;
    }
    public int getpricingspro(){
        return pricingspro;
    }
                    
}

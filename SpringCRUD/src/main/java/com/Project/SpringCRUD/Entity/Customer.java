package com.Project.SpringCRUD.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="Customer_id",length=50)
    @GeneratedValue(strategy = GenerationType.TABLE)
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int customerid=0;
    @Column(name="Customer_name",length=150)
    private String customername;
    @Column(name="Customer_Address",length=250)
    private String customeraddress;
    @Column(name="Customer_Mobile",length=50)
    private int mobile;

    public Customer(int customerid,String customername, String customeraddress, int mobile) {

        this.customerid = customerid;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public Customer()
    {

    }

    public Customer(String customername, String customeraddress, int mobile) {

        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}

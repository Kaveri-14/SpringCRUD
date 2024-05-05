package com.Project.SpringCRUD.DTO;

public class CustomerSaveDTO {


    private String customername;
    private String customeraddress;
    private int mobile;

    public CustomerSaveDTO(String customername, String customeraddress, int mobile) {

        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public CustomerSaveDTO() {

    }


    @Override
    public String toString() {
        return "CustomerDTO{"+
                ", customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", mobile=" + mobile +
                '}';
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

}

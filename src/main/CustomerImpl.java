package main;

import dataCustomer.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
       Customer object1=new Customer("kunal","thawe,GopalGanj,Bihar","kunalSharmaraj09@gmail.com",8668034388L,true);
       object1.displayDetails();
        System.out.println("==========================================");
       Customer object2=new Customer();
       object2.setName("ramu");
       object2.setAddress("thawe,gopalGanj,bihar");
       object2.setEmailId("aryan80835277@gmail.com");
       object2.setMobileNo(8083825277L);
       object2.setPremiumMemberShip(true);
       object2.displayDetails();

    }


}

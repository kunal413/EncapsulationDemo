package dataCustomer;

public class Customer {
    private String name;
    private String address;
    private String emailId;
    private long mobileNo;
    private boolean premiumMemberShip;
    public Customer(){
    }

    public Customer(String name, String address, String emailId, long mobileNo, boolean premiumMemberShip) {
        this.name = name;
        this.address = address;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.premiumMemberShip = premiumMemberShip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public boolean isPremiumMemberShip() {
        return premiumMemberShip;
    }

    public void setPremiumMemberShip(boolean premiumMemberShip) {
        this.premiumMemberShip = premiumMemberShip;
    }
    public void DisplayDetails(){
        System.out.println("getName() = " + getName());
        System.out.println("getAddress() = " + getAddress());
        System.out.println("getEmailId() = " + getEmailId());
        System.out.println("getMobileNo() = " + getMobileNo());
        System.out.println("isPremiumMemberShip() = " + isPremiumMemberShip());
    }
}

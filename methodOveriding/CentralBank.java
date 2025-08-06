package methodOveriding;

public class CentralBank {
    public void getBankName(){
        System.out.println("Central Bank");
    }

    public void getIntrestRate(){
        System.out.println("intrest rate of cental bank is 0%");
    }

    public void getExchangeRate(){
        System.out.println("1USD = 140Nrp");
        System.out.println("1Yen = 20Nrp");
        System.out.println("1Dhirum = 12Nrp");
    }
    public boolean isLockerFacilityAvailable(){
        return false;
    }
}

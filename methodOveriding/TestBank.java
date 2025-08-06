package methodOveriding;

public class TestBank {
    public static void main(String[] args) {
  // printing bank all info by using static method i.e. printBankInfo(CentralBank bank) i.e. run time polymorphism
        NabilBank nabilBank = new NabilBank();
        printBankInfo(nabilBank);

        EverestBank everestBank = new EverestBank();
        printBankInfo(everestBank);

        KumariBank kumariBank = new KumariBank();
        printBankInfo(kumariBank);

        // calling specific method of particular child class
        nabilBank.getBankName();
        everestBank.getIntrestRate();
        /*
        -------------we can call any method of particular class like above as well ---------------------
         */


    }

    //runtime polymorphism is achieved here
    // this method works for all bank type because of parent class reference as argument
    static void printBankInfo(CentralBank bank){
        System.out.println("----------------------------------------------------------");
        bank.getBankName();
        bank.getExchangeRate();
        bank.getIntrestRate();
        System.out.println("Locker Facility available is : "+bank.isLockerFacilityAvailable());
        System.out.println("------------------------------------------------------------\n");
    }
}

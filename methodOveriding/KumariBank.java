package methodOveriding;

public class KumariBank extends CentralBank{
    @Override
    public void getIntrestRate() {
        System.out.println("Intrest rate of kumari bank is 15%");
    }

    @Override
    public void getBankName() {
        System.out.println("Kumari Bank ltd");
    }

    @Override
    public boolean isLockerFacilityAvailable() {
        return true;
    }
}

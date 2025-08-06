package methodOveriding;

public class NabilBank extends CentralBank{
    @Override
    public void getBankName() {
        System.out.println("Nabil Bank ltd");
    }

    @Override
    public void getIntrestRate(){
        System.out.println("Intrest rate if nabil bank is 12%");
    }

    @Override
    public boolean isLockerFacilityAvailable() {
        return true;
    }
}

package methodOveriding;

import java.util.SortedMap;

public class EverestBank extends CentralBank{
    @Override
    public boolean isLockerFacilityAvailable() {
        return true;
    }

    @Override
    public void getBankName() {
        System.out.println("Everest Bank");
    }

    @Override
    public void getIntrestRate() {
        System.out.println("Interest rate of everest bank is 14%");
    }

}

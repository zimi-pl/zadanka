package pl.zimi.zadanka.naukawlasna;

public class Tank {
    public class turret {
        public turret() {
        }
    }

    // fillTank overloaded method
    protected final int TankCapacity = 60;
    protected int fuelLevel = TankCapacity;

    public void fillTank() {
        int toFill = TankCapacity - fuelLevel;
        fillTank(toFill);
    }

    public void fillTank(int toFill) {
        if (toFill + fuelLevel > TankCapacity) {
            System.out.println("too much of fuel");
        } else {
            fuelLevel += toFill;
            System.out.println("tank is filled with " + toFill + " litres of fuel");
        }
    }

    public int getFuelLevel() {
        return this.fuelLevel;
    }

}






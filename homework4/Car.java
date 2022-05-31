public class Car {
    private double volumeOfTheTank;
    private double tankResidue;
    private double fuelUse;
    private double priceOfTheGasoline;
    private double spentFuel;


    public Car() {
    }

    public Car(double volumeOfTheTank, double tankResidue, double fuelUSe, double priceOfTheGasoline) {
        this.volumeOfTheTank = volumeOfTheTank;
        this.tankResidue = tankResidue;
        this.fuelUse = fuelUSe;
        this.priceOfTheGasoline = priceOfTheGasoline;
    }

    public double getVolumeOfTheTank() {
        return volumeOfTheTank;
    }

    public void setVolumeOfTheTank(double volumeOfTheTank) {
        this.volumeOfTheTank = volumeOfTheTank;
    }

    public double getTankResidue() {
        return tankResidue;
    }

    public void setTankResidue(double tankResidue) {
        this.tankResidue = tankResidue;
    }

    public double getFuelUse() {
        return fuelUse;
    }

    public void setFuelUse(double fuelUse) {
        this.fuelUse = fuelUse;
    }

    public void fillTheTank() {
        if (tankResidue == volumeOfTheTank) {
            System.out.println("The tank is already full!");
        } else {
            double freeSpace = volumeOfTheTank - tankResidue;
            tankResidue = tankResidue + freeSpace;
        }
    }

    public void defineTankResidueInNkm(double distance) {
        double neededFuel = (distance / 100) * fuelUse;
        double amountOfFuelLeft = tankResidue - neededFuel;
        if (amountOfFuelLeft > 0) {
            spentFuel+=neededFuel;
            tankResidue = amountOfFuelLeft;
            System.out.println("Fuel balance: " + tankResidue + " litres.");
        } else  {
            System.out.println("You don't have enough fuel to reach your destination.");
        }
    }

    public void printTripInfo() {
        double costOfTheTrip = spentFuel * priceOfTheGasoline;
        System.out.println("Cost of the trip: " + costOfTheTrip + "\nFuel balance at destination: " + tankResidue);
    }

    public void defineAmountOfFuelForDestination(double distance) {
        double neededAmountOfFuel = (distance / 100) * fuelUse - tankResidue;
        if (neededAmountOfFuel>0) {
            double priceOfTheNeededFuel = priceOfTheGasoline * neededAmountOfFuel;
            System.out.println("To reach your destination you need to refuel your car with " + Math.round(neededAmountOfFuel) + " more litres.\nCost of the fuel: " + priceOfTheNeededFuel);
        }else {
            System.out.println("You have enough fuel to reach your destination.");
        }
    }

}


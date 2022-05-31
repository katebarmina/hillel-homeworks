public class Main {
    public static void main(String[] args) {

    Car car = new Car(50,50,15,Double.parseDouble(args[0]));
    driveFromOdessaToKyiv(car);

    }
    public static void driveFromOdessaToKyiv(Car car){
        double distanceFromOdessaToKyiv = 479.5;
        car.defineAmountOfFuelForDestination(distanceFromOdessaToKyiv);
        car.defineTankResidueInNkm(178.5);//от Одессы до Кривого Озера
        car.fillTheTank();
        car.defineTankResidueInNkm(152.8);//от Кривого Озера до Жашкова
        car.fillTheTank();
        car.defineTankResidueInNkm(148.2);//от Жашкова до Киева
        car.printTripInfo();
    }
}

public class RunHM6 {
    public static void main(String[] args) {
        SubscriberGenerator subscriberGenerator = new SubscriberGenerator();
        Subscriber[] subscribers = subscriberGenerator.createArrayOfSubscribers();
        SubscriberService subscriberService = new SubscriberServiceImp();

        subscriberService.makeALongDistanceCall(40, subscribers[4]);
        subscriberService.makeACityCall(260, subscribers[1]);
        subscriberService.makeALongDistanceCall(20, subscribers[2]);
        subscriberService.useInternet(10, subscribers[3]);
        subscriberService.useInternet(30, subscribers[2]);

        subscriberService.printSubsWithExceededLimitOfCityCalls(subscribers);
        subscriberService.printSubsWhoMadeLongDistance(subscribers);
        subscriberService.searchSubsByLetter(subscribers, 'I');
        subscriberService.printTotalInternetTrafficConsumptionOfCity(subscribers, "Kyiv");
        System.out.println("Number of subscribers with negative balance: " + subscriberService.numberOfSubsWithNegativeBalance(subscribers));

    }
}

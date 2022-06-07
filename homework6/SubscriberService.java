public interface SubscriberService {
    void printSubsWithExceededLimitOfCityCalls(Subscriber[] subscribers);

    void printSubsWhoMadeLongDistance(Subscriber[] subscribers);

    void searchSubsByLetter(Subscriber[] subscribers, char letter);

    void printTotalInternetTrafficConsumptionOfCity(Subscriber[] subscribers, String city);

    int numberOfSubsWithNegativeBalance(Subscriber[] subscribers);

    void makeACityCall(double durationOfTheCall, Subscriber subscriber);

    void makeALongDistanceCall(double durationOfTheCall, Subscriber subscriber);

    void useInternet(double numberOfGB, Subscriber subscriber);

}

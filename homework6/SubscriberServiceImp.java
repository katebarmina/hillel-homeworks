import java.util.Locale;

public class SubscriberServiceImp implements SubscriberService {

    @Override
    public void printSubsWithExceededLimitOfCityCalls(Subscriber[] subscribers) {
        System.out.println("Subscribers with exceeded limit of city calls :");
        for (Subscriber s : subscribers) {
            if (s.getTimeOfCityCalls() > s.getLimitOfTimeOfCityCalls()) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void printSubsWhoMadeLongDistance(Subscriber[] subscribers) {
        System.out.println("Subscribers who made long distance calls:");
        for (Subscriber s : subscribers) {
            if (s.getTimeOfLongDistanceCalls() != 0) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void searchSubsByLetter(Subscriber[] subscribers, char letter) {
        System.out.println("Subscribers last names of whom starts with " + letter + " :");
        for (Subscriber s :
                subscribers) {
            if (s.getLastName().startsWith(String.valueOf(letter).toUpperCase(Locale.ROOT))) {
                System.out.printf("%s %s %s Phone number: %s Balance: %1.1f\n", s.getLastName(), s.getFirstName(), s.getMiddleName(), s.getPhoneNumber(), s.getBalance());
            }
        }
    }

    @Override
    public void printTotalInternetTrafficConsumptionOfCity(Subscriber[] subscribers, String city) {
        int totalInterTrafficConsumption = 0;
        for (Subscriber s : subscribers) {
            if (s.getCity().equals(city)) {
                totalInterTrafficConsumption += s.getInternetTraffic();
            }
        }
        System.out.println("Total internet traffic consumption in " + city + ": " + totalInterTrafficConsumption+ " GB");
    }

    @Override
    public int numberOfSubsWithNegativeBalance(Subscriber[] subscribers) {
        int count = 0;
        for (Subscriber s : subscribers) {
            if (s.getBalance() < 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void makeACityCall(double durationOfTheCall, Subscriber subscriber) {
        int costOfOneCityCall = 5;
        subscriber.setTimeOfCityCalls(durationOfTheCall + subscriber.getTimeOfCityCalls());
        if (subscriber.getTimeOfCityCalls() > subscriber.getLimitOfTimeOfCityCalls()) {
            subscriber.setBalance(subscriber.getBalance() - costOfOneCityCall);
        }

    }

    @Override
    public void makeALongDistanceCall(double durationOfTheCall, Subscriber subscriber) {
        int costOfOneLongDistanceCall = 15;
        subscriber.setTimeOfLongDistanceCalls(durationOfTheCall + subscriber.getTimeOfLongDistanceCalls());
        if (subscriber.getTimeOfLongDistanceCalls() > subscriber.getLimitOfTimeOfLongDistanceCalls()) {
            subscriber.setBalance(subscriber.getBalance() - costOfOneLongDistanceCall);
        }

    }

    @Override
    public void useInternet(double numberOfGB, Subscriber subscriber) {
        int costOf1GB = 3;
        subscriber.setInternetTraffic(subscriber.getInternetTraffic() + numberOfGB);
        if (subscriber.getInternetTraffic() > subscriber.getLimitOfInternetTraffic()) {
            double numberOfLackGB = subscriber.getInternetTraffic() - subscriber.getLimitOfInternetTraffic();
            subscriber.setBalance(subscriber.getBalance() - (numberOfLackGB * costOf1GB));
        }
    }
}

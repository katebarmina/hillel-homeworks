public class Subscriber {

    private String identifier;
    private String firstName;
    private String middleName;
    private String lastName;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private double balance;
    private double timeOfCityCalls;
    private double timeOfLongDistanceCalls;
    private double internetTraffic;
    private double limitOfTimeOfCityCalls;
    private double limitOfTimeOfLongDistanceCalls;
    private double limitOfInternetTraffic;


    public Subscriber() {
    }

    public Subscriber(String identifier, String firstName, String middleName, String lastName, String city, String phoneNumber, String contractNumber, double balance, double timeOfCityCalls, double timeOfLongDistanceCalls, double internetTraffic, double limitOfTimeOfCityCalls, double limitOfTimeOfLongDistanceCalls, double limitOfInternetTraffic) {
        this.identifier = identifier;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.timeOfCityCalls = timeOfCityCalls;
        this.timeOfLongDistanceCalls = timeOfLongDistanceCalls;
        this.internetTraffic = internetTraffic;
        this.limitOfTimeOfCityCalls = limitOfTimeOfCityCalls;
        this.limitOfTimeOfLongDistanceCalls = limitOfTimeOfLongDistanceCalls;
        this.limitOfInternetTraffic = limitOfInternetTraffic;
    }


    public double getLimitOfTimeOfCityCalls() {
        return limitOfTimeOfCityCalls;
    }

    public void setLimitOfTimeOfCityCalls(double limitOfTimeOfCityCalls) {
        this.limitOfTimeOfCityCalls = limitOfTimeOfCityCalls;
    }

    public double getTimeOfLongDistanceCalls() {
        return timeOfLongDistanceCalls;
    }

    public void setTimeOfLongDistanceCalls(double timeOfLongDistanceCalls) {
        this.timeOfLongDistanceCalls = timeOfLongDistanceCalls;
    }

    public double getLimitOfTimeOfLongDistanceCalls() {
        return limitOfTimeOfLongDistanceCalls;
    }

    public void setLimitOfTimeOfLongDistanceCalls(double limitOfTimeOfLongDistanceCalls) {
        this.limitOfTimeOfLongDistanceCalls = limitOfTimeOfLongDistanceCalls;
    }

    public double getLimitOfInternetTraffic() {
        return limitOfInternetTraffic;
    }

    public void setLimitOfInternetTraffic(double limitOFInternetTraffic) {
        this.limitOfInternetTraffic = limitOFInternetTraffic;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTimeOfCityCalls() {
        return timeOfCityCalls;
    }

    public void setTimeOfCityCalls(double timeOfCityCalls) {
        this.timeOfCityCalls = timeOfCityCalls;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "identifier='" + identifier + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", timeOfCityCalls=" + timeOfCityCalls +
                ", timeOfInterCityCalls=" + timeOfLongDistanceCalls +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}

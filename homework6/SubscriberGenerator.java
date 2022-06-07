public class SubscriberGenerator {
    public Subscriber[] createArrayOfSubscribers() {
        Subscriber[] subscribers = new Subscriber[5];
        subscribers[0] = new Subscriber("9876542345", "Petr", "Ivanovich", "Petrov", "Kharkov", "0983487456", "11111111111111111111", 0, 0, 0, 0, 250, 50, 20);
        subscribers[1] = new Subscriber("9876542346", "Ivan", "Petrovich", "Ivanov", "Kharkov", "0983487465", "11111111111111111112", 0, 0, 0, 0, 250, 50, 20);
        subscribers[2] = new Subscriber("9876542347", "Maria", "Ivanovna", "Petrova", "Kyiv", "0983487458", "11111111111111111113", 0, 0, 0, 0, 250, 50, 20);
        subscribers[3] = new Subscriber("9876542341", "Alexander", "Alexandrovich", "Smirnov", "Kyiv", "0983487411", "11111111111111111114", 0, 0, 0, 0, 250, 50, 20);
        subscribers[4] = new Subscriber("9876542399", "Dmitriy", "Stepanovich", "Stepanov", "Krivoy Rog", "0983487444", "11111111111111111115", 0, 0, 0, 0, 250, 50, 20);
        return subscribers;
    }
}

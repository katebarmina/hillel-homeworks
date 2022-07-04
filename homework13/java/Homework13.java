import java.util.*;
import java.util.stream.Collectors;

public class Homework13 {

    double findMeanValue(Collection<Integer> collection){
        return collection.stream().mapToInt(i -> i).average().getAsDouble();
    }

    List<Pair> convertToPairList(Collection<String> collection){
        return collection.stream().map(i -> new Pair(i,i.toUpperCase(Locale.ROOT))).collect(Collectors.toList());
    }


   Collection<String> filterCollectionByLengthAndCase(Collection<String> collection){
        return collection.stream().filter(i -> i.length() == 4 && i.equals(i.toLowerCase())).collect(Collectors.toList());
   }

}

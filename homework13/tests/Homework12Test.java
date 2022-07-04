import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;


class Homework12Test {
    private final Homework13 homework13 = new Homework13();

    @Test
    void findMeanValue() {
        List<Integer> list =Arrays.asList(3,4,6,7,8,1,2,4,10);
        double result = homework13.findMeanValue(list);
        Assertions.assertEquals(5.0,result);
    }


    @Test
    void filterCollectionByLengthAndCase() {
        List<String> list = Arrays.asList("apple","keys","DARK","mark");
        list = (List<String>) homework13.filterCollectionByLengthAndCase(list);
        Assertions.assertEquals(2,list.size());
    }

    @Test
    void convertToPairList() {
        List<String> inList= List.of("one","two");
        List<Pair> outList = homework13.convertToPairList(inList);
        Pair checkObject = new Pair("one","ONE");
        Assertions.assertEquals(outList.get(0), checkObject);
    }
}
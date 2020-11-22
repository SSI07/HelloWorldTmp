package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams_Collectors {
    public static void main(String args[]){
        List<Integer> val= Arrays.asList(1,2,3);
        List<String> val2= Arrays.asList("a","b","c","d");
       // System.out.println(val.stream().collect(Collectors.joining("|")));
        System.out.println(val.stream().filter(i->i.equals(2)).collect(Collectors.toList()));

        System.out.println(val2.stream().collect(Collectors.counting()));
        System.out.println(val.stream().reduce(0,(c,e)->c+e));
        System.out.println(val.stream().collect(Collectors.averagingInt(i->i/3)));
       }
    }

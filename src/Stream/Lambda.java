package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String args[])
    {
        Random rand=new Random();
        Supplier<Integer> val=()->rand.nextInt(1000);
        //System.out.println(val.get());
        UpperConcat s= (s1,s2)->{return s1.toUpperCase()+s2.toUpperCase();};

        System.out.println(val.get()+"-"+s.Join_and_Concat("ssi","ss"));
        Help c1=new Help() ;
        c1.Join_and_Concat("w","2");
        c1.add();
        System.out.println("====================================");
        String myString="Let's split this into an array";
        String[] arr=myString.split(" ");
        for (String s1:arr) {
            System.out.println(s1);
        }
        System.out.println("==========Lambda Expression===========");
        Runnable runnable=()-> {
            String myString1 = "Let's split this into an array";

            String[] arr1 = myString1.split(" ");

            List<String> lst = Arrays.asList(arr1);
            lst.forEach(System.out::println);
        };
            Function<String,String> lambda=source->{
              StringBuilder r=new StringBuilder();
              for(int i=0;i<source.length();i++)
                  if(i%2==1)
                      r.append(source.charAt(i));
              return r.toString();
            };
        System.out.println(lambda.apply("1234567890"));
        System.out.println(lambda("1234567890"));
        Supplier<String> ilovejava=()-> "I LOVE JAVA";
        System.out.println(ilovejava.get());

        List<String> topNames=Arrays.asList(
                "Amelia","Olivia","emily","isla","jacob","jack","eva","harry"
        );

       /* Collections.sort(topNames, (o1,o2)-> {
             return o1.toUpperCase().compareTo(o2.toUpperCase());

        });
       */
        topNames.sort(String::compareTo);
        topNames.forEach(s3-> System.out.println(s3.substring(0,1).toUpperCase()+(s3.substring(1))));

        System.out.println("=============streams====================");
        topNames.stream()
                .map(s3->s3.substring(0,1).toUpperCase()+(s3.substring(1)))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println("=============streams beginning with A====================");
        topNames.stream()
                .map(s3->s3.substring(0,1).toUpperCase()+(s3.substring(1)))
                .filter(s3->s3.startsWith("A"))
                .forEach(System.out::println);

        System.out.println("=============streams count====================");
        long count=topNames.stream()
                .map(s3->s3.substring(0,1).toUpperCase()+(s3.substring(1)))
                .filter(s3->s3.startsWith("A"))
                .count();
        System.out.println(count);


        System.out.println("=============streams using peek====================");
        topNames.stream()
                .map(s3->s3.substring(0,1).toUpperCase()+(s3.substring(1)))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.groupingBy(Function.identity()));

    }
    public static String lambda(String source){
        StringBuilder r=new StringBuilder();
        for(int i=0;i<source.length();i++)
            if(i%2==1)
                r.append(source.charAt(i));
        return r.toString();
    }

}
abstract class Concat{
    public String Join_and_Concat(String s1,String s2){
        return s1+s2;
    }
}

class Help extends Concat{
    public void add(){
        System.out.println(1+2);
    }
}

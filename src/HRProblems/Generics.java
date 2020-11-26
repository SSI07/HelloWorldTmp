package HRProblems;
import java.util.*;

public class Generics {
    public static List<ListCreator> list1=new ArrayList<>();
    public static Map<Integer,Key> map1=new HashMap<>();

    public static void main(String[] args) {
        ListCreator lc;
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=length;i++)
        {
            String[] arr=sc.nextLine().split(" ");
            lc=new ListCreator();
            for(int j=1;j<arr.length;j++) {
                lc.add(Integer.parseInt(arr[j]));
            }

            list1.add(lc);

        }
        String[] arr2;
        int length2=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<length2;i++) {
            arr2 = sc.nextLine().split(" ");
            map1.put(i,new Key(Integer.parseInt(arr2[0]), Integer.parseInt(arr2[1])));
        }

        for(int i=0;i<list1.size();i++)
            try
            {
                System.out.println(list1.get((map1.get(i).getVal1())-1).getList().get((map1.get(i).getVal2())-1));

            }
            catch (Exception e){
                System.out.println("ERROR!");
            }

    }
}

package HRProblems;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int max=0;
        Set set1=new HashSet();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        Iterator i=deque.iterator();
        while(i.hasNext()){
                for (int j = 0; j < m; j++) {
                    if(i.hasNext())
                        set1.add(i.next());
                }
                deque.pop();
                if(max<set1.size())
                    max=set1.size();

                i = deque.iterator();
                set1 = new HashSet();

        }
        System.out.println(max);

    }
}

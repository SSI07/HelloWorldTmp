package HRProblems;

import java.util.ArrayList;
import java.util.List;

public class ListCreator {
    private List<Integer> list;

    public ListCreator() {
        this.list = new ArrayList<>();

    }
    public void add(int val){
        this.list.add(val);

    }


    public List<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ListComp{" +
                "list=" + list +
                '}';
    }
}

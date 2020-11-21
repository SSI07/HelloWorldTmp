package Generics;

import java.util.*;

public class Main {
    private static Map<String,Integer> table=new HashMap<>();

    public static void main(String[] args) {

        FootballPlayer fp=new FootballPlayer("ssi");
        FootballPlayer fp2=new FootballPlayer("irfan");
        Team1<FootballPlayer> adelaideCrows = new Team1<>("Adelaide Crows");
        adelaideCrows.addPlayers(fp);
        adelaideCrows.addPlayers(fp2);

        Team1<FootballPlayer> Crows2 = new Team1<>("ROckerzz");
        Crows2.addPlayers(fp);
        Crows2.addPlayers(fp2);

        Team1<FootballPlayer> Crows3 = new Team1<>("Bulls");
        Crows3.matches(Crows2,200,140);
        point_table(Crows3);

        adelaideCrows.matches(Crows2,100,200);
        adelaideCrows.matches(Crows3,140,141);
        point_table(adelaideCrows);

        Crows2.matches(Crows3,100,200);
        point_table(Crows2);
        System.out.println("Point Table");
      //
        List list=new LinkedList(table.entrySet());
        Collections.sort(list,(Object o1, Object o2)->

                 ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue())

        );
/*
        for(Object l: list){
            System.out.println(l.toString());
        }*/
        list.forEach(i-> System.out.println(i));
       /* for(String m:table.keySet())
            System.out.println(m+" : "+table.get(m));

*/
    }
    public static void point_table(Team1 team){
        table.put(team.getTeamName(),team.points());
        System.out.println("Team : "+team.getTeamName());
        System.out.println("No. of players : "+team.numPlayers());
        System.out.println("WON : "+team.getWon()+" | LOST : "+team.getLost()+ " | Points : "+team.points());
        System.out.println("==============================================================");
    }
}

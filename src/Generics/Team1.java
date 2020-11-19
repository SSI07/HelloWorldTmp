package Generics;

import java.util.ArrayList;


public class Team1<T extends Player>{
    private String teamName;
    private int won=0;
    private int lost=0;
    private int tied=0;
    private ArrayList<T> team=new ArrayList<>();

    public Team1(String teamName) {
        this.teamName = teamName;


    }
    public int numPlayers(){
        return team.size();
    }
    public String getTeamName() {
        return teamName;
    }
    public void addPlayers(T p){
        if(team.contains(p))
            System.out.println(p.getName()+"Player already exists");
        else
            team.add(p);
    }
    public void matches(Team1 opponent,int opp_score,int our_score)
    {
        if(opp_score==our_score)
            tied++;
        else if(our_score>opp_score)
            won++;
        else
            lost++;
        int pts=(won*2)+tied;

    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }
    public int points(){
        return (won*2)+tied;
    }

}

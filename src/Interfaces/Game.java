package Interfaces;

public class Game {
    private int id;
    private String Players;
    public Game(int id,String Players){
        this.Players=Players;
        this.id=id;
    }

    public String getPlayers() {
        return Players;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", Players='" + Players + '\'' +
                '}';
    }
}

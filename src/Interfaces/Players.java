package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Players implements Saveable{
    private List<Game> playGame1=new ArrayList<>();



    @Override
    public void addList(Game game) {
        playGame1.add(game);
    }

    @Override
    public List<Game> getList() {
        return playGame1;
    }
}

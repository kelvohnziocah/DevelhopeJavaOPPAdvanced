package co.develhope.introduction;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<String> players;
    public Team() {
        players = new ArrayList<>();
    }
    public void addPlayers(String player){
        players.add(player);
    }
    public List <String> getPlayers(){
        return players;
    }
    public static void main(String[] args){
        Team team = new Team();
        team.addPlayers("Kipchoge");
        team.addPlayers("Kieno");
        team.addPlayers("Kelvi");
        List <String> players = team.getPlayers();
        System.out.println("Players are");
        for (String player: players){
            System.out.println(player);
        }

    }
}

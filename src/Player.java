import java.util.List;

public class Player {
    private String playerName;
    private int playerId;

    List<Warehouse> warehouses;

    public Player(String playerName,int playerId){
        this.playerName = playerName;
        this.playerId = playerId;
    }
    public String getplayerName() {
        return playerName;
    }
    public int getplayerId() {
        return playerId;
    }
}

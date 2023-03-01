package FootballTeamGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        Validators.validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPLayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
//        This will be a little slower than the for loop
//        Optional<Player> playerToRemove = players.stream().filter(p -> p.getName().equals(playerName)).findFirst();
//        if (!playerToRemove.isPresent()) {
//            throw new IllegalArgumentException("Player " + playerName + " is not in " + getName() + " team.");
//        }
//        players.remove(playerToRemove.get());
        int toRemoveIndex = -1;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(playerName)) {
                toRemoveIndex = i;
                break;
            }
        }

        if (toRemoveIndex == -1) {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + getName() + " team.");
        }

        players.remove(toRemoveIndex);
    }

    public double getRating() {
        return  Math.round(players.stream().mapToDouble(p -> p.getOverallSKilLevel()).average().orElse(0));
    }
}

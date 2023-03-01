package FootballTeamGenerator;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        throw new IllegalStateException("TODO");
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPLayer(Player player) {
        throw new IllegalStateException("TODO");
    }

    public void removePlayer(String playerName) {
        throw new IllegalStateException("TODO");
    }

    public double getRating() {
        throw new IllegalStateException("TODO");
    }
}

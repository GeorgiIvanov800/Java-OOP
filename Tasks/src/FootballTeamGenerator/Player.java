package FootballTeamGenerator;

import java.util.IllegalFormatCodePointException;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        Validators.validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setEndurance(int endurance) {
        validateStat(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        validateStat(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStat(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStat(passing,"Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validateStat(shooting,"Shooting");
        this.shooting = shooting;
    }

    public double getOverallSKilLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / (double) 5;
    }

    private static void validateStat(int statValue, String statName) {
        if (statValue < 0 || statValue > 100) {
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
    }
}

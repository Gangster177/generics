package entity.loggedEntity;

import entity.TeamLead;

public class LoggedTeamLead {
    private TeamLead oldTeamLead;
    private TeamLead newTeamLead;

    public LoggedTeamLead(TeamLead oldTeamLead, TeamLead newTeamLead) {
        this.oldTeamLead = oldTeamLead;
        this.newTeamLead = newTeamLead;
    }

    public TeamLead getOldTeamLead() {
        return oldTeamLead;
    }

    public TeamLead getNewTeamLead() {
        return newTeamLead;
    }

    @Override
    public String toString() {
        return "LoggedTeamLead{" +
                "oldTeamLead=" + oldTeamLead + "\n\r" +
                ", newTeamLead=" + newTeamLead +
                '}';
    }
}

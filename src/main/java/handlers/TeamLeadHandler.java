package handlers;

import entity.Developer;
import entity.TeamLead;
import entity.loggedEntity.LoggedTeamLead;

import java.util.ArrayList;
import java.util.Collections;

public class TeamLeadHandler {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead(
                "Nik",
                "OpenSource",
                200_000,
                Collections.emptyList());
        Developer dev = new Developer(
                "Serega",
                50_000,
                "OpenSource");

        TeamLead changeTeamLead = changeTeamLead(teamLead, dev);
        LoggedTeamLead loggedTeamLead = new LoggedTeamLead(teamLead, changeTeamLead);
        System.out.println(loggedTeamLead);
    }
    public static TeamLead changeTeamLead(TeamLead t, Developer hiredDev){
        return t.hireDeveloper(hiredDev);
    }
}

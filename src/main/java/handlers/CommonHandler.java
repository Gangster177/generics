package handlers;

import entity.Developer;
import entity.LoggedEntity;
import entity.TeamLead;
import handlers.crisis.AbstractCrisisHandler;

public class CommonHandler {
    public static void main(String[] args) {
        Developer dimonDev = new Developer("Dima", 100_000, "OpenSource");
        AbstractCrisisHandler<Developer> developerAbstractCrisisHandler = new handlers.crisis.DeveloperCrisisHandler();
        LoggedEntity<Developer> loggedEntity =developerAbstractCrisisHandler.handleEmployee(dimonDev);
        System.out.println(loggedEntity);
    }

    public static Developer changeDeveloper(Developer d) {
        return d.changeProject("Sberbank")
                .changeSalary(1.5);
    }

    public static TeamLead changeTeamLead(TeamLead teamLead) {
        return teamLead.hireDeveloper(new Developer("Anton", 100_000, "Sberbank"));
    }
}

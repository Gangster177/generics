package handlers;

import entity.Developer;
import entity.LoggedEntity;
import entity.TeamLead;
import handlers.crisis.AbstractCrisisHandler;
import handlers.crisis.DeveloperCrisisHandler;
import handlers.crisis.LeadCrisisHandler;
import repository.DeveloperRepository;
import repository.Repository;

import java.util.Collections;

public class HandlerWithRepo {
    public static void main(String[] args) {
        Repository<Developer> developerRepository = new DeveloperRepository();
        developerRepository.save(new Developer("Dima", 150_000, "Sberbank"));
        developerRepository.save(new Developer("Alex", 125_000, "Sberbank"));
        developerRepository.save(new Developer("Ivan", 100_000, "Sberbank"));

        TeamLead teamLead = new TeamLead("Sergei", "Sberbank", 200_000, Collections.emptyList());
        teamLead = teamLead
                .hireDeveloper(developerRepository.findByName("Dima"))
                .hireDeveloper(developerRepository.findByName("Alex"))
                .hireDeveloper(developerRepository.findByName("Ivan"));
        System.out.println("1." + teamLead);

        AbstractCrisisHandler<Developer> developerCrisisHandler = new DeveloperCrisisHandler();
        System.out.println("2." + developerCrisisHandler.handleEmployee(developerRepository.findByName("Ivan")));

        AbstractCrisisHandler<TeamLead> handler = new LeadCrisisHandler(developerRepository);
        LoggedEntity<TeamLead> teamLeadLoggedEntity = handler.handleEmployee(teamLead);
        System.out.println("3." + teamLeadLoggedEntity);
    }
}

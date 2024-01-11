package handlers.crisis;

import entity.Developer;
import entity.TeamLead;
import repository.Repository;

public class LeadCrisisHandler extends AbstractCrisisHandler<TeamLead> {
    private Repository<Developer> repository;

    public LeadCrisisHandler(Repository<Developer> repository) {
        this.repository = repository;
    }

    @Override
    protected TeamLead handle(TeamLead employee) {
        Developer ivan = repository.findByName("Ivan");
        repository.delete(ivan);
        return employee.fireDeveloper(ivan);
    }
}

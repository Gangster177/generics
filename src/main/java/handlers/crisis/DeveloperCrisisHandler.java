package handlers.crisis;

import entity.Developer;

public class DeveloperCrisisHandler extends AbstractCrisisHandler<Developer> {
    @Override
    protected Developer handle(Developer employee) {
        return employee.changeSalary(0.5);
    }
}

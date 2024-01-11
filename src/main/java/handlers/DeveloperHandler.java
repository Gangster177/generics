package handlers;

import entity.Developer;
import entity.LoggedEntity;
import entity.loggedEntity.LoggedDeveloper;

public class DeveloperHandler {
    public static void main(String[] args) {
        Developer dimonDev = new Developer("Dima", 100_000, "OpenSource");
        Developer promotedDev = changeDeveloper(dimonDev);

        LoggedDeveloper loggedDeveloper = new LoggedDeveloper(dimonDev, promotedDev);
        System.out.println(loggedDeveloper);
        //change Logger
        LoggedEntity<Developer> loggedEntity = new LoggedEntity<>(dimonDev, promotedDev);
        System.out.println(loggedEntity);
    }

    public static Developer changeDeveloper(Developer d) {
        return d.changeProject("Sberbank")
                .changeSalary(1.5);
    }
}

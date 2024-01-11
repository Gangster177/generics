package entity;

import java.util.ArrayList;
import java.util.List;

public class TeamLead implements Employee{
    private String name;

    private String currentProject;

    private Integer salary;

    private List<Developer> developers;

    public TeamLead(String name, String currentProject, Integer salary, List<Developer> developers) {
        this.name = name;
        this.currentProject = currentProject;
        this.salary = salary;
        this.developers = developers;
    }

    public String getName() {
        return name;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    public TeamLead hireDeveloper(Developer d){
        List<Developer> newStaff = new ArrayList<>(developers);
        newStaff.add(d);
        return new TeamLead(name, currentProject, salary, newStaff);
    }

    public TeamLead fireDeveloper(Developer developer){
        List<Developer> newStaff = new ArrayList<>(developers);
        newStaff.remove(developer);
        return new TeamLead(name, currentProject, salary, newStaff);
    }

    @Override
    public String toString() {
        return "TeamLead{" +
                "name='" + name + '\'' +
                ", currentProject='" + currentProject + '\'' +
                ", salary=" + salary +
                ", developers=" + developers +
                '}';
    }
}

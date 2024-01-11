package entity;

public class Developer{
    private String name;
    private Integer salary;
    private String currentProject;

    public Developer(String name, Integer salary, String currentProject) {
        this.name = name;
        this.salary = salary;
        this.currentProject = currentProject;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public Developer changeSalary(double coefficient) {
        return new Developer(name, (int) (salary * coefficient), currentProject);
    }
    public Developer changeProject(String newProject) {
        return new Developer(name, salary, newProject);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", currentProject='" + currentProject + '\'' +
                '}';
    }
}

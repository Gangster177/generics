package handlers.crisis;

import entity.Employee;
import entity.LoggedEntity;

public abstract class AbstractCrisisHandler<T extends Employee> {
    public LoggedEntity<T> handleEmployee(T employee){
        if(employee.getSalary()>120_000){
            return new LoggedEntity<>(employee, handle(employee));
        }
        return new LoggedEntity<>(employee, employee);
    }
    protected abstract T handle(T employee);
}

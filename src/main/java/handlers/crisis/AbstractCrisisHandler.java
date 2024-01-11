package handlers.crisis;

import entity.LoggedEntity;

public abstract class AbstractCrisisHandler<T> {

    public LoggedEntity<T> handleEmployee(T employee){
        return new LoggedEntity<>(employee, handle(employee));
    }

    protected abstract T handle(T employee);
}

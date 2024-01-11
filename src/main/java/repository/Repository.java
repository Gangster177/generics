package repository;

import com.sun.jdi.request.StepRequest;

public interface Repository<T> {
    T findByName(String name);
    void save(T entity);
    void delete(T entity);
}

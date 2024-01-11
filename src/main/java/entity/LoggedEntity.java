package entity;

public class LoggedEntity<T> {
    private T oldEntity;
    private T newEntity;

    public LoggedEntity(T oldEntity, T newEntity) {
        this.oldEntity = oldEntity;
        this.newEntity = newEntity;
    }

    public T getOldEntity() {
        return oldEntity;
    }

    public T getNewEntity() {
        return newEntity;
    }

    @Override
    public String toString() {
        return "LoggedEntity{" +
                "oldEntity=" + oldEntity + "\n\r" +
                ", newEntity=" + newEntity +
                '}';
    }
}

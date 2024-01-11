package entity.loggedEntity;

import entity.Developer;

public class LoggedDeveloper {
    private Developer oldDeveloper;
    private Developer newDeveloper;

    public LoggedDeveloper(Developer oldDeveloper, Developer newDeveloper) {
        this.oldDeveloper = oldDeveloper;
        this.newDeveloper = newDeveloper;
    }

    public Developer getOldDeveloper() {
        return oldDeveloper;
    }

    public Developer getNewDeveloper() {
        return newDeveloper;
    }

    @Override
    public String toString() {
        return "LoggedDeveloper{" +
                "oldDeveloper=" + oldDeveloper + "\n\r" +
                ", newDeveloper=" + newDeveloper +
                '}';
    }
}

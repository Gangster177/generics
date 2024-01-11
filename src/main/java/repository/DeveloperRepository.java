package repository;

import entity.Developer;

import java.util.ArrayList;
import java.util.List;

public class DeveloperRepository implements Repository<Developer> {
    private static final List<Developer> developers = new ArrayList<>();

    @Override
    public Developer findByName(String name) {
        for (Developer d : developers) {
            if (d.getName().equals(name)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Can't find developer with name + " + name);
    }

    @Override
    public void save(Developer entity) {
        developers.add(entity);
    }

    @Override
    public void delete(Developer entity) {
        developers.remove(entity);
    }
}

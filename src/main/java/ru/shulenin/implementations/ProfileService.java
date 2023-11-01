package ru.shulenin.implementations;

import ru.shulenin.annotition.AutoInjectable;
import ru.shulenin.interfaces.Repository;
import ru.shulenin.interfaces.Service;

public class ProfileService implements Service {
    @AutoInjectable
    private Repository repository;

    public ProfileService() {
    }

    public ProfileService(Repository repository) {
        this.repository = repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}

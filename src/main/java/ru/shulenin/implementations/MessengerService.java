package ru.shulenin.implementations;

import ru.shulenin.annotition.AutoInjectable;
import ru.shulenin.interfaces.Repository;
import ru.shulenin.interfaces.Service;

public class MessengerService implements Service {
    @AutoInjectable
    private Repository repository;

    public MessengerService() {
    }

    public MessengerService(Repository repository) {
        this.repository = repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}

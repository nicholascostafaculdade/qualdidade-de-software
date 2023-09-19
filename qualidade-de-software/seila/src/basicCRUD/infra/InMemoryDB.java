package basicCRUD.infra;

import java.util.ArrayList;

import basicCRUD.models.User;
import basicCRUD.repositories.IUserRepository;
import basicCRUD.repositories.InMemoryUserRepository;

public class InMemoryDB extends Database {
    private ArrayList<User> users = new ArrayList<>();
    public IUserRepository userRepository;

    public InMemoryDB() {
        super();
        this.setUsers(new ArrayList<>());
        this.userRepository = new InMemoryUserRepository(this);
    }

    @Override
    public ArrayList<User> getUsers() {
        return this.users;
    }

    @Override
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}

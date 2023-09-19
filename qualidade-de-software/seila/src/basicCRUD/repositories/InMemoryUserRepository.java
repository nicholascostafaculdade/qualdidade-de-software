package basicCRUD.repositories;

import java.util.ArrayList;
import java.util.Objects;

import basicCRUD.infra.Database;
import basicCRUD.models.User;

public class InMemoryUserRepository implements IUserRepository {
    private final Database database;

    public InMemoryUserRepository(Database database) {
        this.database = database;
    }

    public void createUser(String name, String ra, String course, String shift, char sex) {
        User foundUser = this.getUser(ra);

        if (foundUser != null) {
            throw new Error("User with given \"RA\" already exists and should be unique");
        }

        User newUser = new User(name, ra, course, shift, sex);
        ArrayList<User> users = this.database.getUsers();
        users.add(newUser);
        this.database.setUsers(users);
    }

    @Override
    public User getUser(String ra) {
        ArrayList<User> users = this.getUsers();
        User foundUser = null;

        for (int i = 0; i < this.getUsers().size(); i++) {
            User currentUser = users.get(i);
            if (Objects.equals(currentUser.getRa(), ra)) {
                foundUser = currentUser;
            }
        }

        return foundUser;
    }

    @Override
    public ArrayList<User> getUsers() {
        return this.database.getUsers();
    }

    @Override
    public void updateUser(User user) {
        User foundUser = this.getUser(user.getRa());

        foundUser.setName(user.getName());
        foundUser.setRa(user.getRa());
        foundUser.setCourse(user.getCourse());
        foundUser.setShift(user.getShift());
        foundUser.setSex(user.getSex());
    }

    @Override
    public void deleteUser(String ra) {
        ArrayList<User> users = this.getUsers();

        for (int i = 0; i < users.size(); i++) {
            if (Objects.equals(users.get(i).getRa(), ra)) {
                users.remove(i);
                i--;
            }
        }
    }
}

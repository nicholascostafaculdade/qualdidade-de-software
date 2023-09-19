package basicCRUD.repositories;

import java.util.ArrayList;

import basicCRUD.models.User;

public interface IUserRepository {
    ArrayList<User> getUsers();

    User getUser(String ra);

    void updateUser(User user);

    void createUser(String name, String ra, String course, String shift, char sex);

    void deleteUser(String ra);
}

package basicCRUD.infra;

import java.util.ArrayList;

import basicCRUD.models.User;

public abstract class Database {
    public abstract ArrayList<User> getUsers();

    public abstract void setUsers(ArrayList<User> users);

}

package basicCRUD.repositories;

import java.util.ArrayList;

import basicCRUD.models.User;

public interface IUserRepository {
	public ArrayList<User> getUsers();
	public User getUser(String ra);
	public void updateUser(User user);
	public User createUser(String name, String ra, String course, String shift, char sex);
	public void deleteUser(String ra);
}

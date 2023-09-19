package basicCRUD.infra;

import java.util.ArrayList;

import basicCRUD.models.User;

public class Database {
	private ArrayList<User> users;

	public ArrayList<User> getUsers() {
		return this.users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Database [users=" + this.users.toString() + "]";
	}

}

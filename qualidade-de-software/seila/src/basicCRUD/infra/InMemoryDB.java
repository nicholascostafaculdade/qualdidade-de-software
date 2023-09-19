package basicCRUD.infra;

import java.util.ArrayList;

import basicCRUD.models.User;
import basicCRUD.repositories.IUserRepository;
import basicCRUD.repositories.InMemoryUserRepository;

public class InMemoryDB extends Database {
	public IUserRepository userRepository;

	public InMemoryDB() {
		this.setUsers(new ArrayList<User>());
		this.userRepository = new InMemoryUserRepository(this);
	}
}

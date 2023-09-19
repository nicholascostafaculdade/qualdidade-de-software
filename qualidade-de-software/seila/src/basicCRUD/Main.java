package basicCRUD;

import basicCRUD.infra.InMemoryDB;
import basicCRUD.models.User;
import basicCRUD.repositories.IUserRepository;

public class Main {
    public static void main(String[] args) {
        InMemoryDB inMemoryDB = new InMemoryDB();
        IUserRepository userRepository = inMemoryDB.userRepository;

        System.out.println(userRepository.getUsers());

        userRepository.createUser("Nicholas", "12622120526", "CS", "night", 'M');
        userRepository.createUser("ASDASD", "12622120536", "CS", "night", 'M');
        userRepository.createUser("Lucas", "12622120546", "CS", "night", 'M');

        System.out.println(inMemoryDB.getUsers());

        userRepository.deleteUser("12622120536");

        System.out.println(inMemoryDB.getUsers());

        userRepository.updateUser(new User("Nicholasss", "12622120526", "CS", "night", 'M'));

        System.out.println(inMemoryDB.userRepository.getUsers());
        System.out.println(inMemoryDB.userRepository.getUser("12622120526"));
    }
}

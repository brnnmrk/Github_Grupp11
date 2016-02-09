package eventPlanner.eao;

import javax.ejb.Local;

import eventPlanner.ejb.User;

@Local
public interface userEAOLocal {
	
	public User createUser(User user);
	public User findUser(int userId);
	public User updateUser(User user);
	public void deleteUser(int userId, int phoneNbr, String name, String email, String password, int sex, int age);

}

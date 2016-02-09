package eventPlanner.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import eventPlanner.ejb.User;



@Stateless
@LocalBean
public class userEAOImpl implements userEAOLocal {
	
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

    public userEAOImpl() {
       
    }
    
    public User createUser(User user) {
    	em.persist(user);
    	return user;
    }
    
    public User updateUser(User user){
    	em.merge(user);
    	return user;
    }
    
    public User findUser(int userId){
    	return em.find(User.class, userId);
    }
    
    public void deleteUser (int userId, int phoneNbr, String name, String email, String password, int sex, int age){
    	User e = this.findUser(userId);
    	if (e != null){
    		em.remove(e);
    	}
    }    
    

}

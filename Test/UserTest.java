
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users user1 = new Users();
		user1.setEmail("contact1@email.com");
		user1.setFullName("ba Phuc");
		user1.setPassword("123456");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		entityManager.persist(user1);

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		System.out.println(" A users object was persisted");
	}

}

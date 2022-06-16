package web.dao;


import org.springframework.stereotype.Repository;
import web.model.User;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        userList = entityManager.createQuery("FROM User").getResultList();
        return userList;
    }

    @Override
    public User getUserById(int id) {

        User user = new User();
        user = entityManager.find(User.class, id);

        return user;
    }

    @Override
    public void removeUser(int id) {

        User user = new User();
        user = entityManager.find(User.class, id);
        entityManager.remove(user);

    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User updatedUser) {

         entityManager.merge(updatedUser);


    }

}

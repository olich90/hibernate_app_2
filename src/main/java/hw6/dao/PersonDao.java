package hw6.dao;

import hw6.model.Person;
import hw6.sessionFactory.SessionFactoryUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

    SessionFactory sessionFactory = SessionFactoryUtils.getSessionFactory();

    public PersonDao() {
    }

    public Person findById(Long id) {
        Person person;
        try (Session session = sessionFactory.getCurrentSession()) {
            session.getTransaction().begin();
            person = session.find(Person.class, id);
            session.getTransaction().commit();
        }
        SessionFactoryUtils.closeSessionFactory(sessionFactory);
        return person;
    }
}

package hw6.dao;

import hw6.model.Product;
import hw6.sessionFactory.SessionFactoryUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {

    SessionFactory sessionFactory = SessionFactoryUtils.getSessionFactory();

    public ProductDao() {
    }

    public Product findById(Long id) {
        Product product;
        try (Session session = sessionFactory.getCurrentSession()) {
            session.getTransaction().begin();
            product = session.find(Product.class, id);
            session.getTransaction().commit();
        }
        SessionFactoryUtils.closeSessionFactory(sessionFactory);
        return product;
    }
}

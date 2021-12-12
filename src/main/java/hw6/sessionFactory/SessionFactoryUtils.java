package hw6.sessionFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtils {

    public static SessionFactory getSessionFactory() {
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public static void closeSessionFactory(SessionFactory sessionFactory) {
        sessionFactory.close();
    }
}

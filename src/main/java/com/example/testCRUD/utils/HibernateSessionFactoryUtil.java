package com.example.testCRUD.utils;
import com.example.testCRUD.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static  SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory(
                    new StandardServiceRegistryBuilder().build() );
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            System.err.println(ex.getCause());
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

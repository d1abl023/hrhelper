package com.d1abl023.hrhelper.utilactions;

import com.d1abl023.hrhelper.tables.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateUtils {

    private static Properties properties;
    private static SessionFactory sessionFactory;

    private static Properties getProperties(){
        if(properties == null){
            properties = new Properties();
            properties.put(Environment.DRIVER, "org.postgresql.Driver");
            properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/hrhelper");
            properties.put(Environment.USER, "postgres");
            properties.put(Environment.PASS, "postgres");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL95Dialect");
            properties.put(Environment.SHOW_SQL, "true");
        }
        return properties;
    }

    @SuppressWarnings("WeakerAccess")
    public static Configuration getConfiguration(){
        return new Configuration()
                .setProperties(getProperties())
                .addAnnotatedClass(UserAuthDataTable.class)
                .addAnnotatedClass(UserGeneralDataTable.class)
                .addAnnotatedClass(UserNameDataTable.class)
                .addAnnotatedClass(UserAdditionalDataTable.class)
                .addAnnotatedClass(UserMentionsIdTable.class)
                .addAnnotatedClass(MessagesTable.class)
                .addAnnotatedClass(DialogsTable.class)
                .addAnnotatedClass(MentionsTable.class)
                .addAnnotatedClass(UserMentionsIdTable.class);
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null){
            sessionFactory = getConfiguration().buildSessionFactory(
                    new StandardServiceRegistryBuilder().applySettings(
                            getConfiguration().getProperties())
                            .build()
            );
        }

        return sessionFactory;
    }
}

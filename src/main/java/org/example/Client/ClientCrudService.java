package org.example.Client;

import org.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientCrudService {
    public void create(Client client){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
                session.persist(client);

            transaction.commit();
        session.close();
    }

    public Client get(long id){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
                Client client = session.get(Client.class, id);

            transaction.commit();
        session.close();

        return client;
    }

    public void update(Client client){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
            session.merge(client);

        transaction.commit();
        session.close();


    }

    public void delete(long id){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
                session.remove(get(id));

            transaction.commit();
        session.close();
    }

}

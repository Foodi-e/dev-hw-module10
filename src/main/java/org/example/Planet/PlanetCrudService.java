package org.example.Planet;

import org.example.Client.Client;
import org.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class PlanetCrudService {
    public void create(Planet planet){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(planet);

        transaction.commit();
        session.close();
    }

    public Planet get(String id){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Planet planet = session.get(Planet.class, id);

        transaction.commit();
        session.close();

        return planet;
    }

    public void update(Planet planet){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
            session.merge(planet);

        transaction.commit();
        session.close();


    }

    public void delete(String id){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(get(id));

        transaction.commit();
        session.close();
    }
}

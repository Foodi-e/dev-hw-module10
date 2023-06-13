package org.example.Ticket;

import org.example.Client.Client;
import org.example.Planet.Planet;
import org.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TicketCrudService {
    private boolean isValid(TicketEntity ticketEntity){
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            if (session.get(Planet.class, ticketEntity.getFromPlanet().getId()) == null ||
                    session.get(Planet.class, ticketEntity.getToPlanet().getId()) == null ||
                    session.get(Client.class, ticketEntity.getClient().getId()) == null) {
                return false;
            }
        }

        return true;
    }
    public void create(TicketEntity ticketEntity) {
        if(isValid(ticketEntity)){
            Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();
                    session.persist(ticketEntity);
                transaction.commit();
            session.close();
        } else{
            System.out.println("""
                    /////////////////////////////

                    You cannot create tickets with empty fields or nonexistent planets/client

                    ////////////////////////////""");
        }
    }

    public TicketEntity get(long id){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
                TicketEntity ticket = session.get(TicketEntity.class, id);
            transaction.commit();
        session.close();

        return ticket;
    }

    public void update(TicketEntity ticket){
        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
                session.merge(ticket);
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

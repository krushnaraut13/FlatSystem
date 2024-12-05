package com.rk.FlatDao;

import com.rk.FlatEntity.Flat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class FlatDao{

    @Autowired
    private SessionFactory sessionFactory;

    public Flat addFlat(Flat flat)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(flat);
        transaction.commit();
        session.close();
        return flat;
    }

    public Flat updateFlat(Flat flat)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(flat);
        transaction.commit();
        session.close();
        return flat;
    }

    public Flat getFlatById(int id)
    {
        Session session = sessionFactory.openSession();
        Flat flat = session.get(Flat.class, id);
        session.close();
        return flat;
    }

    public List<Flat> getAllFlats()
    {
        Session session = sessionFactory.openSession();
        List<Flat> flats = session.createQuery("from Flat", Flat.class).list();
        session.close();
        return flats;
    }

    public void deleteFlat(int id)
    {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Flat flat = session.get(Flat.class, id);
        if (flat != null)
        {
            session.delete(flat);
        }
        transaction.commit();
        session.close();
    }

    public List<Flat> getFlatsByAvailability(boolean status)
    {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Flat where isAvailable = :status");
        query.setParameter("status", status);
        List<Flat> flats = query.getResultList();
        session.close();
        return flats;
    }

    public List<Flat> getFlatsByFurnishedStatus(String status)
    {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Flat where furnishedStatus = :status");
        query.setParameter("status", status);
        List<Flat> flats = query.getResultList();
        session.close();
        return flats;
    }

    public List<Flat> getFlatsByPriceRange(double minPrice, double maxPrice)
    {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Flat where price between :minPrice and :maxPrice");
        query.setParameter("minPrice", minPrice);
        query.setParameter("maxPrice", maxPrice);
        List<Flat> flats = query.getResultList();
        session.close();
        return flats;
    }
}

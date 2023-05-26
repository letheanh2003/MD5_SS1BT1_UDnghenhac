package ra.model.service;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ra.model.entity.songList;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import java.util.List;

public class SongServiceIMPL implements ISongService{
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
        static {
            try {
                sessionFactory = new Configuration()
                        .configure("hibernate.conf.xml")
                        .buildSessionFactory();
                entityManager = sessionFactory.createEntityManager();
            } catch (HibernateException e) {
                e.printStackTrace();
            }
        }
    @Override
    public List<songList> findAll() {
      String queryStr = "select s from songList as s";
        TypedQuery<songList> query = entityManager.createQuery(queryStr,songList.class);
        return query.getResultList();
    }

    @Override
    public songList findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(songList song) {

    }
}

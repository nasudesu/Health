package org.example;
import jakarta.persistence.*;

public class DAO {

    public static final EntityManagerFactory em = Persistence.createEntityManagerFactory("health");

    public <T> void persist(T entity) {
        EntityManager entityManager = em.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public <T> void update(T entity) {
        EntityManager entityManager = em.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}

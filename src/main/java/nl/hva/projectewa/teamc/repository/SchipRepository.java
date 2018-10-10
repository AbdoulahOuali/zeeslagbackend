package nl.hva.projectewa.teamc.repository;

import nl.hva.projectewa.teamc.model.Schip;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class SchipRepository {

    @PersistenceContext(unitName = "zeeslagPersistenceUnit")
    private EntityManager em;

    public Schip find(Long id) {
        return em.find(Schip.class, id);
    }

    public Schip create(Schip schip) {
        em.persist(schip);
        return schip;
    }

    public void delete(Long id) {
        em.remove(em.getReference(Schip.class, id));
    }

    public List<Schip> findAll() {
        TypedQuery<Schip> query = em.createQuery("SELECT s from Schip s order by s.typeSchip", Schip.class);
        return query.getResultList();
    }

    public Long countAll() {
        TypedQuery<Long> query = em.createQuery("SELECT count(s) from Schip s", Long.class);
        return query.getSingleResult();
    }
}

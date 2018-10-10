package nl.hva.projectewa.teamc.repository;

import nl.hva.projectewa.teamc.model.Schip;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}

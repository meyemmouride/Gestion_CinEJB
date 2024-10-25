package org.example.ejbserver.beans;


import org.example.ejbserver.entities.CD;
import org.example.ejbserver.interfaces.CDManagerRemote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CDManager implements CDManagerRemote {

    @PersistenceContext(unitName = "cinemaPU")
    private EntityManager em;

    @Override
    public void addCD(CD cd) {
        em.persist(cd);
    }

    @Override
    public List<CD> getAllCDs() {
        return em.createQuery("SELECT c FROM CD c", CD.class).getResultList();
    }
}


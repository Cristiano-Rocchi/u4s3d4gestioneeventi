package DAO;

import entities.Concerto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class EventoDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public EventoDAO() {
        emf = Persistence.createEntityManagerFactory("gestioneeventi2");
        em = emf.createEntityManager();
    }

    // Metodo concerti streaming oppure no
    public List<Concerto> getConcertiInStreaming(boolean inStreaming) {
        TypedQuery<Concerto> query = em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming = :inStreaming", Concerto.class);
        query.setParameter("inStreaming", inStreaming);
        return query.getResultList();
    }

    // Metodo concerti per il genere
    public List<Concerto> getConcertiPerGenere(String genere) {
        TypedQuery<Concerto> query = em.createQuery("SELECT c FROM Concerto c WHERE c.genere = :genere", Concerto.class);
        query.setParameter("genere", genere);
        return query.getResultList();
    }


    public void close() {
        em.close();
        emf.close();
    }
}

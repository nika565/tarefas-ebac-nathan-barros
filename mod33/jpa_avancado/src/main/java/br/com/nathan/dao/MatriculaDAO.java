package br.com.nathan.dao;

import br.com.nathan.domain.Matricula;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MatriculaDAO implements IMatriculaDAO{

    @Override
    public Matricula cadastrar(Matricula matricula) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_avancado");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(matricula);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

}
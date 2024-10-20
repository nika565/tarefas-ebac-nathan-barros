package br.com.nathan.dao;

import br.com.nathan.domain.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CursoDAO implements ICursoDAO{

    @Override
    public Curso cadastrar(Curso curso) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo_jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(curso);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        return curso;
    }

}

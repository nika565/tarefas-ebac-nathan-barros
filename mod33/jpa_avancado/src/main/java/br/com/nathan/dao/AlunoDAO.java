package br.com.nathan.dao;

import br.com.nathan.domain.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlunoDAO implements IAlunoDAO{
    @Override
    public Aluno cadastrar(Aluno aluno) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_avancado");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(aluno);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        return aluno;
    }
}

package br.com.svitorroberto.dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import br.com.svitorroberto.modelo.Curso;

public class CursoDao {
	//Com entityManager	
	protected EntityManager entityManager;
	 
    public CursoDao() {
        entityManager = getEntityManager();
    }
	
	private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AngularRESTfulCRUD");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
 
        return entityManager;
    }
	
	public Curso getCursoById(Long id){
		Curso curso = new Curso();
		try{
		 curso = (Curso) entityManager.createQuery("SELECT c from Curso c where c.id = :id").setParameter("id", id).getSingleResult();
		}catch (NoResultException e) {
			return new Curso();
		}
		return curso;
	}
	
	public void salvarCurso(Curso curso){
		try {
			String f2 = String.valueOf(entityManager.createQuery("select max(id) from Curso").getSingleResult());
			Long codigo = Long.valueOf(f2)+1L;
			curso.setId(codigo);
			entityManager.getTransaction().begin();
			entityManager.persist(curso);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
		
	}

	public Collection<Curso> getAll() {
		Collection<Curso> cursos = new ArrayList<Curso>();
		try{
			cursos = (Collection<Curso>) entityManager.createQuery("SELECT c from Curso c").getResultList();
			}catch (NoResultException e) {
				return new ArrayList<Curso>();
			}
		return cursos;
	}

}

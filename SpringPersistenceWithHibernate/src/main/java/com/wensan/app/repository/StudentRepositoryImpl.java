package com.wensan.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.wensan.app.models.Student;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent() {
		List<Student> students = em.createQuery("SELECT s FROM Student s").getResultList();
		return students;
	}

	public Student getOneById(Long id) {
		Student student = em.find(Student.class, id);
		return student;
	}

	public void save(Student student) {
		em.persist(student);
		em.flush();
	}

	public void delete(Student student) {
		em.remove(student);
	}
}

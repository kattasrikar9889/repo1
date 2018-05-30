import java.util.List;

import org.hibernate.Session;



public class Hibernatestandalone {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Student student= new Student("Srikar","katta","JEE");
		Address address= new Address("1260 HighField ct","PA","usa");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(student);
		address.setId(student.getId());
		student.setAddress(address);
		session.save(student);
		session.getTransaction().commit();
		List<Student> students =(List<Student>) session.createQuery("from -----student").list();
			students.forEach(System.out::println);
			session.close();
	}
}

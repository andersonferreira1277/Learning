package estudoHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateTest {

	public static void main(String[] args) {

		Artista artista = new Artista();
		//artista.setId(1);
		artista.setNome("Metallica");
		artista.setBanda(true);
		artista.setPais("BR");

		//Gravar no banco
/*		Session session = HibernateUtil.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(artista);

		transaction.commit();

		session.close();*/

		//select no banco
		Session session2 = HibernateUtil.openSession();

		Transaction transaction2 = session2.beginTransaction();

		Artista artista2 = (Artista) session2.load(Artista.class, 2);
		
		System.out.println(artista2.getNome());
		transaction2.commit();
		session2.close();
		
		System.out.println("=============================");
		
		Employee employee = new Employee("Anderson", "Ferreira", 4500.0f);
		
		Session session3 = HibernateUtil.openSession();
		
		Transaction transaction3 = session3.beginTransaction();
		
		session3.save(employee);
		transaction3.commit();
		
		session3.close();
		

	}

}

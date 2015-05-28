package be.freman.my500px.repository;

import javax.persistence.EntityManager;

import be.freman.my500px.model.MyPhotoHist;

public class MyPhotoHistRepositoryImpl implements MyPhotoHistRepository {


	@Override
	public void create(MyPhotoHist myPhotoHist) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    
		em.getTransaction().begin();
	    em.persist(myPhotoHist);
	    em.flush();
	    em.getTransaction().commit();
	    em.close();
	}

}

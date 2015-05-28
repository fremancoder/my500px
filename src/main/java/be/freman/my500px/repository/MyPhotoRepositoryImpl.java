package be.freman.my500px.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import be.freman.my500px.model.MyPhoto;

public class MyPhotoRepositoryImpl implements MyPhotoRepository{

	@Override
	public MyPhoto find(Integer photoId) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		
	    MyPhoto myPhoto = em.find(MyPhoto.class, photoId);
	    em.close();

	    return myPhoto;
	}
	
	@Override
	public MyPhoto findByPxId(Integer pxid) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();

		MyPhoto myPhoto = null;
		Query q = em.createQuery("select p from MyPhoto p where p.pxid= :pxid");
		q.setParameter("pxid", pxid);
		try{
			myPhoto = (MyPhoto) q.getSingleResult();
		} catch(NoResultException e){
			//if no record is found return null;
		}
		em.close();
		
	    return myPhoto;
	}

	@Override
	public void create(MyPhoto myPhoto) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    em.getTransaction().begin();
	    em.persist(myPhoto);
	    em.flush();
	    em.getTransaction().commit();
	    em.close();
	}

	@Override
	public MyPhoto update(MyPhoto myPhoto) {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();

		em.getTransaction().begin();
		myPhoto = em.merge(myPhoto);
	    em.flush();
	    em.getTransaction().commit();
	    em.close();
	    
	    return myPhoto;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MyPhoto> getAll() {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		
		Query q = em.createQuery("select p from MyPhoto p");
		List<MyPhoto> myPhotos = (List<MyPhoto>) q.getResultList();	    
	    em.close();

	    return myPhotos;	
	}

}

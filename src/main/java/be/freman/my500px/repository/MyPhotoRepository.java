package be.freman.my500px.repository;

import java.util.List;

import be.freman.my500px.model.MyPhoto;

public interface MyPhotoRepository {

	MyPhoto findByPxId(Integer id);

	MyPhoto find(Integer id);
	
	void create(MyPhoto myPhoto);
	
	MyPhoto update(MyPhoto myPhoto);
	
	List<MyPhoto> getAll();
	
}

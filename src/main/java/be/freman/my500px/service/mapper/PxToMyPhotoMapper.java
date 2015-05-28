package be.freman.my500px.service.mapper;

import be.freman.my500px.model.MyPhoto;
import be.freman.my500px.model.PxPhotos;

public class PxToMyPhotoMapper {

	public MyPhoto map(PxPhotos pxPhoto){
		MyPhoto myPhoto = new MyPhoto();
		map(myPhoto, pxPhoto);
		return myPhoto;
	}

	public void map(MyPhoto myPhoto, PxPhotos pxPhoto) {
		myPhoto.setComments_count(pxPhoto.getComments_count());
		myPhoto.setFavorites_count(pxPhoto.getFavorites_count());
		myPhoto.setHighest_rating(pxPhoto.getHighest_rating());
		myPhoto.setHighest_rating_date(pxPhoto.getHighest_rating_date());
		myPhoto.setPxid(pxPhoto.getId());
		myPhoto.setImage_url(pxPhoto.getImage_url());
		myPhoto.setName(pxPhoto.getName());
		myPhoto.setRating(pxPhoto.getRating());
		myPhoto.setTaken_at(pxPhoto.getTaken_at()); 
		myPhoto.setTimes_viewed(pxPhoto.getTimes_viewed()); 
		myPhoto.setUrl(pxPhoto.getUrl()); 
		myPhoto.setUser_id(pxPhoto.getUser_id()); 
		myPhoto.setVotes_count(pxPhoto.getVotes_count()); 
	}

}

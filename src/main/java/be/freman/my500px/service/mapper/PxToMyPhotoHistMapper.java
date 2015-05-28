package be.freman.my500px.service.mapper;

import be.freman.my500px.model.MyPhotoHist;
import be.freman.my500px.model.PxPhotos;

public class PxToMyPhotoHistMapper {

	public MyPhotoHist map(PxPhotos pxPhoto){
		MyPhotoHist myPhotoHist = new MyPhotoHist();
		
		myPhotoHist.setComments_count(pxPhoto.getComments_count());
		myPhotoHist.setFavorites_count(pxPhoto.getFavorites_count());
		myPhotoHist.setHighest_rating(pxPhoto.getHighest_rating());
		myPhotoHist.setPxid(pxPhoto.getId());
		myPhotoHist.setRating(pxPhoto.getRating());
		myPhotoHist.setTimes_viewed(pxPhoto.getTimes_viewed()); 
		myPhotoHist.setVotes_count(pxPhoto.getVotes_count()); 
		
		return myPhotoHist;
	}
	
}

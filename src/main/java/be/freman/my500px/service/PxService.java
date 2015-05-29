package be.freman.my500px.service;

import be.freman.my500px.model.PxPhotoDetails;
import be.freman.my500px.model.PxSearchResultInfo;

public interface PxService {

	PxSearchResultInfo getPhotos(int page);
	
	PxPhotoDetails getPhotoDetails(int pxPhotoId);
	
}

package be.freman.my500px.service;

import be.freman.my500px.model.MyPhoto;
import be.freman.my500px.model.MyPhotoHist;
import be.freman.my500px.model.PxPhotos;
import be.freman.my500px.model.PxSearchResultInfo;
import be.freman.my500px.repository.MyPhotoHistRepository;
import be.freman.my500px.repository.MyPhotoHistRepositoryImpl;
import be.freman.my500px.repository.MyPhotoRepository;
import be.freman.my500px.repository.MyPhotoRepositoryImpl;
import be.freman.my500px.service.mapper.PxToMyPhotoHistMapper;
import be.freman.my500px.service.mapper.PxToMyPhotoMapper;

public class MyPxServiceImpl implements MyPxService{
	
	private PxService pxService = new PxServiceImpl();
	
	private MyPhotoRepository myPhotoRepository = new MyPhotoRepositoryImpl();
	
	private MyPhotoHistRepository myPhotoHistRepository = new MyPhotoHistRepositoryImpl();

	private PxToMyPhotoMapper photoMapper = new PxToMyPhotoMapper();
	
	private PxToMyPhotoHistMapper photoHistMapper = new PxToMyPhotoHistMapper();
	
	private static final int INITIAL_PAGE = 1;
	
	@Override
	public void sync() {
		syncPage(INITIAL_PAGE);
	}

	private void syncPage(int page) {
		PxSearchResultInfo pxSearchResultInfo = pxService.getPhotos(page);
		
		for (PxPhotos pxPhoto : pxSearchResultInfo.getPhotos()) {
			MyPhoto myPhoto = myPhotoRepository.find(pxPhoto.getId());
			if(myPhoto != null){
				photoMapper.map(myPhoto, pxPhoto);
				myPhotoRepository.update(myPhoto);
			} else {
				myPhoto = photoMapper.map(pxPhoto);
				myPhotoRepository.create(myPhoto);
			}
			MyPhotoHist myPhotoHist = photoHistMapper.map(pxPhoto);
			myPhotoHistRepository.create(myPhotoHist);
		}
		
		if(page < pxSearchResultInfo.getTotal_pages()){
			syncPage(page+1);
		}
	}

}

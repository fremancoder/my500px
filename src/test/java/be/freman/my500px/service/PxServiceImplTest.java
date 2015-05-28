package be.freman.my500px.service;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import be.freman.my500px.model.PxSearchResultInfo;

public class PxServiceImplTest {

	@Test
	public void testSearch() {
		PxService pxService = new PxServiceImpl();

		PxSearchResultInfo userPhotos = pxService.getPhotos(1);

		assertEquals(new Integer(9), userPhotos.getTotal_pages());
	}
		
}

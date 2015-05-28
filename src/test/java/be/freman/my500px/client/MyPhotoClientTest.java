package be.freman.my500px.client;

import org.junit.Test;

public class MyPhotoClientTest {

	@Test
	public void testSync() {
		MyPhotoClient client = new MyPhotoClient();
		client.sync();
	}	
}

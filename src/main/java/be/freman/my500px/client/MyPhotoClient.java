package be.freman.my500px.client;

import java.net.URI;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import be.freman.my500px.model.MyPhoto;

public class MyPhotoClient {

	private Client client;
	
	public MyPhotoClient(){
		client = ClientBuilder.newClient();
	}	
	
	public List<MyPhoto> getAll(){
		URI uri = UriBuilder.fromUri("http://localhost:8080/my500px/webapi")
				.path("photos")
				.build();
		
		WebTarget target = client.target(uri);
		
		List<MyPhoto> response = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<MyPhoto>>() {}); 

		return response;
	}
	
	public Response sync(){
		System.out.println("xxxxxxxxxxxxx in sync");
		
		URI uri = UriBuilder.fromUri("http://localhost:8080/my500px/webapi")
				.path("photos/sync")
				.build();
		
		WebTarget target = client.target(uri);
		
		Response response = target.request(MediaType.APPLICATION_JSON).get(); 

		return response;
	}
}

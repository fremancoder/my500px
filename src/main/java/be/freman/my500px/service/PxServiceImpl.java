package be.freman.my500px.service;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import be.freman.my500px.model.PxSearchResultInfo;

public class PxServiceImpl implements PxService{

	private Client client;
	
	private final static String FROM_URI =  "https://api.500px.com/v1/";

	private final static String SEARCH_PATH =  "photos";
	
	private final static String CONSUMER_KEY =  "The Consumer key";

	public PxServiceImpl(){
		client = ClientBuilder.newClient();
	}

	@Override
	public PxSearchResultInfo getPhotos(int page) {
		URI uri = UriBuilder.fromUri(FROM_URI)
				.path(SEARCH_PATH)
				.queryParam("consumer_key", CONSUMER_KEY)
				.queryParam("feature", "user")
				.queryParam("username", "FreddyMangelschots")
				.queryParam("page", page)
				.build();
		
		WebTarget target = client.target(uri);

		PxSearchResultInfo response = target.request(MediaType.APPLICATION_JSON).get(PxSearchResultInfo.class); 
		
		return response;
	}

}

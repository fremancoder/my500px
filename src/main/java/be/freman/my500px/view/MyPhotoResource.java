package be.freman.my500px.view;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import be.freman.my500px.model.MyPhoto;
import be.freman.my500px.repository.MyPhotoRepository;
import be.freman.my500px.repository.MyPhotoRepositoryImpl;
import be.freman.my500px.service.MyPxService;
import be.freman.my500px.service.MyPxServiceImpl;

@Path("photo")
public class MyPhotoResource {
	
	MyPhotoRepository photoRepository = new MyPhotoRepositoryImpl(); 
	
	MyPxService myPxService = new MyPxServiceImpl();

	@GET
	@Path("{photoId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response update(@PathParam ("photoId") Integer photoId){
		MyPhoto photo = photoRepository.find(photoId);
		
		if(photo == null){
			return Response.status(Status.NOT_FOUND).build();
		}
		
		return Response.ok().entity(photo).build();		
	}
	
}

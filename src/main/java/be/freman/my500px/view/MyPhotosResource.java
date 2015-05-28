package be.freman.my500px.view;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import be.freman.my500px.model.MyPhoto;
import be.freman.my500px.repository.MyPhotoRepository;
import be.freman.my500px.repository.MyPhotoRepositoryImpl;
import be.freman.my500px.service.MyPxService;
import be.freman.my500px.service.MyPxServiceImpl;

@Path("photos")
public class MyPhotosResource {
	
	MyPhotoRepository photoRepository = new MyPhotoRepositoryImpl(); 
	
	MyPxService myPxService = new MyPxServiceImpl();

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response getAll(){
		List<MyPhoto> photos = photoRepository.getAll();
		
		if(photos == null || photos.size() <= 0){
			return Response.status(Status.NOT_FOUND).build();
		}
		
		return Response.ok().entity(new GenericEntity<List<MyPhoto>>(photos){}).build();		
	}
	
	@GET
	@Path("/sync")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response sync(){
		System.out.println("xxxxxxxxxxxxx in sync resource");		
		myPxService.sync();
		return Response.ok().build();
	}	
	
}

package be.freman.my500px.view;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import be.freman.my500px.model.PxPhotoDetails;
import be.freman.my500px.service.PxService;
import be.freman.my500px.service.PxServiceImpl;

@Path("photo")
public class MyPhotoResource {
	
	PxService pxService = new PxServiceImpl(); 
	
	@GET
	@Path("{pxPhotoId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response update(@PathParam ("pxPhotoId") Integer pxPhotoId){
		PxPhotoDetails pxPhotoDetails = pxService.getPhotoDetails(pxPhotoId);
		
		if(pxPhotoDetails == null){
			return Response.status(Status.NOT_FOUND).build();
		}
		
		return Response.ok().entity(pxPhotoDetails).build();		
	}
	
}

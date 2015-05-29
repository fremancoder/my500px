package be.freman.my500px.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PxPhotoDetails {
	private PxPhoto photo;

	private List<PxComment> comments;

	public List<PxComment> getComments() {
		return comments;
	}

	public PxPhoto getPhoto() {
		return photo;
	}

	public void setComments(List<PxComment> comments) {
		this.comments = comments;
	}

	public void setPhoto(PxPhoto photo) {
		this.photo = photo;
	}

}
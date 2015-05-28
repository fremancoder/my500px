package be.freman.my500px.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="MY_PHOTO_HIST" )
public class MyPhotoHist {
	
	@Id
	@GeneratedValue
	private Integer id;
	
    private Integer pxid;

    private Integer votes_count;

    private Integer comments_count;

    private Integer favorites_count;

    private Integer times_viewed;

    private Float highest_rating;

    private Float rating;

	public Integer getComments_count() {
		return comments_count;
	}

	public Integer getFavorites_count() {
		return favorites_count;
	}

	public Float getHighest_rating() {
		return highest_rating;
	}

	public Integer getId() {
		return id;
	}

	public Integer getPxid() {
		return pxid;
	}

	public Float getRating() {
		return rating;
	}

	public Integer getTimes_viewed() {
		return times_viewed;
	}

	public Integer getVotes_count() {
		return votes_count;
	}

	public void setComments_count(Integer comments_count) {
		this.comments_count = comments_count;
	}

	public void setFavorites_count(Integer favorites_count) {
		this.favorites_count = favorites_count;
	}

	public void setHighest_rating(Float highest_rating) {
		this.highest_rating = highest_rating;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPxid(Integer pxid) {
		this.pxid = pxid;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public void setTimes_viewed(Integer times_viewed) {
		this.times_viewed = times_viewed;
	}

	public void setVotes_count(Integer votes_count) {
		this.votes_count = votes_count;
	}

}

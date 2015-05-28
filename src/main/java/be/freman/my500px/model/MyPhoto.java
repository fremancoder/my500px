package be.freman.my500px.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="MY_PHOTO" )
public class MyPhoto {
	
	@Id
	@GeneratedValue
	private Integer id;
	
    private Integer pxid;

    private String taken_at;

    private String highest_rating_date;

    private String image_url;

    private String url;

    private String name;

    private Integer user_id;

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

	public String getHighest_rating_date() {
		return highest_rating_date;
	}

	public Integer getId() {
		return id;
	}

	public String getImage_url() {
		return image_url;
	}

	public String getName() {
		return name;
	}

	public Integer getPxid() {
		return pxid;
	}

	public Float getRating() {
		return rating;
	}

	public String getTaken_at() {
		return taken_at;
	}

	public Integer getTimes_viewed() {
		return times_viewed;
	}

	public String getUrl() {
		return url;
	}

	public Integer getUser_id() {
		return user_id;
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

	public void setHighest_rating_date(String highest_rating_date) {
		this.highest_rating_date = highest_rating_date;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPxid(Integer pxid) {
		this.pxid = pxid;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public void setTaken_at(String taken_at) {
		this.taken_at = taken_at;
	}

	public void setTimes_viewed(Integer times_viewed) {
		this.times_viewed = times_viewed;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public void setVotes_count(Integer votes_count) {
		this.votes_count = votes_count;
	}

}

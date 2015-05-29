package be.freman.my500px.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PxPhoto
{
	private String store_download;

	private String editors_choice_date;
	    
    private String store_print;	

    private String request_to_buy_enabled;

    private String store_license;

    private String watermark;

    private String license_requests_enabled;

    private String editors_choice;

    private PxShareCount share_counts;

    private String editored_by;

    private List<PxComment> comments;
    
    private String for_sale_date;

    private String sales_count;

    private String focal_length;

    private String taken_at;

    private String location;

    private Integer id;

    private Integer favorites_count;

    private Integer height;

    private String image_url;

    private String description;

    private String name;

    private String created_at;

    private String hi_res_uploaded;

    private Integer user_id;

    private Float longitude;

    private Integer votes_count;

    private String converted_bits;

    private Integer comments_count;

    private String license_type;

    private Integer times_viewed;

    private String shutter_speed;

    private String iso;

    private String status;

    private String converted;

    private String camera;

    private Integer width;

    private String privacy;

    private Float highest_rating;

    private String image_format;

    private String highest_rating_date;

    private String crop_version;

    private String lens;

    private String url;

    private String aperture;

    private String category;

    private String collections_count;

    private String nsfw;

    private PxImages[] images;

    private Float rating;

    private Float latitude;

    private PxUser user;

    private String for_sale;

    private String positive_votes_count;

    public String getAperture ()
    {
        return aperture;
    }

    public String getCamera ()
    {
        return camera;
    }

    public String getCategory ()
    {
        return category;
    }

    public String getCollections_count ()
    {
        return collections_count;
    }

    public List<PxComment> getComments() {
		return comments;
	}

    public Integer getComments_count ()
    {
        return comments_count;
    }

    public String getConverted ()
    {
        return converted;
    }

    public String getConverted_bits ()
    {
        return converted_bits;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public String getCrop_version ()
    {
        return crop_version;
    }

    public String getDescription ()
    {
        return description;
    }

    public String getEditored_by() {
		return editored_by;
	}

    public String getEditors_choice() {
		return editors_choice;
	}

    public String getEditors_choice_date() {
		return editors_choice_date;
	}

    public Integer getFavorites_count ()
    {
        return favorites_count;
    }

    public String getFocal_length ()
    {
        return focal_length;
    }

    public String getFor_sale ()
    {
        return for_sale;
    }

    public String getFor_sale_date ()
    {
        return for_sale_date;
    }

    public Integer getHeight ()
    {
        return height;
    }

    public String getHi_res_uploaded ()
    {
        return hi_res_uploaded;
    }

    public Float getHighest_rating ()
    {
        return highest_rating;
    }

    public String getHighest_rating_date ()
    {
        return highest_rating_date;
    }

    public Integer getId ()
    {
        return id;
    }

    public String getImage_format ()
    {
        return image_format;
    }

    public String getImage_url ()
    {
        return image_url;
    }

    public PxImages[] getImages ()
    {
        return images;
    }

    public String getIso ()
    {
        return iso;
    }

    public Float getLatitude ()
    {
        return latitude;
    }

    public String getLens ()
    {
        return lens;
    }

    public String getLicense_requests_enabled() {
		return license_requests_enabled;
	}

    public String getLicense_type ()
    {
        return license_type;
    }

    public String getLocation ()
    {
        return location;
    }

    public Float getLongitude ()
    {
        return longitude;
    }

    public String getName ()
    {
        return name;
    }

    public String getNsfw ()
    {
        return nsfw;
    }

    public String getPositive_votes_count ()
    {
        return positive_votes_count;
    }

    public String getPrivacy ()
    {
        return privacy;
    }

    public Float getRating ()
    {
        return rating;
    }

    public String getRequest_to_buy_enabled() {
		return request_to_buy_enabled;
	}

    public String getSales_count ()
    {
        return sales_count;
    }

    public PxShareCount getShare_counts() {
		return share_counts;
	}

    public String getShutter_speed ()
    {
        return shutter_speed;
    }

    public String getStatus ()
    {
        return status;
    }

    public String getStore_download() {
		return store_download;
	}

    public String getStore_license() {
		return store_license;
	}

    public String getStore_print() {
		return store_print;
	}

    public String getTaken_at ()
    {
        return taken_at;
    }

    public Integer getTimes_viewed ()
    {
        return times_viewed;
    }

    public String getUrl ()
    {
        return url;
    }

    public PxUser getUser ()
    {
        return user;
    }

    public Integer getUser_id ()
    {
        return user_id;
    }

    public Integer getVotes_count ()
    {
        return votes_count;
    }

    public String getWatermark() {
		return watermark;
	}

    public Integer getWidth ()
    {
        return width;
    }

    public void setAperture (String aperture)
    {
        this.aperture = aperture;
    }

    public void setCamera (String camera)
    {
        this.camera = camera;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public void setCollections_count (String collections_count)
    {
        this.collections_count = collections_count;
    }

    public void setComments(List<PxComment> comments) {
		this.comments = comments;
	}

    public void setComments_count (Integer comments_count)
    {
        this.comments_count = comments_count;
    }

    public void setConverted (String converted)
    {
        this.converted = converted;
    }

    public void setConverted_bits (String converted_bits)
    {
        this.converted_bits = converted_bits;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public void setCrop_version (String crop_version)
    {
        this.crop_version = crop_version;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public void setEditored_by(String editored_by) {
		this.editored_by = editored_by;
	}

    public void setEditors_choice(String editors_choice) {
		this.editors_choice = editors_choice;
	}

    public void setEditors_choice_date(String editors_choice_date) {
		this.editors_choice_date = editors_choice_date;
	}

    public void setFavorites_count (Integer favorites_count)
    {
        this.favorites_count = favorites_count;
    }

    public void setFocal_length (String focal_length)
    {
        this.focal_length = focal_length;
    }

    public void setFor_sale (String for_sale)
    {
        this.for_sale = for_sale;
    }

    public void setFor_sale_date (String for_sale_date)
    {
        this.for_sale_date = for_sale_date;
    }

    public void setHeight (Integer height)
    {
        this.height = height;
    }

    public void setHi_res_uploaded (String hi_res_uploaded)
    {
        this.hi_res_uploaded = hi_res_uploaded;
    }

    public void setHighest_rating (Float highest_rating)
    {
        this.highest_rating = highest_rating;
    }

    public void setHighest_rating_date (String highest_rating_date)
    {
        this.highest_rating_date = highest_rating_date;
    }

    public void setId (Integer id)
    {
        this.id = id;
    }

    public void setImage_format (String image_format)
    {
        this.image_format = image_format;
    }

    public void setImage_url (String image_url)
    {
        this.image_url = image_url;
    }

    public void setImages (PxImages[] images)
    {
        this.images = images;
    }

    public void setIso (String iso)
    {
        this.iso = iso;
    }

    public void setLatitude (Float latitude)
    {
        this.latitude = latitude;
    }

    public void setLens (String lens)
    {
        this.lens = lens;
    }

    public void setLicense_requests_enabled(String license_requests_enabled) {
		this.license_requests_enabled = license_requests_enabled;
	}

    public void setLicense_type (String license_type)
    {
        this.license_type = license_type;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

	public void setLongitude (Float longitude)
    {
        this.longitude = longitude;
    }

	public void setName (String name)
    {
        this.name = name;
    }

	public void setNsfw (String nsfw)
    {
        this.nsfw = nsfw;
    }

	public void setPositive_votes_count (String positive_votes_count)
    {
        this.positive_votes_count = positive_votes_count;
    }

	public void setPrivacy (String privacy)
    {
        this.privacy = privacy;
    }

	public void setRating (Float rating)
    {
        this.rating = rating;
    }

	public void setRequest_to_buy_enabled(String request_to_buy_enabled) {
		this.request_to_buy_enabled = request_to_buy_enabled;
	}

	public void setSales_count (String sales_count)
    {
        this.sales_count = sales_count;
    }

	public void setShare_counts(PxShareCount share_counts) {
		this.share_counts = share_counts;
	}

	public void setShutter_speed (String shutter_speed)
    {
        this.shutter_speed = shutter_speed;
    }

	public void setStatus (String status)
    {
        this.status = status;
    }

	public void setStore_download(String store_download) {
		this.store_download = store_download;
	}

	public void setStore_license(String store_license) {
		this.store_license = store_license;
	}

	public void setStore_print(String store_print) {
		this.store_print = store_print;
	}

	public void setTaken_at (String taken_at)
    {
        this.taken_at = taken_at;
    }

	public void setTimes_viewed (Integer times_viewed)
    {
        this.times_viewed = times_viewed;
    }

	public void setUrl (String url)
    {
        this.url = url;
    }

	public void setUser (PxUser user)
    {
        this.user = user;
    }

	public void setUser_id (Integer user_id)
    {
        this.user_id = user_id;
    }

	public void setVotes_count (Integer votes_count)
    {
        this.votes_count = votes_count;
    }

	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}

	public void setWidth (Integer width)
    {
        this.width = width;
    }

    
}
package be.freman.my500px.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PxUser
{
    private String store_on;

    private String affection;

    private String cover_url;

    private String upgrade_status;

    private String userpic_https_url;

    private String lastname;

    private String usertype;

    private String firstname;

    private String city;

    private String country;

    private String id;

    private String username;

    private String userpic_url;
    
    private String followers_count;

    private String fullname;

    public String getAffection ()
    {
        return affection;
    }

    public String getCity ()
    {
        return city;
    }

    public String getCountry ()
    {
        return country;
    }

    public String getCover_url ()
    {
        return cover_url;
    }

    public String getFirstname ()
    {
        return firstname;
    }

    public String getFollowers_count() {
		return followers_count;
	}

    public String getFullname ()
    {
        return fullname;
    }

    public String getId ()
    {
        return id;
    }

    public String getLastname ()
    {
        return lastname;
    }

    public String getStore_on ()
    {
        return store_on;
    }

    public String getUpgrade_status ()
    {
        return upgrade_status;
    }

    public String getUsername ()
    {
        return username;
    }

    public String getUserpic_https_url ()
    {
        return userpic_https_url;
    }

    public String getUserpic_url ()
    {
        return userpic_url;
    }

    public String getUsertype ()
    {
        return usertype;
    }

    public void setAffection (String affection)
    {
        this.affection = affection;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public void setCover_url (String cover_url)
    {
        this.cover_url = cover_url;
    }

    public void setFirstname (String firstname)
    {
        this.firstname = firstname;
    }

    public void setFollowers_count(String followers_count) {
		this.followers_count = followers_count;
	}

    public void setFullname (String fullname)
    {
        this.fullname = fullname;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public void setLastname (String lastname)
    {
        this.lastname = lastname;
    }

    public void setStore_on (String store_on)
    {
        this.store_on = store_on;
    }

    public void setUpgrade_status (String upgrade_status)
    {
        this.upgrade_status = upgrade_status;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public void setUserpic_https_url (String userpic_https_url)
    {
        this.userpic_https_url = userpic_https_url;
    }

    
    public void setUserpic_url (String userpic_url)
    {
        this.userpic_url = userpic_url;
    }

	public void setUsertype (String usertype)
    {
        this.usertype = usertype;
    }

}


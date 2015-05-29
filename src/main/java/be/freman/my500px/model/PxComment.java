package be.freman.my500px.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PxComment
{
    private Integer id;

    private String body;

    private Integer to_whom_user_id;

    private String flagged;

    private String created_at;

    private Integer user_id;

    private Float rating;

    private PxUser user;

    private Integer parent_id;

    public String getBody ()
    {
        return body;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public String getFlagged ()
    {
        return flagged;
    }

    public Integer getId ()
    {
        return id;
    }

    public Integer getParent_id ()
    {
        return parent_id;
    }

    public Float getRating ()
    {
        return rating;
    }

    public Integer getTo_whom_user_id ()
    {
        return to_whom_user_id;
    }

    public PxUser getUser ()
    {
        return user;
    }

    public Integer getUser_id ()
    {
        return user_id;
    }

    public void setBody (String body)
    {
        this.body = body;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public void setFlagged (String flagged)
    {
        this.flagged = flagged;
    }

    public void setId (Integer id)
    {
        this.id = id;
    }

    public void setParent_id (Integer parent_id)
    {
        this.parent_id = parent_id;
    }

    public void setRating (Float rating)
    {
        this.rating = rating;
    }

    public void setTo_whom_user_id (Integer to_whom_user_id)
    {
        this.to_whom_user_id = to_whom_user_id;
    }

    public void setUser (PxUser user)
    {
        this.user = user;
    }

    public void setUser_id (Integer user_id)
    {
        this.user_id = user_id;
    }

}
package be.freman.my500px.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PxFilters
{
    private String category;

    private String user_id;

    private String exclude;

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    public String getExclude ()
    {
        return exclude;
    }

    public void setExclude (String exclude)
    {
        this.exclude = exclude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [category = "+category+", user_id = "+user_id+", exclude = "+exclude+"]";
    }
}
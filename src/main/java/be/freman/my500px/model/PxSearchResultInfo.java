package be.freman.my500px.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PxSearchResultInfo
{
    private List<PxPhoto> photos;

    private Integer total_items;

    private Integer total_pages;

    private String feature;

    private PxFilters filters;

    private Integer current_page;

    public Integer getCurrent_page ()
    {
        return current_page;
    }

    public String getFeature ()
    {
        return feature;
    }

    public PxFilters getFilters ()
    {
        return filters;
    }

    public List<PxPhoto> getPhotos ()
    {
        return photos;
    }

    public Integer getTotal_items ()
    {
        return total_items;
    }

    public Integer getTotal_pages ()
    {
        return total_pages;
    }

    public void setCurrent_page (Integer current_page)
    {
        this.current_page = current_page;
    }

    public void setFeature (String feature)
    {
        this.feature = feature;
    }

    public void setFilters (PxFilters filters)
    {
        this.filters = filters;
    }

    public void setPhotos (List<PxPhoto> photos)
    {
        this.photos = photos;
    }

    public void setTotal_items (Integer total_items)
    {
        this.total_items = total_items;
    }

    public void setTotal_pages (Integer total_pages)
    {
        this.total_pages = total_pages;
    }
   
}

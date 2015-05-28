package be.freman.my500px.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PxImages
{
    private String https_url;

    private String format;

    private String url;

    private String size;

    public String getHttps_url ()
    {
        return https_url;
    }

    public void setHttps_url (String https_url)
    {
        this.https_url = https_url;
    }

    public String getFormat ()
    {
        return format;
    }

    public void setFormat (String format)
    {
        this.format = format;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [https_url = "+https_url+", format = "+format+", url = "+url+", size = "+size+"]";
    }
}
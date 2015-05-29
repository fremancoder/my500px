package be.freman.my500px.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PxShareCount
{
    private int twitter;

    private int facebook;

    private int pinterest;

    public int getFacebook ()
    {
        return facebook;
    }

    public int getPinterest ()
    {
        return pinterest;
    }

    public int getTwitter ()
    {
        return twitter;
    }

    public void setFacebook (int facebook)
    {
        this.facebook = facebook;
    }

    public void setPinterest (int pinterest)
    {
        this.pinterest = pinterest;
    }

    public void setTwitter (int twitter)
    {
        this.twitter = twitter;
    }

}
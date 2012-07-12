package com.deluxe.newsroom.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "title",
    "url",
})
@XmlRootElement(name = "item")
public class Item {
    
    @XmlElement(required = true)
    private long id;
    
    @XmlElement(required = true)
    private String title;
    
    @XmlElement(required = true)
    private String url;
    
    public Item(long id, String title, String url){
        this.id = id;
        this.title = title;
        this.url = url;
    }
    
    public Item(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}

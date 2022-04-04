package com.microservice.personmicroservice.modelo;

public class Image {
    private String id;
    private String name;
    private String img;
    private long size;
    private String contentType;

    public Image(String id, String name, String img, long size, String contentType) {
	super();
	this.id = id;
	this.name = name;
	this.img = img;
	this.size = size;
	this.contentType = contentType;

    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getImg() {
	return img;
    }

    public void setImg(String img) {
	this.img = img;
    }

    public long getSize() {
	return size;
    }

    public void setSize(long size) {
	this.size = size;
    }

    public String getContentType() {
	return contentType;
    }

    public void setContentType(String contentType) {
	this.contentType = contentType;
    }

}

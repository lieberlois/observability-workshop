package com.github.olly.workshop.imageorchestrator.model;

public class Image {
    private byte[] data;
    private String mimeType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public Image(byte[] data, String mimeType) {
        this.data = data;
        this.mimeType = mimeType;
    }

    public byte[] getData() {
        return data;
    }

    public String getMimeType() {
        return mimeType;
    }

    public boolean hasData() {
        return data != null && data.length > 0;
    }

}

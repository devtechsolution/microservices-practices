package org.as.devtechsolution.dto;


/**
 * @author - Aditya Srivastva(https://www.linkedin.com/in/aditya-srivastva-4704bb141/)
 */
public class ChannelInfo {
    private String source;

    private String name;

    private String url;

    public ChannelInfo(String source, String name, String url) {
        this.source = source;
        this.name = name;
        this.url = url;
    }

    public ChannelInfo() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
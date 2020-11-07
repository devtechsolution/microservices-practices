package org.as.devtechsolution.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * @author - Aditya Srivastva(https://www.linkedin.com/in/aditya-srivastva-4704bb141/)
 */

@Configuration
@ConfigurationProperties(prefix = "channel")
public class ConfigProps {

    private String name;

    private String url;

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
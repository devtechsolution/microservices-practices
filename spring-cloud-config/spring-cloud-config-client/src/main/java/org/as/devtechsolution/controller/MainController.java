package org.as.devtechsolution.controller;
import org.as.devtechsolution.config.ConfigProps;
import org.as.devtechsolution.dto.ChannelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - Aditya Srivastva(https://www.linkedin.com/in/aditya-srivastva-4704bb141/)
 */

@RestController
//@RefreshScope
public class MainController {

    @Value("${channel.source: No Channel}")
    private String source;

    @Autowired
    private ConfigProps configProps;

    @GetMapping("/info")
    public ChannelInfo getChannleInfo(){
        return new ChannelInfo(source, configProps.getName(), configProps.getUrl());
    }
}
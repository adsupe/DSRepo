package com.capgemini.in.demoBootone.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:new.properties")
//@ConfigurationProperties(prefix = "myapp")
public class MyAppProperties {

	@Value("${title}")
	private String title;
	@Value("${description}")
	private String description;
	private String version;

	// Getters and setters for the properties
	public String getTitle() {
	return title;
	}

	public void setTitle(String title) {
	this.title = title;
	}

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}

	public String getVersion() {
	return version;
	}

	public void setVersion(String version) {
	this.version = version;
	}

	@Override
	public String toString() {
		return "MyAppProperties [title=" + title + ", description=" + description + ", version=" + version + "]";
	}
	
	
}

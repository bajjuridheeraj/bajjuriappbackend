package com.bajjuri.bajjuriappbackend.githutb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Issues {

    private final String htmlUrl;

    private final int number;

    private final String title;

    @JsonCreator
    public Issues(@JsonProperty("html_url") String htmlUrl,
                  @JsonProperty("number") int number,
                  @JsonProperty("title") String title) {
        this.htmlUrl = htmlUrl;
        this.number = number;
        this.title = title;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }
}

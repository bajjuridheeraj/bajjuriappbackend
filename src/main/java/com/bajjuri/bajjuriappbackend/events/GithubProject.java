package com.bajjuri.bajjuriappbackend.events;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class GithubProject implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String repoName;

    @Column(unique = true)
    private String orgName;

    public GithubProject() {
    }

    public GithubProject(String repoName, String orgName) {
        this.repoName = repoName;
        this.orgName = orgName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        return "GithubProject{" +
                "id=" + id +
                ", repoName='" + repoName + '\'' +
                ", orgName='" + orgName + '\'' +
                '}';
    }
}

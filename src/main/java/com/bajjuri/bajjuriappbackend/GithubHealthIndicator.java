package com.bajjuri.bajjuriappbackend;

import com.bajjuri.bajjuriappbackend.githutb.GithubClient;
import com.bajjuri.bajjuriappbackend.githutb.RepositoryEvent;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class GithubHealthIndicator implements HealthIndicator {

    private GithubClient githubClient;

    public GithubHealthIndicator(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @Override
    public Health health() {
        try {
            ResponseEntity<RepositoryEvent[]> responseEntity = this.githubClient.fetchEvents("spring-projects", "spring-boot");
            if (responseEntity.getStatusCode().is2xxSuccessful()) {
                return Health.up().build();
            } else
                return Health.down().build();
        } catch (Exception e) {
            return Health.down(e).build();
        }
    }
}

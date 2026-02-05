package com.springBootProject.githubActivity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class GithubActivitySevice {

    @Autowired
    WebClient webClient;

    // fetch api

    public Mono<String> getApi(String userName) {
        final String GitHub_Api = "https://api.github.com/users/" + userName + "/events";
        return webClient.get()
                .uri(GitHub_Api)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, response -> Mono.error(new RuntimeException("Client side exception")))
                .onStatus(HttpStatusCode::is5xxServerError,clientResponse -> Mono.error(new RuntimeException("Servre side error")))
                .bodyToMono(String.class);


    }
}

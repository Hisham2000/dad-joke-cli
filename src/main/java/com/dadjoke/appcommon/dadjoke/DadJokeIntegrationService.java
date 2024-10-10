package com.dadjoke.appcommon.dadjoke;

import com.dadjoke.appcommon.dadjoke.dto.response.DadJokeRandomIntegrationDTO;
import com.dadjoke.appcommon.dadjoke.dto.response.DadJokeSearchIntegrationDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DadJokeIntegrationService {

    private final WebClient webClient;

    public DadJokeIntegrationService(@Value("${dad.joke.url}") String dadJokeUrl) {
        this.webClient = WebClient.create(dadJokeUrl);
    }
    public Mono<DadJokeRandomIntegrationDTO> getRandomDadJoke() {
        return webClient.get()
                .uri("/")
                .accept(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                .retrieve()
                .bodyToMono(DadJokeRandomIntegrationDTO.class);
    }

    public Mono<DadJokeSearchIntegrationDTO> searchDadJoke(String search) {
        return webClient.get()
                .uri("/search?term=" + search)
                .accept(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                .retrieve()
                .bodyToMono(DadJokeSearchIntegrationDTO.class);
    }
}

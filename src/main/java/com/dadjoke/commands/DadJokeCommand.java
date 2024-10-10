package com.dadjoke.commands;

import com.dadjoke.appcommon.dadjoke.DadJokeIntegrationService;
import com.dadjoke.appcommon.dadjoke.dto.response.DadJokeRandomIntegrationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@ShellComponent
@RequiredArgsConstructor
public class DadJokeCommand {
    private final DadJokeIntegrationService dadJokeIntegrationService;

    @ShellMethod(key = "random", value = "Get a random dad joke")
    public String random() {
        return dadJokeIntegrationService.getRandomDadJoke().flatMap(response -> Mono.just(response.getJoke())).block();
    }

    @ShellMethod(key = "search", value = "Search for a dad joke")
    public List<String> search(@ShellOption() String search) {
        return dadJokeIntegrationService.searchDadJoke(search)
                .flatMap(response ->
                        Mono.just(
                                response.getResult()
                                        .stream()
                                        .map(DadJokeRandomIntegrationDTO::getJoke)
                                        .collect(Collectors.toList())))
                .block();
    }
}

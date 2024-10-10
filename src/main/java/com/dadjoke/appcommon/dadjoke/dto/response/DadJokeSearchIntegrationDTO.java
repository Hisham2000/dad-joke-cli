package com.dadjoke.appcommon.dadjoke.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DadJokeSearchIntegrationDTO {
    @JsonProperty("results")
    List<DadJokeRandomIntegrationDTO> result;
}

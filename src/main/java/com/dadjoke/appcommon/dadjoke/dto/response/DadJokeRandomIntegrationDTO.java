package com.dadjoke.appcommon.dadjoke.dto.response;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DadJokeRandomIntegrationDTO {
    private String id;
    private String joke;
}

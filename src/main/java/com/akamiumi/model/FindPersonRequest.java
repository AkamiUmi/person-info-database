package com.akamiumi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FindPersonRequest {
    private String fio;
    private String pinfl;
    private String pasSeries;
    private String pasNumber;
    private PersonDocument document;

}

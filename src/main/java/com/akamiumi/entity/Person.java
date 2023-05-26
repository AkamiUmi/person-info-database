package com.akamiumi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.akamiumi.model.PersonDocument;

import javax.persistence.*;

@Entity
@Table(name = "person")
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "fio")
    private String fio;
    @Column(name = "pinfl")
    private String pinfl;
    @Column(name = "pas_series")
    private String pasSeries;
    @Column(name = "pas_number")
    private String pasNumber;
    @Column(name = "document")
    @Enumerated(EnumType.STRING)
    private PersonDocument document;
}

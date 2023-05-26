package com.akamiumi.repository;

import com.akamiumi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query(value =
            "SELECT * FROM Person WHERE (:fio is null OR fio LIKE %:fio%) AND" +
                    " (:pinfl is null OR pinfl = :pinfl) AND" +
                    " (:pasSeries is null OR pas_series = :pasSeries) AND" +
                    " (:pasNumber is null OR pas_number = :pasNumber) AND" +
                    " (:document is null OR document = :document)",nativeQuery = true)
    List<Person> findPersonByParam(@Param("fio") String fio, @Param("pinfl") String pinfl,
                                   @Param("pasSeries") String pasSeries, @Param("pasNumber") String pasNumber, @Param("document") String document);
}

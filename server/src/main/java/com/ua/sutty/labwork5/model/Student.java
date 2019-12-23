package com.ua.sutty.labwork5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthday;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private String streetAddress;
    private String streetAddressLineTwo;
    private String city;
    private String state;
    private Long zip;
    private String country;
    private String course;
    private String additionalComments;
}

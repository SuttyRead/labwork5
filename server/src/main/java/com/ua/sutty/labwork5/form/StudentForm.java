package com.ua.sutty.labwork5.form;

import com.ua.sutty.labwork5.model.Gender;
import com.ua.sutty.labwork5.model.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentForm {

    private String firstName;
    private String lastName;
    private String middleName;
    private String month;
    private String day;
    private String year;
    private Gender gender;
    private String streetAddress;
    private String streetAddressLineTwo;
    private String city;
    private String state;
    private Long zip;
    private String country;
    private String course;
    private String additionalComments;

    public Student toStudent() {
        return Student.builder()
                .firstName(firstName)
                .lastName(lastName)
                .middleName(middleName)
                .gender(gender)
                .streetAddress(streetAddress)
                .streetAddressLineTwo(streetAddressLineTwo)
                .city(city)
                .zip(zip)
                .state(state)
                .country(country)
                .course(course)
                .additionalComments(additionalComments)
                .birthday(LocalDate.of(Integer.parseInt(year),
                        Integer.parseInt(month),
                        Integer.parseInt(day)))
                .build();
    }
}

package com.ua.sutty.labwork5.form;

import com.ua.sutty.labwork5.model.Gender;
import com.ua.sutty.labwork5.model.Student;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class StudentFormTest {

    private static final String QWERTY = "qwerty";
    private static final Long ZIP_VALUE = 12345L;
    private static final String YEAR_VALUE = "2019";
    private static final String MONTH_VALUE = "10";
    private static final String DAY_VALUE = "10";
    private static final String CITY_VALUE = "city";

    @Test
    public void shouldToStudentReturnCorrectObject() {
        StudentForm studentForm = getStudentForm();
        Student student = studentForm.toStudent();

        Assert.assertEquals(student, getStudent());
    }

    @Test
    public void shouldToStudentBeNotEquals() {
        StudentForm studentForm = getStudentForm();
        Student student = studentForm.toStudent();
        Student updatedStudent = getStudent();
        updatedStudent.setCity(CITY_VALUE);
        Assert.assertNotEquals(student, updatedStudent);
    }

    private StudentForm getStudentForm() {
        return StudentForm.builder()
                .firstName(QWERTY)
                .lastName(QWERTY)
                .middleName(QWERTY)
                .gender(Gender.MALE)
                .streetAddress(QWERTY)
                .streetAddressLineTwo(QWERTY)
                .city(QWERTY)
                .zip(ZIP_VALUE)
                .state(QWERTY)
                .country(QWERTY)
                .course(QWERTY)
                .additionalComments(QWERTY)
                .year(YEAR_VALUE)
                .month(MONTH_VALUE)
                .day(DAY_VALUE)
                .build();
    }

    private Student getStudent() {
        return Student.builder()
                .firstName(QWERTY)
                .lastName(QWERTY)
                .middleName(QWERTY)
                .gender(Gender.MALE)
                .streetAddress(QWERTY)
                .streetAddressLineTwo(QWERTY)
                .city(QWERTY)
                .zip(ZIP_VALUE)
                .state(QWERTY)
                .country(QWERTY)
                .course(QWERTY)
                .additionalComments(QWERTY)
                .birthday(LocalDate.of(Integer.parseInt(YEAR_VALUE),
                        Integer.parseInt(MONTH_VALUE),
                        Integer.parseInt(DAY_VALUE)))
                .build();
    }

}

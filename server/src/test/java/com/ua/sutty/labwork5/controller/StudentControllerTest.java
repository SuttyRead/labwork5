package com.ua.sutty.labwork5.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.ua.sutty.labwork5.Labwork5Application;
import com.ua.sutty.labwork5.form.StudentForm;
import com.ua.sutty.labwork5.model.Gender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Transactional
@RunWith(SpringRunner.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@AutoConfigureMockMvc
@SpringBootTest(classes = Labwork5Application.class)
public class StudentControllerTest {

    private static final String QWERTY = "qwerty";
    private static final Long ZIP_VALUE = 12345L;
    private static final String YEAR_VALUE = "1999";
    private static final String MONTH_VALUE = "10";
    private static final String DAY_VALUE = "10";
    private static final String URL = "/registration";
    private static final String EMPTY = "";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private StudentController studentController;

    @Test
    public void shouldStudentControllerLoad() {
        assertThat(studentController).isNotNull();
    }

    @Test
    @ExpectedDatabase("classpath:dataset/dataset.xml")
    public void shouldRegistrationCreateRecordInBase() throws Exception {
        this.mockMvc.perform(post(URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(getStudentForm()))
                .andExpect(status().isCreated());
    }

    @Test
    public void shouldRegistrationReturnBadRequest() throws Exception {
        this.mockMvc.perform(post(URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(EMPTY))
                .andExpect(status().isBadRequest());
    }

    private String getStudentForm() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        StudentForm studentForm = StudentForm.builder()
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

        return objectMapper.writeValueAsString(studentForm);
    }
}

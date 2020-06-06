package personal.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalDetailsTest {

    @Test
    void checkAgeChild() {
        String expected= "Dziecko";
        String actual= new PersonalDetails("Natalia", "Mi", 8).checkAge();
        assertEquals(expected, actual);

    }
    @Test
    void checkAgeTeen() {
        String expected= "Nastolatek";
        String actual= new PersonalDetails("Natalia", "Mi", 15).checkAge();
        assertEquals(expected, actual);
    }
    @Test
    void checkAgeAdult() {
        String expected= "Dorosly";
        String actual= new PersonalDetails("Natalia", "Mi", 20).checkAge();
        assertEquals(expected, actual);
    }

}
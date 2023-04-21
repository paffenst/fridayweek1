import de.neuefische.Main;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

public class JUnitTests {
    @Test
    void shouldReturn_true_ifPassLessThen8CharIs(){
        //GIVEN
        String password = "Happyday123!";
        //WHEN
        boolean actual = Main.isValidatedPass(password);
        //THEN
        assertTrue(password,actual);
    }
    @Test
    void shouldReturn_true_ifPassWithOneSpecialChar(){
        //GIVEN
         // String password = "Happyday123";
            String password = "Happyday123!";
        //WHEN
        boolean actual = Main.isValidatedPass(password);
        //THEN
        assertTrue(password,actual);
    }
    @Test
    void shouldReturn_true_ifPassNonTrivial(){
        //GIVEN
        //String password = "password";
        String password = "Password12@";
        //WHEN
        boolean actual = Main.isValidatedPass(password);
        //THEN
        assertTrue(password,actual);
    }
    @Test
    void shouldReturn_true_ifPassMoreThen15CharsIs(){
        //GIVEN
        String password = "Password12@";
        //String password = "Password12@Password12@";
        //WHEN
        boolean actual = Main.isValidatedPass(password);
        //THEN
        assertTrue(password,actual);
    }
    @Test
    void shouldReturn_true_ifPassIsWithLessOneNumber(){
        //GIVEN
        String password = "Password12@";
        //String password = "Password@";
        //WHEN
        boolean actual = Main.isValidatedPass(password);
        //THEN
        assertTrue(password,actual);
    }
}

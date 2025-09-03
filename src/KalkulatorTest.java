import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testDodajLiczbyJezleliDodawaneLiczbyCalkowite() {
        Assertions.assertEquals(3, Kalkulator.dodajLiczby(2,1));
    }

    @Test
            void testDodajLiczbyJezeliDodawaneRzczywiste(){
        Assertions.assertEquals(3.4,Kalkulator.dodajLiczby(2,1.4));
    }

    @Test
    void testPodzielJezeliWynikCalkowity(){
        Assertions.assertEquals(3,Kalkulator.podziel(6,2));
    }

    @Test
    void testPodzielJezeliWynikRzeczywisty(){
        Assertions.assertEquals(3.5,Kalkulator.podziel(7,2));
    }

}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void szyfrCezaraJezeliKlucz0() {
        Assertions.assertEquals("ABC", Szyfry.szyfrCezara("ABC", 0));
    }
    @Test
    void szyfrCezaraJezeliKluczMniejszyodDlugosciAlfabetu(){
        Assertions.assertEquals("DEF", Szyfry.szyfrCezara("ABC", 3));
    }
    @Test
    void szyfrCezaraJezeliKluczWiekszyOdDlugosciAlfabetu(){
        Assertions.assertEquals("DEF", Szyfry.szyfrCezara("ABC",81));
    }
    @Test
    void szyfrCezaraJezeliKluczUjemny(){
        Assertions.assertEquals("ABC", Szyfry.szyfrCezara("DEF",-3));
    }
    @Test
    void szyfrCezaraJezeliBezZawijaniaWierszyKluczy(){
        Assertions.assertEquals("DEF", Szyfry.szyfrCezara("ABC", 3));
    }
    @Test
    void szyfrCezaraJezeliZZawijaniemWierwszyKluczy(){
        Assertions.assertEquals("ABC", Szyfry.szyfrCezara("XYZ", 3));
    }
}
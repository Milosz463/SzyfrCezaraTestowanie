import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void szyfrCezaraJezeliKlucz0() {
        Assertions.assertEquals("25A", Szyfry.szyfrCezara("ABC", 0));
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
        Assertions.assertEquals("25A", Szyfry.szyfrCezara("DEF",-3));
    }
    @Test
    void szyfrCezaraJezeliBezZawijaniaWierszyKluczy(){
        Assertions.assertEquals("DEF", Szyfry.szyfrCezara("ABC", 3));
    }
    @Test
    void szyfrCezaraJezeliZZawijaniemWierwszyKluczy(){
        Assertions.assertEquals("ABC", Szyfry.szyfrCezara("XYZ", 3));
    }


    @Test
    void szyfrCezaraAsciiJezeliKlucz0() {
        Assertions.assertEquals("25A", Szyfry.szyfrCezara("ABC", 0));
    }
    @Test
    void szyfrCezaraAsciiJezeliKluczMniejszyodDlugosciAlfabetu(){
        Assertions.assertEquals("DEF", Szyfry.szyfrCezaraAscii("ABC",3));
    }
    @Test
    void szyfrCezaraAsciiJezeliKluczWiekszyOdDlugosciAlfabetu(){
        Assertions.assertEquals("DEF", Szyfry.szyfrCezaraAscii("ABC",81));
    }
    @Test
    void szyfrCezaraAsciiJezeliKluczUjemny(){
        Assertions.assertEquals("ABC", Szyfry.szyfrCezaraAscii("DEF",-3));
    }
    @Test
    void szyfrCezaraAsciiJezeliBezZawijaniaWierszyKluczy(){
        Assertions.assertEquals("DEF", Szyfry.szyfrCezaraAscii("ABC", 3));
    }
    @Test
    void szyfrCezaraAsciiJezeliZZawijaniemWierwszyKluczy(){
        Assertions.assertEquals("ABC", Szyfry.szyfrCezaraAscii("XYZ", 3));
    }
}
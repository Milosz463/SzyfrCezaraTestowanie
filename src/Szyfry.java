public class Szyfry {

    public static String szyfrCezara(String slowo, int klucz){
        String zaszyfrowane = "";
        String alfabet="ABCDEFGHIJKLMNOPQRSTUWXYZ";
        //przesuniety alfabet
        String alfabetPrzesuniety=" ";

        if(klucz>0){
            klucz=klucz%26;
             alfabetPrzesuniety=alfabet.substring(klucz, alfabet.length())+alfabet.substring(0,klucz);
        }else{
            klucz=klucz*-1;
            klucz=klucz%26;

            alfabetPrzesuniety=alfabet.substring(alfabet.length()-klucz)+alfabet.length()+alfabet.substring(0, alfabet.length()-klucz);
        }

        int kod;
        for (int i = 0; i < slowo.length(); i++) {
            kod=alfabet.indexOf(slowo.charAt(i));
            zaszyfrowane=zaszyfrowane+alfabetPrzesuniety.charAt(kod);
        }

        return zaszyfrowane;
    }

}

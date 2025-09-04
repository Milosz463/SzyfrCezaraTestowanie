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
    public static String szyfrCezaraAscii(String slowo, int klucz){
        String zaszyfrowane="";
        klucz=klucz%26;
        for (int i = 0; i < slowo.length(); i++) {
            int kodLitery=(int)slowo.charAt(i)+klucz;
            if(kodLitery>(int)'Z'){
                kodLitery=kodLitery-26;
            }
            if(kodLitery<(int)'A'){
                kodLitery=kodLitery+26;
            }
            char litera=(char)kodLitery;
            zaszyfrowane=zaszyfrowane+litera;
        }
        return  zaszyfrowane;
    }
}

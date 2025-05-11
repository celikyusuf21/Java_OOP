import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "   Bugun hava cok guzel    ";

        System.out.println(mesaj);

        /*System.out.println("Eleman sayisi: " + mesaj.length());
        System.out.println("5.eleman nedir:" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" yusuf"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("l"));
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for (String kelime:mesaj.split(" ") ){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());



    }
}

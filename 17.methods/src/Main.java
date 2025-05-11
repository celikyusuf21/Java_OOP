public class Main {

    public static void main(String[] args) {

        sayiBulmaca();

    }
    // camel casing= methodların yazım standardı.
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int arancak = 6;
        boolean varMi=false;

        for(int sayi:sayilar){
            if(sayi==arancak){
                System.out.println("Sayi mevcuttur.");
                varMi=true;
                break;
            }
        }
        if(varMi){
            mesajVer("Sayi mevcuttur: "+arancak);
        }
        else {
            mesajVer("Sayi MEvcut değildir: "+arancak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}

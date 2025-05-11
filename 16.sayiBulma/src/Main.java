public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int arancak = 5;
        boolean varMi=false;

        for(int sayi:sayilar){
            if(sayi==arancak){
                System.out.println("Sayi mevcuttur.");
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayi mevcuttur");
        }
        else {
            System.out.println("Sayi MEvcut değildir.");
        }
    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Yusuf");
        //System.out.println(sayilar.size());
//        System.out.println(sayilar.get(2));
//        sayilar.set(2,100);
//        System.out.println(sayilar.get(2));
//        sayilar.remove(0);// belirtilen index sadece silinir.
//        sayilar.clear(); // tüm elemanlari siler.
//        System.out.println(sayilar.get(0));

        for (Object i:sayilar){
            System.out.println(i);
        }



    }
}

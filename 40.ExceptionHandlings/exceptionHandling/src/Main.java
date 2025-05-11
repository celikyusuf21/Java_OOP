public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[4]);

        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("Hata olustu"); // bu tek basina hata verir. yukarida array tanimladik
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Hata olustu"); // array icin istisna yazarsak hatayi gideririz.
        }
        catch (Exception exception){  // butun istisnalari yakalar. Base exception burasidir.
            System.out.println("Loglandi: "+ exception);
        }
        finally {
            System.out.println("Ben her türlü calisirim...");
        }


    }
}

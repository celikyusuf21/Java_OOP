public class Main {

    public static void main(String[] args) {
        //grade=Not anlamına gelir.

        char grade = 'F';

        switch (grade) {

            case 'A':
                System.out.println("Mükemmel : geçtiniz.");
                break;
            case 'B': // B ve C için aynı notu kullanırız.
            case 'C':
                System.out.println("İyi : Geçtiniz.");
                break;
            case 'D':
                System.out.println(("Fena değil : Geçtiniz."));
                break;
            case 'F':
                System.out.println(("Malesef Kaldınız."));
                break;
            default: // Uyarı vermek için.
                System.out.println("Geçersiz Not Girdiniz.");

        }


    }
}

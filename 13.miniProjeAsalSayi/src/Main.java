public class Main {

    public static void main(String[] args) {

        int number=23;
        int  remainder = number%2; // remainder=kalan
        //System.out.println(remainder);

        boolean isPrime=true; // isPrime=asal mı?

        if(number==1){

            System.out.println("sayi asal değildir.");
            return;
        }

        if(number<2){ // defance programing
            System.out.println("GEçersiz sayi");
        }

        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }

        }

        if(isPrime){
            System.out.println("Sayi asaldır.");
        }
        else{
            System.out.println("Sayi asal değildir.");
        }
    }
}

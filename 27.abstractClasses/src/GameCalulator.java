public abstract class GameCalulator {

    public abstract void hesapla(); // Kim hesapla fonksiyonunu kullanacaksa override etmek zorunda abstract olunca

    public final void gameOver(){
        System.out.println("Oyun Bitti"); // final için ise gameOver fonksiyonunu kullanmak zorundasınız.Hiçbir zaman degismes.
    }
}

package kethua;

  // phương thức ghi đè
public class Nokia extends Mobile{
    @Override
    public void downloadApp () {
        System.out.println("tải CHplay");
    };
}

// phương thức để chạy thử
class AndroidTesst {
    public static void main(String[] args) {
        Nokia Nokia = new Nokia();
        Iphone Iphone = new Iphone();

        Nokia.downloadApp();
        Iphone.downloadApp();
    }

}
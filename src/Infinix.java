public class Infinix implements SmartPhone{
    private int volume;
    private boolean ispoweron;

    public int getVolume() {
        return volume;
    }

    public Infinix (){
        this.volume =50;
    }
    @Override
    public void poweron(){
        ispoweron = true;
        System.out.println("Smartphone menyala..");
        System.out.println("Selamat datang di Infinix");
        System.out.println("Android versi 10");
    }
    @Override
    public void powerof(){
        ispoweron = false;
        System.out.println("Selamat tinggal");
    }

    @Override
    public void volumeup() {
        if (ispoweron) {
            if (this.volume == Max_volume) {
                System.out.println("volume maxx!");
                System.out.println("sudah" + this.getVolume() + "&");
            } else {
                this.volume += 10;
                System.out.println("volume sekarang =" + this.getVolume());
            }
        }else {
            System.out.println("kamu belum nyalakan Smartphone");
        }
    }

    @Override
    public void volumedown(){
        if(ispoweron){
            if(this.volume == Min_volume){
                System.out.println("volume = 0%");
            }else {
                this.volume-= 10;
                System.out.println("volume sekarang =" +this.getVolume());
            }
        }else {
            System.out.println("kamu belum nyalakan Smartphone");
        }
    }

}


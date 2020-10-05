public class main {
    public static void main( String[] args){
        Bentuk segitiga =new Triangle(8, 10);

        Bentuk Lingkaran = new Circale(20);

        System.out.println("luas segitiga =" + segitiga.getArea());
        System.out.println("luas Lingkaran = " + Lingkaran.getArea());
    }
}

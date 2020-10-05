import java.util.Scanner;
public class MainInterface {
    public static void main (String[] args){

        SmartPhone not8 = new Infinix();

        SmartUser arya = new SmartUser(not8);

        arya.trunonthePhone();

        Scanner input = new Scanner(System.in);
        String action;

        while (true){
            System.out.println("==== CONTOH INTERFACE ====");
            System.out.println("[1] nyalakan Smartphone");
            System.out.println("[2] matikan Smartphone");
            System.out.println("[3] volume up");
            System.out.println("[4] volume down");
            System.out.println("[0] keluar");
            System.out.println("----------------------------");
            System.out.print("pilih aksi >");
            action = input.nextLine();


            if (action.equalsIgnoreCase("1")){
                arya.trunonthePhone();
            }else if (action.equalsIgnoreCase("2")){
                arya.trunoffthephone();
            }else if(action.equalsIgnoreCase("3")){
                arya.Phonelouder();
            }else if(action.equalsIgnoreCase("4")){
                arya.phonesilent();
            }else if(action.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("salah memasukan printah !!");
            }
        }
    }
}

package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDidompet = 25000;

        if (uangDidompet<totalBelanja) {
            System.out.println("uang kurang , silahkan belanja sesuai uang anda");
        }else if (uangDidompet>totalBelanja){
            double angsulan = uangDidompet - totalBelanja;
            System.out.println("uang cukup dan ada angsulnya:"+angsulan);
        }else{
            System.out.println("uang pass coyy ...");
        }


    }


}

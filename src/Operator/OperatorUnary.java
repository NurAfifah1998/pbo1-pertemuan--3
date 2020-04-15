package Operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                     // i tadinya 0 ditambahkan  1 sehingga i = 1
        System.out.println(i);  // betulkan i nilainya 1
        i++;                     // KARENA i tadinya sudah bernilai 1 mka sekarang ditambhakan lagi 1 menjadi 2
        System.out.println(i);   // tuh bener kan nilainya 2
        i = i + 1;                  // bisa di lihat i++ sama dengan i =i+1
        System.out.println(i); // i tado 2 sekarang menjadi 3
    }
}

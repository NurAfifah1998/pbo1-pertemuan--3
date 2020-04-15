package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai ='A';
        switch (nilai) {
            case 'A':
                System.out.println("Mahasiswa :\"Terima kasih pak\"");
                System.out.println("Dosen      :\"selmat anda dapat nilai terbaik \"");
                break;
            case 'B':
                System.out.println("Mahasiswa :\"kenapa ulun kd dapat nilai A pak\"");
                System.out.println("Dosen      :\"saya anggap kamu blm sepenuhnya paham:) \"");
                break;
            case 'C':
                System.out.println("Mahasiswa :\"bisa kh pak u meulang ujian :)\"");
                System.out.println("Dosen      :\"tidak bisa nanti di semster 8 kamu bisa perbaiki:) \"");
                break;
            default:
                System.out.println("Mahasiswa :\"knp ulun kdd nilainya pak\"");
                System.out.println("Dosen      :\"ikam blm ujian tuh ai \"");
                System.out.println("Mahasiswa :\"lakasi pak uijian u siap\"");
                System.out.println("Dosen      :\"habis dah waktuya jka dri semlm datangi ku di fakultas \"");
                System.out.println("Mahasiswa :\"huuuuuuhuuuu nangis u \"");
                System.out.println("Dosen      :\"sabar ini ujian.:)\"");
                break;
        }
    }
}

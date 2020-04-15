package percabangan;

public class Switch {
    public static void main(String[] args) {
        int KampusUniska=2;
        switch (KampusUniska){
            case 1:
                System.out.println("gedung Kampus Uniska");
                break;
            case 2:
                System.out.println("Dosen Uniska");
                break;
            case 3:
                System.out.println("Fakultas Uniska");
                break;
            case 4:
                System.out.println("Mahasiswa Uniska");
                break;
            default:
                System.out.println("Matkul ");
                break;
        }
    }
}

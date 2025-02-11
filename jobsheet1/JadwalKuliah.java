import java.util.Scanner;

public class JadwalKuliah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlhMatkul = input.nextInt();
        input.nextLine();

        String[] matkul = new String[jmlhMatkul];
        int[] sks = new int[jmlhMatkul];
        int[] semester = new int[jmlhMatkul];
        String[] hari = new String[jmlhMatkul];

        //input data matkul
        for (int i = 0; i < jmlhMatkul; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama mata kuliah: ");
            matkul[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            input.nextLine();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari kuliah: ");
            hari[i] = input.nextLine();
        }

        //menu
        while (true) {
            System.out.println("==Menu==:");
            System.out.println("1. Tampilkan jadwal kuliah");
            System.out.println("2. Cari mata kuliah");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanJadwal(matkul, sks, semester, hari);
                    break;
                case 2:
                    cariMataKuliah(matkul, sks, semester, hari);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan invalid, silahkan input ulang!");
            }
        }
    }

    // Fungsi untuk menampilkan jadwal kuliah
    static void tampilkanJadwal(String[] matkul, int[] sks,
        int[] semester, String[] hari) {

        System.out.println("\nSubmenu Tampilkan Jadwal:");
        System.out.println("1. Tampilkan seluruh jadwal kuliah");
        System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
        System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
        System.out.print("Masukkan pilihan: ");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                jadwalKeseluruhan(matkul, sks, semester, hari);
                break;
            case 2:
                jadwalBeradasarkanHari(matkul, sks, semester, hari);
                break;
            case 3:
                jadwalBerdasarkanSmt(matkul, sks, semester, hari);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    // Fungsi untuk menampilkan seluruh jadwal kuliah
    static void jadwalKeseluruhan(String[] matkul, int[] sks,
        int[] semester, String[] hari) {

        System.out.println("Jadwal Kuliah:");
        System.out.println("============================================");
        System.out.println("Nama Matkul\t" + "SK\t" + "Semester\t\t" + "Hari");
        System.out.println("============================================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i] + "\t\t" + sks[i]+ "\t\t" + semester[i] + "\t\t" + hari[i]);
        }

        System.out.println("============================================");
    }

    // Fungsi untuk menampilkan jadwal kuliah berdasarkan hari
    static void jadwalBeradasarkanHari(String[] matkul, int[] sks,
        int[] semester, String[] hari) {

        System.out.print("\nMasukkan hari yang ingin ditampilkan (Senin, Selasa, dst.): ");
        Scanner input = new Scanner(System.in);
        String inputHari = input.nextLine();

        System.out.println("\nJadwal Kuliah Hari " + inputHari + ":");
        System.out.println("============================================");
        System.out.println("Nama Matkul\t" + "SK\t" + "Semester\t\t" + "inputHari");
        System.out.println("============================================");

        for (int i = 0; i < matkul.length; i++) {
            if (hari[i].equalsIgnoreCase(inputHari)) {
                System.out.println(matkul[i] + "\t\t" + sks[i]+ "\t\t" + semester[i] + "\t\t" + hari[i]);
            }
        }
        System.out.println("============================================");
    }

    // Fungsi untuk menampilkan jadwal kuliah berdasarkan semester
    static void jadwalBerdasarkanSmt(String[] matkul, int[] sks,
        int[] semester, String[] hari) {

        System.out.print("\nMasukkan semester yang ingin ditampilkan (misalnya, 1): ");
        Scanner input = new Scanner(System.in);
        int semesterInput = input.nextInt();

        System.out.println("\nJadwal Kuliah Semester " + semesterInput + ":");
        System.out.println("============================================");
        System.out.println("Nama Matkul\t" + "SK\t" + "Semester\t\t" + "Hari");
        System.out.println("============================================");

        for (int i = 0; i < matkul.length; i++) {
            if (semester[i] == semesterInput) {
                System.out.println(matkul[i] + "\t\t" + sks[i]+ "\t\t" + semester[i] + "\t\t" + hari[i]);
            }
        }

        System.out.println("============================================");
    }

    // Fungsi untuk mencari mata kuliah
    static void cariMataKuliah(String[] matkul, int[] sks,
        int[] semester, String[] hari) {

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        Scanner input = new Scanner(System.in);
        String matkulCari = input.nextLine();

        System.out.println("\nInformasi Mata Kuliah " + matkulCari + ":");
        System.out.println("============================================");
        System.out.println("Nama Matkul\t" + "SK\t" + "Semester\t\t" + "Hari");
        System.out.println("============================================");

        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].equalsIgnoreCase(matkulCari)) {
                System.out.println(matkul[i] + "\t\t" + sks[i]+ "\t\t" + semester[i] + "\t\t" + hari[i]);
            }
        }
    }
}
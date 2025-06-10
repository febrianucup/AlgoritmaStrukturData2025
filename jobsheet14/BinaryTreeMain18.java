package jobsheet14;

public class BinaryTreeMain18 {
    public static void main(String[] args) {
        BinaryTree18 bst = new BinaryTree18();

        bst.add(new Mahasiswa18("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa18("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa18("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa18("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa18("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa18("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa18("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDAftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("PreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("PostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa:");
        bst.delete(3.57);
        System.out.println("\nDAftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        bst.addRekursif(new Mahasiswa18("244160088", "Julia", "D", 3.78));
        bst.addRekursif(new Mahasiswa18("244160054", "Budi", "G", 3.45));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan rekursif (InOrder):");
        bst.traverseInOrder(bst.root);

        System.out.println("\n=== Mencari IPK Minimum dan Maksimum === ");
        Mahasiswa18 minMhs = bst.cariMinIPK();
        if (minMhs != null) {
            System.out.print("Mahasiswa dengan IPK Terkecil: ");
            minMhs.tampilInformasi();
        }
        Mahasiswa18 maxMhs = bst.cariMaxIPK();
        if (maxMhs != null) {
            System.out.print("Mahasiswa dengan IPK Terbesar: ");
            maxMhs.tampilInformasi();
        }

        System.out.println("\n=== Mahasiswa dengan IPK di Atas Batas Tertentu ===");
        bst.tampilMahasiswaIPKdiAtas(3.50, bst.root);
    }
}

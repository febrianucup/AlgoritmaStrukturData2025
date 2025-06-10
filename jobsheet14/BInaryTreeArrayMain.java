package jobsheet14;

public class BInaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray18 bta = new BinaryTreeArray18();
        Mahasiswa18 mhs1 = new Mahasiswa18("244160121", "Ali", "A", 3.57);
        Mahasiswa18 mhs2 = new Mahasiswa18("244160185", "Candra", "C", 3.41);
        Mahasiswa18 mhs3 = new Mahasiswa18("244160221", "Badar", "B", 3.75);
        Mahasiswa18 mhs4 = new Mahasiswa18("244160220", "Dewi", "B", 3.35);
        Mahasiswa18 mhs5 = new Mahasiswa18("244160131", "Dewi", "A", 3.48);
        Mahasiswa18 mhs6 = new Mahasiswa18("244160205", "Ehsan", "D", 3.61);
        Mahasiswa18 mhs7 = new Mahasiswa18("244160170", "Fizi", "B", 3.86);

        Mahasiswa18[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa : ");
        bta.traverseInOrder(0);

        Mahasiswa18 mhs8 = new Mahasiswa18("244160180", "Febri", "A", 3.77);
        bta.add(mhs8);
        Mahasiswa18 mhs9 = new Mahasiswa18("244160270", "Endrik", "D", 3.36);
        bta.add(mhs9);

        System.out.println("\nInorder Traversal Mahasiswa setelah penambahan 2 mahasiswa:");
        bta.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal Mahasiswa setelah penambahan 2 mahasiswa:");
        bta.traversePreOrder(0);
    }
}

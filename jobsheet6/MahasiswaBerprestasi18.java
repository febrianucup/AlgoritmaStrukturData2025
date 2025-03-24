package jobsheet6;

public class MahasiswaBerprestasi18 {
    int jmlhMhs;
    Mahasiswa18[] listMhs;
    int idx;

    MahasiswaBerprestasi18(int jmlh){
        jmlhMhs=jmlh;
        listMhs=new Mahasiswa18[jmlhMhs];
    }

    void tambah(Mahasiswa18 mhs){
        if(idx<listMhs.length){
            listMhs[idx]=mhs;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa18 mhs:listMhs){
            mhs.tampilInformasi();
            System.out.println("----------------------");
        }
    }

    int sequentialSearch(double cari){
        int posisi=-1;
        for(int i=0;i<listMhs.length;i++){
            if(listMhs[i].ipk==cari){
                posisi=i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if(pos!=-1){
            System.out.println("Data Mahasiswa dengan IPK: " + x + " ditemukan pada indeks: " + pos);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if(pos!=-1){
            System.out.println("Nim\t :" + listMhs[pos].nim);
            System.out.println("Nama\t :" + listMhs[pos].nama);
            System.out.println("Kelas\t :" + listMhs[pos].kelas);
            System.out.println("IPK\t :" + x);
        }else{
            System.out.println("Data mahasiswa dengan IPk " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if(right>=left){
            mid=(right+left)/2;
            if(cari==listMhs[mid].ipk){
                return (mid);
            }else if(listMhs[mid].ipk>cari){
                return findBinarySearch(cari, mid+1, right);
            }else{
                return findBinarySearch(cari, left, mid-1);
            }
        }
        return -1;
    }
}

package jobsheet6;

public class DataDosen18 {
    int jmlhDosen;
    Dosen18[] dataDosen;
    int idx;
    
    DataDosen18(int jmlh){
        jmlhDosen=jmlh;
        dataDosen=new Dosen18[jmlhDosen];
    }

    void tambah(Dosen18 dsn){
        if(idx<dataDosen.length){
            dataDosen[idx]=dsn;
            idx++;
        }else{
            System.out.println("Data telah penuh!");
        }
    }

    void tampil(){;
        for(int i=0;i<dataDosen.length;i++){
            dataDosen[i].tampil();
            System.out.println("----------------------------------");
        }
    }

    int find=0;//untuk mengetahui seberapa banyak nama yang sama muncul
    int pencarianDataSequential18(String srcName){
        int idx=-1;
        for(int i=0;i<dataDosen.length;i++){
            if(dataDosen[i].nama.equalsIgnoreCase(srcName)){
                idx=i;
                find++;
            }
        }

        return idx;
    }

    void sortingASC(Dosen18[] dsn){
        for(int i=0;i<dsn.length-1;i++){
            for(int j=1;j<dsn.length-i;j++){
                if(dsn[j].usia<dsn[j-1].usia){
                    Dosen18 temp=dsn[j];
                    dsn[j]=dsn[j-1];
                    dsn[j-1]=temp;
                }
            }
        }
    }

    int pencarianDataBinary(int usia, int left, int right){
        sortingASC(dataDosen);
        int mid;
        if(right>=left){
            mid=(right+left)/2;
            if(usia==dataDosen[mid].usia){
                return (mid);
            }else if(dataDosen[mid].usia>usia){
                return pencarianDataBinary(usia, left, mid-1);
            }else{
                return pencarianDataBinary(usia, mid+1, right);
            }
        }
        return -1;
    }

    void tampilDataSequential(String name, int pos){
        if(pos!=-1){
            if(find==1){
                System.out.println("Data Dosen dengan nama: " + name + " ditemukan pada indeks: " + pos);
                System.out.println("Kode\t :" + dataDosen[pos].kode);
                System.out.println("Nama\t :" + name);
                System.out.println("JK\t :" + (dataDosen[pos].jenisKelamin?"Wanita":"Pria"));
                System.out.println("Usia\t :" + dataDosen[pos].usia);
            }else{
                System.out.println("Peringatan!! Data dosen dengan nama " + name + " ditemukan lebih dari satu!!");
            }
        }else{
            System.out.println("Nama " + name + " tidak ditemukan");
        }
    }

    void tampilDataBinary(int x, int pos){
        if(pos!=-1){
            System.out.println("Kode\t :" + dataDosen[pos].kode);
            System.out.println("Nama\t :" + dataDosen[pos].nama);
            System.out.println("JK\t :" + (dataDosen[pos].jenisKelamin?"Wanita":"Pria"));
            System.out.println("Usia\t :" + x);
        }else{
            System.out.println("Data dosen dengan usia " + x + " tidak ditemukan");
        }
    }
}

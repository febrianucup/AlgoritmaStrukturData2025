package jobsheet7;

public class DataNilai {
   
    Penilaian[] nilai = new Penilaian[5];

    DataNilai(){
        
    }

    void urutDataBerdasarkanNilai(Penilaian[] nilai){
        for(int i=0;i<nilai.length-1;i++){
            for (Penilaian n : nilai) {
                if (n != null) {
                    n.hitungNilaiAkhir();
                }
            }
            for(int j=1;j<nilai.length-i;j++){
                if(nilai[j].nilaiAkhir > nilai[j - 1].nilaiAkhir){
                    Penilaian tmp=nilai[j];
                    nilai[j]=nilai[j-1];
                    nilai[j-1]=tmp;
                }
            }
        }
    }

    public void tampilSorting(Penilaian[] nilai1){
        urutDataBerdasarkanNilai(nilai1);
        for(int i=0;i<nilai1.length;i++){
            nilai1[i].tampilDataNilai();
        }
    }

    int searchNIM(String nim, Mahasiswa[] dataMahasiswa){
        int idx=-1;
        for(int i=0;i<dataMahasiswa.length;i++){
            if(dataMahasiswa[i].NIM.equalsIgnoreCase(nim)){
                idx=i;
                break;
            }else{
                System.out.println("NIM yang dicari tidak ada");
            }
        }
        return idx;
    }

    void tampilNim(String nim, Mahasiswa[] dataMahasiswa){
        int id=searchNIM(nim, dataMahasiswa);
        if(id!=-1){
            System.out.println("Mahasiswa ditemukan: NIM: " + dataMahasiswa[id].NIM + " | " + "Nama: " + dataMahasiswa[id].nama + " | " + "Prodi: " + dataMahasiswa[id].prodi);
        }
    }



}

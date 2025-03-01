package jobshett3;

public class DataDosen18 {

    void dataSemuaDosen(Dosen18[] arrayOfDosen){
        int i=1;
        for(Dosen18 dosen:arrayOfDosen){
            System.out.println("Data Dosen ke-" + i);
            System.out.println("KODE         : " + dosen.kode);
            System.out.println("NAMA         : " + dosen.nama);
            String kelamin=dosen.jenisKelamin?"Pria":"Wanita";
            System.out.println("JENIS KELAMIN: " + kelamin);
            System.out.println("USIA         : " + dosen.usia);
            System.out.println("-----------------------------");
            i++;
        }
    }

    int jumlahDosenPria(Dosen18[] arrayOfDosen){
        int man=0;
        for(int i=0;i<arrayOfDosen.length;i++){
            if(arrayOfDosen[i].jenisKelamin.equals(true)){
                man++;
            }
        }
        return man;
    }

    int jumlahDosenWanita(Dosen18[] arrayOfDosen){
        int woman=0;
        for(int i=0;i<arrayOfDosen.length;i++){
            if(arrayOfDosen[i].jenisKelamin.equals(false)){
                woman++;
            }
        }
        return woman;
    }

    void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen){
        int manTotal=jumlahDosenPria(arrayOfDosen);
        int womanTotal=jumlahDosenWanita(arrayOfDosen);

        System.out.println("Jumlah Dosen Pria: " + manTotal);
        System.out.println("Jumlah Dosen Wanita: " + womanTotal);
        System.out.println("-----------------------------");
    }

    double totalUsiaPria(Dosen18[] arrayOfDosen){
        double totalUsiaPria=0;
        for(Dosen18 dosen:arrayOfDosen){
            if(dosen.jenisKelamin.equals(true)){
                totalUsiaPria+=dosen.usia;
            }
        }

        return totalUsiaPria;
    }

    double totalUsiaWanita(Dosen18[] arrayOfDosen){
        double totalUsiaWanita=0;
        for(Dosen18 dosen:arrayOfDosen){
            if(dosen.jenisKelamin.equals(false)){
                totalUsiaWanita+=dosen.usia;
            }
        }

        return totalUsiaWanita;
    }

    void rerataUsiaDosenPerjenisKelamin(Dosen18[] arrayOfDosen){
        double totalUsiaPria=totalUsiaPria(arrayOfDosen);
        double totalUsiaWanita=totalUsiaWanita(arrayOfDosen);
        
        int man=jumlahDosenPria(arrayOfDosen);
        int woman=jumlahDosenWanita(arrayOfDosen);

        double manAgeAvarage=totalUsiaPria!=0?totalUsiaPria/man:0;
        double womanAgeAvarage=totalUsiaWanita!=0?totalUsiaWanita/woman:0;
        
        System.out.println("Rata-rata usia dosen pria: " + manAgeAvarage);
        System.out.println("Rata-rata usia dosen wanita: " + womanAgeAvarage);
        System.out.println("-----------------------------");
    }

    void infoDosenPalingTua(Dosen18[] arrayOfDosen){
        int top=0;
        int idx=-1;
        for(int i=0;i<arrayOfDosen.length;i++){
            if(arrayOfDosen[i].usia>top){
                top=arrayOfDosen[i].usia;
                idx=i;
            }
        }
        System.out.println("Dosen dengan umur paling tua adalah: " + arrayOfDosen[idx].nama + " berusia " + top);
        System.out.println("-----------------------------");
    }

    void infoDosenPalingMuda(Dosen18[] arrayOfDosen){
        int lowest=100;
        int idx=-1;
        for(int i=0;i<arrayOfDosen.length;i++){
            if(arrayOfDosen[i].usia<lowest){
                lowest=arrayOfDosen[i].usia;
                idx=i;
            }
        }
        System.out.println("Dosen dengan umur paling muda adalah: " + arrayOfDosen[idx].nama + " berusia " + lowest);
        System.out.println("-----------------------------");
    }
}

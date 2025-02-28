package jobshett3;

public class DataDosen18 {
    int man=0;
    int woman=0;
    
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

    void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen){
        for(int i=0;i<arrayOfDosen.length;i++){
            if(arrayOfDosen[i].jenisKelamin.equals(true)){
                man++;
            }else{
                woman++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + man);
        System.out.println("Jumlah Dosen Wanita: " + woman);
        System.out.println("-----------------------------");
    }

    void rerataUsiaDosenPerjenisKelamin(Dosen18[] arrayOfDosen){
        double totalUsiaPria=0;
        double totalUsiaWanita=0;
        for(Dosen18 dosen:arrayOfDosen){
            if(dosen.jenisKelamin.equals(true)){
                totalUsiaPria+=dosen.usia;
            }else if(dosen.jenisKelamin.equals(false)){
                totalUsiaWanita+=dosen.usia;
            }
        }

        double manAgeAvarage;
        double womanAgeAvarage;

        if(totalUsiaPria!=0){
            manAgeAvarage=totalUsiaPria/man;
        }else{
            manAgeAvarage=0;
        }
        if(totalUsiaWanita!=0){
            womanAgeAvarage=totalUsiaWanita/woman;
        }else{
            womanAgeAvarage=0;
        }
        
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

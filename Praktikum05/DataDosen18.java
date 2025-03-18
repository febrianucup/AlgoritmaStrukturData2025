package Praktikum05;

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

    void sortingASC(){
        for(int i=0;i<dataDosen.length-1;i++){
            for(int j=1;j<dataDosen.length-i;j++){
                if(dataDosen[j].usia<dataDosen[j-1].usia){
                    Dosen18 temp=dataDosen[j];
                    dataDosen[j]=dataDosen[j-1];
                    dataDosen[j-1]=temp;
                }
            }
        }
    }

    void sortingDSC(){
        for(int i=0;i<dataDosen.length-1;i++){
            int idxmin=i;
            for(int j=1;j<dataDosen.length-i;j++){
                if(dataDosen[j].usia>dataDosen[idxmin].usia){
                    idxmin=j;
                }
            }
            Dosen18 temp=dataDosen[idxmin];
            dataDosen[idxmin]=dataDosen[i];
            dataDosen[i]=temp;
        }
    }

    void insertionSort(){
        for(int i=1;i<dataDosen.length;i++){
            Dosen18 temp=dataDosen[i];
            int j=i;
            while(j>0 && dataDosen[j-1].usia<temp.usia){
                dataDosen[j]=dataDosen[j-1];
                j--;
            }
            dataDosen[j]=temp;
        }
    }
}

package collection;

import java.util.Comparator;

public class customer18 {
    public int id;
    public String name;
    public Comparator<? super customer18> c2;

    public customer18(){

    }

    public customer18(int id, String nama){
        this.id=id;
        this.name=nama;
    }

    public String toString(){
        return "ID: " + this.id + " Nama: " + this.name;
    }
}

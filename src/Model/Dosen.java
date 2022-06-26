package Model;

import java.util.ArrayList;

abstract class Dosen extends Staff {

    ArrayList<MatkulAjar> listMataKuliahAjar = new ArrayList<>();
    private String departemen;


    public Dosen(String departemen, int NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
        setListMataKuliahAjar(listMataKuliahAjar);
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMataKuliahAjar() {
        return listMataKuliahAjar;
    }

    public void setListMataKuliahAjar(ArrayList<MatkulAjar> listMataKuliahAjar) {
        this.listMataKuliahAjar = listMataKuliahAjar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen=" + departemen;
    }

    public String statusChecker(int _status) {
        if (_status == Interface.HADIR) {
            return "Hadir";
        }
        return "Alpha";
    }

}

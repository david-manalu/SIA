package Model;

import java.util.ArrayList;

public class DosenTetap extends Dosen {

    ArrayList<MatkulAjar> mataKuliahAjar = new ArrayList<MatkulAjar>();
    private int salary;

    public DosenTetap(String nama, int NIK, String alamat, String TTL, String telepon, int salary, String departemen, ArrayList<MatkulAjar> mataKuliahAjar) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
        setMataKuliahAjar(mataKuliahAjar);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<MatkulAjar> getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(ArrayList<MatkulAjar> mataKuliahAjar) {
        this.mataKuliahAjar = mataKuliahAjar;
    }


    @Override

    public String toString() {
        String msg = "\nDosen Tetap\n";
        for (int i = 0; i < mataKuliahAjar.size(); i++) {
            MatkulAjar current = mataKuliahAjar.get(i);
            if (current.mataKuliahAjar.getNama() != null) {
                msg += "\nNama Matkul = " + current.mataKuliahAjar.getNama();
                msg += "\nKode Matkul = " + current.mataKuliahAjar.getKode();
                msg += "\nSKS Matkul = " + current.mataKuliahAjar.getSKS();
            }

            for (int j = 0; j < current.getListPresensiStaff().size(); j++) {
                msg += "\nStatus tanggal " + current.getListPresensiStaff().get(i).getTanggal()
                        + " , jam " + current.getListPresensiStaff().get(i).getJam()
                        + " = " + statusChecker(current.getListPresensiStaff().get(j).getStatus());
            }

            msg += "\n";

        }
        return super.toString() + msg;
    }


}

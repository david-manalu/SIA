package Model;

import java.util.ArrayList;

public class DosenHonorer extends Dosen {

    ArrayList<MatkulAjar> mataKuliahAjar = new ArrayList<MatkulAjar>();
    private int honorPerSKS;

    public DosenHonorer(String nama, int NIK, String alamat, String TTL, String telepon, int honorPerSKS, String departemen, ArrayList<MatkulAjar> mataKuliahAjar) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
        setMataKuliahAjar(mataKuliahAjar);
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public ArrayList<MatkulAjar> getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(ArrayList<MatkulAjar> mataKuliahAjar) {
        this.mataKuliahAjar = mataKuliahAjar;
    }


    @Override
    public String toString() {
        String msg = "\nDosen Honorer\n";
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

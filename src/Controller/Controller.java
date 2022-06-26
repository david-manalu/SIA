package Controller;

import Model.Interface;

import javax.swing.*;

public class Controller {

    InisialisasiData inisialisasi = new InisialisasiData();

    public void printUserData(String _nama) {
        for (int i = 0; i < inisialisasi.getArrListMhsSarjana().size(); i++) {
            if (_nama.equalsIgnoreCase(inisialisasi.getArrListMhsSarjana().get(i).getNama())) {
                String txt = inisialisasi.getArrListMhsSarjana().get(i).toString();
                JOptionPane.showMessageDialog(null, txt);
                return;
            }
        }

        for (int i = 0; i < inisialisasi.getArrListMhsMagister().size(); i++) {
            if (_nama.equalsIgnoreCase(inisialisasi.getArrListMhsMagister().get(i).getNama())) {
                String txt = inisialisasi.getArrListMhsMagister().get(i).toString();
                JOptionPane.showMessageDialog(null, txt);
                return;
            }
        }

        for (int i = 0; i < inisialisasi.getArrListMhsDoktor().size(); i++) {
            if (_nama.equalsIgnoreCase(inisialisasi.getArrListMhsDoktor().get(i).getNama())) {
                String txt = inisialisasi.getArrListMhsDoktor().get(i).toString();
                JOptionPane.showMessageDialog(null, txt);
                return;
            }
        }

        for (int i = 0; i < inisialisasi.getArrListDosenTetap().size(); i++) {
            if (_nama.equalsIgnoreCase(inisialisasi.getArrListDosenTetap().get(i).getNama())) {
                String txt = inisialisasi.getArrListDosenTetap().get(i).toString();
                JOptionPane.showMessageDialog(null, txt);
                return;
            }
        }

        for (int i = 0; i < inisialisasi.getArrListDosenHonorer().size(); i++) {
            if (_nama.equalsIgnoreCase(inisialisasi.getArrListDosenHonorer().get(i).getNama())) {
                String txt = inisialisasi.getArrListDosenHonorer().get(i).toString();
                JOptionPane.showMessageDialog(null, txt);
                return;
            }
        }

        for (int i = 0; i < inisialisasi.getArrListKaryawan().size(); i++) {
            if (_nama.equalsIgnoreCase(inisialisasi.getArrListKaryawan().get(i).getNama())) {
                String txt = inisialisasi.getArrListKaryawan().get(i).toString();
                JOptionPane.showMessageDialog(null, txt);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Nama yang dimasukkan salah");

    }

    public void printNilaiAkhir(int _nim, String _kodeMK) {
        boolean cekSarjana = false;
        boolean cekMagister = false;
        boolean cekDoktor = false;
        boolean cekMatkul = false;
        for (int j = 0; j < inisialisasi.getArrListMhsSarjana().size(); j++) {
            if (_nim == inisialisasi.getArrListMhsSarjana().get(j).getNIM()) {
                cekSarjana = true;
                for (int i = 0; i < inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().size(); i++) {
                    if (_kodeMK.equals(inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahWajib().getKode())
                            || _kodeMK.equals(inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahPilihan().getKode())) {
                        cekMatkul = true;

                        float nilai = (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN1();
                        nilai += (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN2();
                        nilai += (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN3();
                        nilai = nilai / 3;

                        JOptionPane.showMessageDialog(null, "Nilai Rata-Rata dari Mahasiswa " + _nim + ", pada kode mata kuliah " + _kodeMK + " = " + nilai);
                        return;
                    }
                }
            }
        }
        for (int j = 0; j < inisialisasi.getArrListMhsMagister().size(); j++) {
            if (_nim == inisialisasi.getArrListMhsMagister().get(j).getNIM()) {
                cekMagister = true;
                for (int i = 0; i < inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().size(); i++) {
                    if (_kodeMK.equals(inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getMataKuliahWajib().getKode())
                            || _kodeMK.equals(inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getMataKuliahPilihan().getKode())) {
                        cekMatkul = true;

                        float nilai = (float) inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN1();
                        nilai += (float) inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN2();
                        nilai += (float) inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN3();
                        nilai = nilai / 3;

                        JOptionPane.showMessageDialog(null, "Nilai Rata-Rata dari Mahasiswa " + _nim + ", pada kode mata kuliah " + _kodeMK + " = " + nilai);
                        return;
                    }
                }
            }
        }
        for (int j = 0; j < inisialisasi.getArrListMhsDoktor().size(); j++) {
            if (_nim == inisialisasi.getArrListMhsDoktor().get(j).getNIM()) {
                cekDoktor = true;
                cekMatkul = true;

                float nilai = inisialisasi.getArrListMhsDoktor().get(j).getNilaiSidang1();
                nilai += inisialisasi.getArrListMhsDoktor().get(j).getNilaiSidang2();
                nilai += inisialisasi.getArrListMhsDoktor().get(j).getNilaiSidang3();
                nilai = nilai / 3;
                JOptionPane.showMessageDialog(null, "Nilai Rata-Rata dari Mahasiswa " + _nim + ", pada kode mata kuliah " + _kodeMK + " = " + nilai);
                return;
            }
        }

        if (!cekSarjana && !cekMagister && !cekDoktor) {
            JOptionPane.showMessageDialog(null, "NIM yang dimasukkan salah!");
        } else if (!cekMatkul) {
            JOptionPane.showMessageDialog(null, "Kode Mata Kuliah yang dimasukkan salah!");
        }

    }

    public void printRataNilaiAkhirAllMhs(String _kodeMK) {
        String txt = "Nilai Akhir Rata-Rata dengan Kode : " + _kodeMK;
        boolean cekSarjana = false;
        boolean cekMagister = false;

        for (int j = 0; j < inisialisasi.getArrListMhsSarjana().size(); j++) {
            for (int i = 0; i < inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().size(); i++) {
                if (_kodeMK.equals(inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahWajib().getKode())
                        || _kodeMK.equals(inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahPilihan().getKode())) {
                    cekSarjana = true;

                    float nilai = (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN1();
                    nilai += (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN2();
                    nilai += (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN3();
                    nilai = nilai / 3;

                    txt += "\nMahasiswa " + inisialisasi.getArrListMhsSarjana().get(j).getNama() + " = " + nilai;
                }
            }
        }

        if (cekSarjana) {
            JOptionPane.showMessageDialog(null, txt);
            return;
        }

        for (int j = 0; j < inisialisasi.getArrListMhsMagister().size(); j++) {
            for (int i = 0; i < inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().size(); i++) {
                if (_kodeMK.equals(inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getMataKuliahWajib().getKode())
                        || _kodeMK.equals(inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getMataKuliahPilihan().getKode())) {
                    cekMagister = true;

                    float nilai = (float) inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN1();
                    nilai += (float) inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN2();
                    nilai += (float) inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().get(i).getN3();
                    nilai = nilai / 3;

                    txt += "\nMahasiswa " + inisialisasi.getArrListMhsMagister().get(j).getNama() + " = " + nilai;
                }
            }
        }

        if (cekMagister) {
            JOptionPane.showMessageDialog(null, txt);
        } else {
            JOptionPane.showMessageDialog(null, "Kode Mata Kuliah yang dimasukkan salah!");
        }
    }

    public void printJumlahMhsTidakLulus(String _kodeMK) {
        int total = 0;
        boolean cekKode = false;

        for (int i = 0; i < inisialisasi.getArrListMhsSarjana().size(); i++) {
            for (int j = 0; j < inisialisasi.getArrListMhsSarjana().get(i).getListMataKuliahSarjana().size(); j++) {
                if (_kodeMK.equals(inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahWajib().getKode())
                        || _kodeMK.equals(inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getMataKuliahPilihan().getKode())) {
                    cekKode = true;
                    float nilai = (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN1();
                    nilai += (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN2();
                    nilai += (float) inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().get(i).getN3();
                    nilai = nilai / 3;
                }
            }
        }
    }

    public void printMatkulAmbilDanPresensiMhs(int _nim) {
        String txt = "Mahasiswa NIM : " + _nim + ", Nama = ";
        boolean cekSarjana = false;
        boolean cekMagister = false;

        for (int j = 0; j < inisialisasi.getArrListMhsSarjana().size(); j++) {
            if (_nim == inisialisasi.getArrListMhsSarjana().get(j).getNIM()) {
                cekSarjana = true;
                txt += inisialisasi.getArrListMhsSarjana().get(j).getNama() + " :\n";
                for (int i = 0; i < inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().size(); i++) {
                    txt += inisialisasi.getArrListMhsSarjana().get(j).getListMataKuliahSarjana().toString();
                }
            }
        }
        if (cekSarjana) {
            JOptionPane.showMessageDialog(null, txt);
            return;
        }

        for (int j = 0; j < inisialisasi.getArrListMhsMagister().size(); j++) {
            if (_nim == inisialisasi.getArrListMhsMagister().get(j).getNIM()) {
                cekMagister = true;
                txt += inisialisasi.getArrListMhsMagister().get(j).getNama() + " :\n";
                for (int i = 0; i < inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().size(); i++) {
                    txt += inisialisasi.getArrListMhsMagister().get(j).getListMataKuliahMagister().toString();
                }
            }
        }
        if (cekMagister) {
            JOptionPane.showMessageDialog(null, txt);
        } else if (!cekSarjana && !cekMagister) {
            JOptionPane.showMessageDialog(null, "NIM yang dimasukkan salah!");
        }
    }

    public void printTotalJamMengajarDosen(int _nik) {
        int total = 0;
        String txt = "Dosen NIK : " + _nik + ", Nama = ";
        boolean foundTetap = false;
        boolean foundHonorer = false;
        for (int i = 0; i < inisialisasi.getArrListDosenTetap().size(); i++) {
            if (_nik == inisialisasi.getArrListDosenTetap().get(i).getNIK()) {
                txt += inisialisasi.getArrListDosenTetap().get(i).getNama();
                foundTetap = true;
                for (int j = 0; j < inisialisasi.getArrListDosenTetap().get(i).getMataKuliahAjar().size(); j++) {
                    for (int k = 0; k < inisialisasi.getArrListDosenTetap().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().size(); k++) {
                        if (inisialisasi.getArrListDosenTetap().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().get(k).getStatus() == Interface.HADIR) {
                            total += 2;
                        }
                    }
                }
            }
        }
        if (foundTetap) {
            JOptionPane.showMessageDialog(null, txt + " sebagai dosen tetap mengajar dengan total " + total + " jam");
            return;
        }

        for (int i = 0; i < inisialisasi.getArrListDosenHonorer().size(); i++) {
            if (_nik == inisialisasi.getArrListDosenHonorer().get(i).getNIK()) {
                txt += inisialisasi.getArrListDosenHonorer().get(i).getNama();
                foundHonorer = true;
                for (int j = 0; j < inisialisasi.getArrListDosenHonorer().get(i).getMataKuliahAjar().size(); j++) {
                    for (int k = 0; k < inisialisasi.getArrListDosenHonorer().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().size(); k++) {
                        if (inisialisasi.getArrListDosenHonorer().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().get(k).getStatus() == Interface.HADIR) {
                            total += 2;
                        }
                    }
                }
            }
        }
        if (foundHonorer) {
            JOptionPane.showMessageDialog(null, txt + " sebagai dosen honorer mengajar dengan total " + total + " jam");
        } else if (!foundTetap && !foundHonorer) {
            JOptionPane.showMessageDialog(null, "NIK yang dimasukkan salah!");
        }
    }

    public void printGajiStaff(int _nik) {
        boolean foundKaryawan = false;
        boolean foundDosenTetap = false;
        boolean foundDosenHonorer = false;
        String txt = "Karyawan " + _nik + " ";
        float gaji = 0;
        int unit = 0;
        for (int i = 0; i < inisialisasi.getArrListKaryawan().size(); i++) {
            if (_nik == (inisialisasi.getArrListKaryawan().get(i).getNIK())) {
                foundKaryawan = true;
                txt += "; Nama = " + inisialisasi.getArrListKaryawan().get(i).getNama() + " sebagai karyawan";
                for (int j = 0; j < inisialisasi.getArrListKaryawan().get(i).getListPresensiStaff().size(); j++) {
                    if (inisialisasi.getArrListKaryawan().get(i).getListPresensiStaff().get(j).getStatus() == Interface.HADIR) {
                        unit++;
                    }
                }
                gaji = (float) unit / 22 * (float) inisialisasi.getArrListKaryawan().get(i).getSalary();
            }
        }

        if (foundKaryawan) {
            JOptionPane.showMessageDialog(null, txt + " memiliki gaji sebesar Rp" + gaji);
            return;
        }

        for (int i = 0; i < inisialisasi.getArrListDosenTetap().size(); i++) {
            if (_nik == (inisialisasi.getArrListDosenTetap().get(i).getNIK())) {
                foundDosenTetap = true;
                txt += "; Nama = " + inisialisasi.getArrListDosenTetap().get(i).getNama() + " sebagai dosen tetap";
                for (int j = 0; j < inisialisasi.getArrListDosenTetap().get(i).getMataKuliahAjar().size(); j++) {
                    for (int k = 0; k < inisialisasi.getArrListDosenTetap().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().size(); k++) {
                        if (inisialisasi.getArrListDosenTetap().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().get(j).getStatus() == Interface.HADIR) {
                            unit++;
                        }
                    }
                }
                gaji = inisialisasi.getArrListDosenTetap().get(i).getSalary() + (unit * 2500);
            }
        }

        if (foundDosenTetap) {
            JOptionPane.showMessageDialog(null, txt + " memiliki gaji sebesar Rp" + gaji);
            return;
        }

        for (int i = 0; i < inisialisasi.getArrListDosenHonorer().size(); i++) {
            if (_nik == inisialisasi.getArrListDosenHonorer().get(i).getNIK()) {
                foundDosenHonorer = true;
                txt += "; Nama = " + inisialisasi.getArrListDosenTetap().get(i).getNama() + " sebagai dosen honorer";
                for (int j = 0; j < inisialisasi.getArrListDosenHonorer().get(i).getMataKuliahAjar().size(); j++) {
                    for (int k = 0; k < inisialisasi.getArrListDosenHonorer().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().size(); k++) {
                        if (inisialisasi.getArrListDosenHonorer().get(i).getMataKuliahAjar().get(j).getListPresensiStaff().get(j).getStatus() == Interface.HADIR) {
                            unit++;
                        }
                    }
                }
                gaji = unit * inisialisasi.getArrListDosenHonorer().get(i).getHonorPerSKS();
            }
        }

        if (foundDosenHonorer) {
            JOptionPane.showMessageDialog(null, txt + " Memiliki gaji sebesar Rp" + gaji);
        } else if (!foundKaryawan && !foundDosenTetap && !foundDosenHonorer) {
            JOptionPane.showMessageDialog(null, "NIK yang dimasukkan salah!");
        }

    }

}

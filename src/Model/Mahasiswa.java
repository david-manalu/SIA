package Model;

abstract class Mahasiswa extends User {
    private int NIM;
    private String jurusan;

    public Mahasiswa(int NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM=" + NIM + "\nJurusan=" + jurusan;
    }


}

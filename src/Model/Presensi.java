package Model;

public class Presensi {
    private String tanggal;
    private int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        if (this.status == Interface.HADIR) {
            return "Hadir";
        }
        return "Alpha";
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nPresensi{" + "tanggal=" + tanggal + ", status=" + status + '}';
    }
}

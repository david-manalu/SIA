package Model;

public class MatkulPilihan extends MataKuliah {
    private int minMhs;

    public MatkulPilihan() {
    }


    public MatkulPilihan(int minMhs, String kode, int SKS, String nama) {
        super(kode, SKS, nama);
        this.minMhs = minMhs;
    }

    public int getMinMhs() {
        return minMhs;
    }

    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }

    @Override
    public String toString() {
        return "MatkulPilihan{" + "minMhs=" + minMhs + ", " + super.toString() + '}';
    }


}

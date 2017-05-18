package El_KTP;

import El_KTP.Kelurahan.data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 *
 * @author nurudinhasbullah
 */
public class Kelurahan {

    ArrayList<data> data1;

    public Kelurahan() {
        data1 = new ArrayList<>();
    }

    public void isiData(String nama, String tmpL, String tglL, String jenKel, String golDar, String rt, String desa, String agama, String statusK, String kerja, String negara, String msLaku) {
        data1.add(new data(nama, tmpL, tglL, jenKel, golDar, rt, desa, agama, statusK, kerja, negara, msLaku));
    }

    public void show() {
        data1.forEach((data) -> {
            System.out.println(data.nama + " | " + data.tmpL + " | " + data.tglL + " | " + data.jenKel + " | " + data.golDar + " | " + data.rt + " | " + data.desa + " | " + data.agama + " | " + data.statusK + " | " + data.kerja + " | " + data.negara + " | " + data.msLaku);
        });
    }

    public static void main(String[] args) {
        Kelurahan kel = new Kelurahan();
        kel.isiData("Nurudin  ", "Ponorogo", "16/03/1998", "Laki-Laki", "AB", "RT01", "Sendang", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup");
        kel.isiData("Muhammad ", "Ponorogo", "06/03/1998", "Laki-Laki", "B ", "RT01", "Sendang", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup");
        kel.isiData("Hasbullah", "Ponorogo", "16/12/1998", "Laki-Laki", "AB", "RT01", "Sendang", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup");
        kel.isiData("Paijo    ", "Ponorogo", "16/08/1994", "Laki-Laki", "A ", "RT01", "Sendang", "Islam", "Kawin", "Swasta", "WNI", "Seumur Hidup");
        kel.show();
        HashMap<String, ArrayList<Kelurahan>> rt = new HashMap<>();
        ArrayList<Kelurahan> ad = new ArrayList<>();
        rt.put("RT01", ad);
        rt.forEach((String key, ArrayList<Kelurahan> Kelurahan) -> {
            System.out.println(key+" "+Kelurahan.size());
        });
    }

    class data {

        String nama, tmpL, tglL, jenKel, golDar, rt, desa, agama, statusK, kerja, negara, msLaku;

        public data(String nama, String tmpL, String tglL, String jenKel, String golDar, String rt, String desa, String agama, String statusK, String kerja, String negara, String msLaku) {
            setNama(nama);
            setTmpL(tmpL);
            setTglL(tglL);
            setJenKel(jenKel);
            setGolDar(golDar);
            setRt(rt);
            setDesa(desa);
            setAgama(agama);
            setStatusK(statusK);
            setKerja(kerja);
            setNegara(negara);
            setMsLaku(msLaku);
        }

        private void setNama(String nama) {
            this.nama = nama;
        }

        private void setTmpL(String tmpL) {
            this.tmpL = tmpL;
        }

        private void setTglL(String tglL) {
            this.tglL = tglL;
        }

        private void setJenKel(String jenKel) {
            this.jenKel = jenKel;
        }

        private void setGolDar(String golDar) {
            this.golDar = golDar;
        }

        private void setRt(String rt) {
            this.rt = rt;
        }

        private void setDesa(String desa) {
            this.desa = desa;
        }

        private void setAgama(String agama) {
            this.agama = agama;
        }

        private void setStatusK(String statusK) {
            this.statusK = statusK;
        }

        private void setKerja(String kerja) {
            this.kerja = kerja;
        }

        private void setNegara(String negara) {
            this.negara = negara;
        }

        private void setMsLaku(String msLaku) {
            this.msLaku = msLaku;
        }

        private String getNama() {
            return nama;
        }

        private String getTmpL() {
            return tmpL;
        }

        private String getTglL() {
            return tglL;
        }

        private String getJenKel() {
            return jenKel;
        }

        private String getGolDar() {
            return golDar;
        }

        private String getRt() {
            return rt;
        }

        private String getDesa() {
            return desa;
        }

        private String getAgama() {
            return agama;
        }

        private String getStatusK() {
            return statusK;
        }

        private String getKerja() {
            return kerja;
        }

        private String getNegara() {
            return negara;
        }

        private String getMsLaku() {
            return msLaku;
        }
    }

}

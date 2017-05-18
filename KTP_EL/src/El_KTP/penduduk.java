/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package El_KTP;

import java.util.ArrayList;
//import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author nurudinhasbullah
 */
public class penduduk {

    
    public static void main(String[] args) {
        ArrayList<HashMap<String, data>> data1 = new ArrayList<>();
        HashMap<String, data> rt1 = new HashMap<>();
        rt1.put("201611", new data("NurudinH ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201612", new data("Hasbullah", "Frozenland", "16/03/1998", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201613", new data("Johanes  ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201614", new data("Mulyadi  ", "Frozenland", "16/03/1998", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201614", new data("Paijo    ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201615", new data("Paiman   ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201616", new data("Pardi S  ", "Frozenland", "16/03/1998", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201617", new data("Susi     ", "Frozenland", "16/03/1998", "Perempuan", "O ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201618", new data("Purwati  ", "Frozenland", "16/03/1998", "Perempuan", "A ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201619", new data("Megawati ", "Frozenland", "16/03/1998", "Perempuan", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201620", new data("Astuti   ", "Frozenland", "16/03/1998", "Perempuan", "O ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        data1.add(rt1);
        
        //RT02
        
HashMap<String, El_KTP.data> rt2 = new HashMap<>();
        rt2.put("202611", new El_KTP.data("NurudinH ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202612", new El_KTP.data("Hasbullah", "Frozenland", "16/03/1998", "Laki-Laki", "B ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202613", new El_KTP.data("Johanes  ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202614", new El_KTP.data("Mulyadi  ", "Frozenland", "16/03/1998", "Laki-Laki", "B ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202614", new El_KTP.data("Paijo    ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202615", new El_KTP.data("Paiman   ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202616", new El_KTP.data("Pardi S  ", "Frozenland", "16/03/1998", "Laki-Laki", "B ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202617", new El_KTP.data("Susi     ", "Frozenland", "16/03/1998", "Perempuan", "O ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202618", new El_KTP.data("Purwati  ", "Frozenland", "16/03/1998", "Perempuan", "A ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202619", new El_KTP.data("Megawati ", "Frozenland", "16/03/1998", "Perempuan", "B ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202620", new El_KTP.data("Astuti   ", "Frozenland", "16/03/1998", "Perempuan", "O ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        data1.add(rt2);
        
        System.out.println("Data Penduduk Desa Konoha RT 01 :");
        System.out.println("Data 1 :" +data1.get(0).get("201611").nama +" " +data1.get(0).get("201611").tmpL+" " +data1.get(0).get("201611").tglL+" " +data1.get(0).get("201611").jenKel+" " +data1.get(0).get("201611").golDar+" " +data1.get(0).get("201611").rt+" " +data1.get(0).get("201611").desa+" " +data1.get(0).get("201611").agama+" " +data1.get(0).get("201611").statusK+" " +data1.get(0).get("201611").kerja+" " +data1.get(0).get("201611").negara+" " +data1.get(0).get("201611").msLaku );
        System.out.println("Data 2 :" +data1.get(0).get("201612").nama +" " +data1.get(0).get("201612").tmpL+" " +data1.get(0).get("201612").tglL+" " +data1.get(0).get("201612").jenKel+" " +data1.get(0).get("201612").golDar+" " +data1.get(0).get("201612").rt+" " +data1.get(0).get("201612").desa+" " +data1.get(0).get("201612").agama+" " +data1.get(0).get("201612").statusK+" " +data1.get(0).get("201612").kerja+" " +data1.get(0).get("201612").negara+" " +data1.get(0).get("201612").msLaku );
        System.out.println("Data 3 :" +data1.get(0).get("201613").nama +" " +data1.get(0).get("201611").tmpL+" " +data1.get(0).get("201611").tglL+" " +data1.get(0).get("201611").jenKel+" " +data1.get(0).get("201611").golDar+" " +data1.get(0).get("201611").rt+" " +data1.get(0).get("201611").desa+" " +data1.get(0).get("201611").agama+" " +data1.get(0).get("201611").statusK+" " +data1.get(0).get("201611").kerja+" " +data1.get(0).get("201611").negara+" " +data1.get(0).get("201611").msLaku );
        System.out.println("Data 4 :" +data1.get(0).get("201614").nama +" " +data1.get(0).get("201612").tmpL+" " +data1.get(0).get("201612").tglL+" " +data1.get(0).get("201612").jenKel+" " +data1.get(0).get("201612").golDar+" " +data1.get(0).get("201612").rt+" " +data1.get(0).get("201612").desa+" " +data1.get(0).get("201612").agama+" " +data1.get(0).get("201612").statusK+" " +data1.get(0).get("201612").kerja+" " +data1.get(0).get("201612").negara+" " +data1.get(0).get("201612").msLaku );
        System.out.println("Data 5 :" +data1.get(0).get("201615").nama +" " +data1.get(0).get("201611").tmpL+" " +data1.get(0).get("201611").tglL+" " +data1.get(0).get("201611").jenKel+" " +data1.get(0).get("201611").golDar+" " +data1.get(0).get("201611").rt+" " +data1.get(0).get("201611").desa+" " +data1.get(0).get("201611").agama+" " +data1.get(0).get("201611").statusK+" " +data1.get(0).get("201611").kerja+" " +data1.get(0).get("201611").negara+" " +data1.get(0).get("201611").msLaku );
        System.out.println("Data 6 :" +data1.get(0).get("201616").nama +" " +data1.get(0).get("201612").tmpL+" " +data1.get(0).get("201612").tglL+" " +data1.get(0).get("201612").jenKel+" " +data1.get(0).get("201612").golDar+" " +data1.get(0).get("201612").rt+" " +data1.get(0).get("201612").desa+" " +data1.get(0).get("201612").agama+" " +data1.get(0).get("201612").statusK+" " +data1.get(0).get("201612").kerja+" " +data1.get(0).get("201612").negara+" " +data1.get(0).get("201612").msLaku );
        System.out.println("Data 7 :" +data1.get(0).get("201617").nama +" " +data1.get(0).get("201611").tmpL+" " +data1.get(0).get("201611").tglL+" " +data1.get(0).get("201611").jenKel+" " +data1.get(0).get("201611").golDar+" " +data1.get(0).get("201611").rt+" " +data1.get(0).get("201611").desa+" " +data1.get(0).get("201611").agama+" " +data1.get(0).get("201611").statusK+" " +data1.get(0).get("201611").kerja+" " +data1.get(0).get("201611").negara+" " +data1.get(0).get("201611").msLaku );
        System.out.println("Data 8 :" +data1.get(0).get("201618").nama +" " +data1.get(0).get("201612").tmpL+" " +data1.get(0).get("201612").tglL+" " +data1.get(0).get("201612").jenKel+" " +data1.get(0).get("201612").golDar+" " +data1.get(0).get("201612").rt+" " +data1.get(0).get("201612").desa+" " +data1.get(0).get("201612").agama+" " +data1.get(0).get("201612").statusK+" " +data1.get(0).get("201612").kerja+" " +data1.get(0).get("201612").negara+" " +data1.get(0).get("201612").msLaku );
        System.out.println("Data 9 :" +data1.get(0).get("201619").nama +" " +data1.get(0).get("201611").tmpL+" " +data1.get(0).get("201611").tglL+" " +data1.get(0).get("201611").jenKel+" " +data1.get(0).get("201611").golDar+" " +data1.get(0).get("201611").rt+" " +data1.get(0).get("201611").desa+" " +data1.get(0).get("201611").agama+" " +data1.get(0).get("201611").statusK+" " +data1.get(0).get("201611").kerja+" " +data1.get(0).get("201611").negara+" " +data1.get(0).get("201611").msLaku );
        System.out.println("Data 10:" +data1.get(0).get("201620").nama +" " +data1.get(0).get("201612").tmpL+" " +data1.get(0).get("201612").tglL+" " +data1.get(0).get("201612").jenKel+" " +data1.get(0).get("201612").golDar+" " +data1.get(0).get("201612").rt+" " +data1.get(0).get("201612").desa+" " +data1.get(0).get("201612").agama+" " +data1.get(0).get("201612").statusK+" " +data1.get(0).get("201612").kerja+" " +data1.get(0).get("201612").negara+" " +data1.get(0).get("201612").msLaku );
    
        
        System.out.println("Data Penduduk Desa Konoha RT 02 :");
        System.out.println("Data 1 :" +data1.get(1).get("202611").nama +" " +data1.get(1).get("202611").tmpL+" " +data1.get(1).get("202611").tglL+" " +data1.get(1).get("202611").jenKel+" " +data1.get(1).get("202611").golDar+" " +data1.get(1).get("202611").rt+" " +data1.get(1).get("202611").desa+" " +data1.get(1).get("202611").agama+" " +data1.get(1).get("202611").statusK+" " +data1.get(1).get("202611").kerja+" " +data1.get(1).get("202611").negara+" " +data1.get(1).get("202611").msLaku );
        System.out.println("Data 2 :" +data1.get(1).get("202612").nama +" " +data1.get(1).get("202612").tmpL+" " +data1.get(1).get("202612").tglL+" " +data1.get(1).get("202612").jenKel+" " +data1.get(1).get("202612").golDar+" " +data1.get(1).get("202612").rt+" " +data1.get(1).get("202612").desa+" " +data1.get(1).get("202612").agama+" " +data1.get(1).get("202612").statusK+" " +data1.get(1).get("202612").kerja+" " +data1.get(1).get("202612").negara+" " +data1.get(1).get("202612").msLaku );
        System.out.println("Data 3 :" +data1.get(1).get("202613").nama +" " +data1.get(1).get("202611").tmpL+" " +data1.get(1).get("202611").tglL+" " +data1.get(1).get("202611").jenKel+" " +data1.get(1).get("202611").golDar+" " +data1.get(1).get("202611").rt+" " +data1.get(1).get("202611").desa+" " +data1.get(1).get("202611").agama+" " +data1.get(1).get("202611").statusK+" " +data1.get(1).get("202611").kerja+" " +data1.get(1).get("202611").negara+" " +data1.get(1).get("202611").msLaku );
        System.out.println("Data 4 :" +data1.get(1).get("202614").nama +" " +data1.get(1).get("202612").tmpL+" " +data1.get(1).get("202612").tglL+" " +data1.get(1).get("202612").jenKel+" " +data1.get(1).get("202612").golDar+" " +data1.get(1).get("202612").rt+" " +data1.get(1).get("202612").desa+" " +data1.get(1).get("202612").agama+" " +data1.get(1).get("202612").statusK+" " +data1.get(1).get("202612").kerja+" " +data1.get(1).get("202612").negara+" " +data1.get(1).get("202612").msLaku );
        System.out.println("Data 5 :" +data1.get(1).get("202615").nama +" " +data1.get(1).get("202611").tmpL+" " +data1.get(1).get("202611").tglL+" " +data1.get(1).get("202611").jenKel+" " +data1.get(1).get("202611").golDar+" " +data1.get(1).get("202611").rt+" " +data1.get(1).get("202611").desa+" " +data1.get(1).get("202611").agama+" " +data1.get(1).get("202611").statusK+" " +data1.get(1).get("202611").kerja+" " +data1.get(1).get("202611").negara+" " +data1.get(1).get("202611").msLaku );
        System.out.println("Data 6 :" +data1.get(1).get("202616").nama +" " +data1.get(1).get("202612").tmpL+" " +data1.get(1).get("202612").tglL+" " +data1.get(1).get("202612").jenKel+" " +data1.get(1).get("202612").golDar+" " +data1.get(1).get("202612").rt+" " +data1.get(1).get("202612").desa+" " +data1.get(1).get("202612").agama+" " +data1.get(1).get("202612").statusK+" " +data1.get(1).get("202612").kerja+" " +data1.get(1).get("202612").negara+" " +data1.get(1).get("202612").msLaku );
        System.out.println("Data 7 :" +data1.get(1).get("202617").nama +" " +data1.get(1).get("202611").tmpL+" " +data1.get(1).get("202611").tglL+" " +data1.get(1).get("202611").jenKel+" " +data1.get(1).get("202611").golDar+" " +data1.get(1).get("202611").rt+" " +data1.get(1).get("202611").desa+" " +data1.get(1).get("202611").agama+" " +data1.get(1).get("202611").statusK+" " +data1.get(1).get("202611").kerja+" " +data1.get(1).get("202611").negara+" " +data1.get(1).get("202611").msLaku );
        System.out.println("Data 8 :" +data1.get(1).get("202618").nama +" " +data1.get(1).get("202612").tmpL+" " +data1.get(1).get("202612").tglL+" " +data1.get(1).get("202612").jenKel+" " +data1.get(1).get("202612").golDar+" " +data1.get(1).get("202612").rt+" " +data1.get(1).get("202612").desa+" " +data1.get(1).get("202612").agama+" " +data1.get(1).get("202612").statusK+" " +data1.get(1).get("202612").kerja+" " +data1.get(1).get("202612").negara+" " +data1.get(1).get("202612").msLaku );
        System.out.println("Data 9 :" +data1.get(1).get("202619").nama +" " +data1.get(1).get("202611").tmpL+" " +data1.get(1).get("202611").tglL+" " +data1.get(1).get("202611").jenKel+" " +data1.get(1).get("202611").golDar+" " +data1.get(1).get("202611").rt+" " +data1.get(1).get("202611").desa+" " +data1.get(1).get("202611").agama+" " +data1.get(1).get("202611").statusK+" " +data1.get(1).get("202611").kerja+" " +data1.get(1).get("202611").negara+" " +data1.get(1).get("202611").msLaku );
        System.out.println("Data 10:" +data1.get(1).get("202620").nama +" " +data1.get(1).get("202612").tmpL+" " +data1.get(1).get("202612").tglL+" " +data1.get(1).get("202612").jenKel+" " +data1.get(1).get("202612").golDar+" " +data1.get(1).get("202612").rt+" " +data1.get(1).get("202612").desa+" " +data1.get(1).get("202612").agama+" " +data1.get(1).get("202612").statusK+" " +data1.get(1).get("202612").kerja+" " +data1.get(1).get("202612").negara+" " +data1.get(1).get("202612").msLaku );
    
    }
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

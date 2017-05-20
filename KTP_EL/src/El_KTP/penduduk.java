/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package El_KTP;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author nurudinhasbullah
 */
public class penduduk {
   public static void main(String[] args) {
        ArrayList<HashMap<String, data>> data1 = new ArrayList<>();
        //DataPenduduk RT01
        HashMap<String, data> rt1 = new HashMap<>();
        rt1.put("201611", new data("Adi      ", "Frozenland", "16/03/1993", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt1.put("201612", new data("Samsul   ", "Frozenland", "11/11/1993", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt1.put("201613", new data("Johanes  ", "Frozenland", "12/12/1998", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt1.put("201614", new data("Mulyadi  ", "Frozenland", "15/07/1992", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt1.put("201614", new data("Paijo    ", "Frozenland", "12/08/1994", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt1.put("201615", new data("Paiman   ", "Frozenland", "19/04/1994", "Laki-Laki", "AB", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt1);
        
        //Data Penduduk RT02
        HashMap<String, El_KTP.data> rt2 = new HashMap<>();
        rt2.put("202611", new El_KTP.data("Muhammad ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202612", new El_KTP.data("Sudirman ", "Frozenland", "12/04/1991", "Laki-Laki", "B ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt2.put("202613", new El_KTP.data("Yolanda  ", "Frozenland", "18/05/1998", "Perempuan", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202614", new El_KTP.data("Meloadi  ", "Frozenland", "26/04/1995", "Perempuan", "B ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt2.put("202614", new El_KTP.data("Pairan   ", "Frozenland", "26/07/1998", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt2.put("202615", new El_KTP.data("Paimo    ", "Frozenland", "15/02/1989", "Laki-Laki", "AB", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt2);

        //Data Penduduk RT03
        HashMap<String, El_KTP.data> rt3 = new HashMap<>();
        rt3.put("203616", new data("Pardi S  ", "Frozenland", "16/08/1997", "Laki-Laki", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt3.put("203617", new data("Susi     ", "Frozenland", "12/02/1992", "Perempuan", "O ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt3.put("203618", new data("Purwati  ", "Frozenland", "18/01/1996", "Perempuan", "A ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt3.put("203619", new data("Megawati ", "Frozenland", "14/05/1998", "Perempuan", "B ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt3.put("203620", new data("Astuti   ", "Frozenland", "15/01/1993", "Perempuan", "O ", "RT01", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt3);

        //Data Penduduk RT04
        HashMap<String, El_KTP.data> rt4 = new HashMap<>();
        rt4.put("204616", new El_KTP.data("Sumanto  ", "Frozenland", "26/08/1998", "Laki-Laki", "B ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt4.put("204617", new El_KTP.data("Mulyaning", "Frozenland", "27/01/1996", "Perempuan", "O ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt4.put("204618", new El_KTP.data("Mesmi    ", "Frozenland", "12/09/1995", "Perempuan", "A ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt4.put("204619", new El_KTP.data("Yuli     ", "Frozenland", "17/02/1997", "Perempuan", "B ", "RT02", "Ds. Konoha", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt4.put("204620", new El_KTP.data("Sisi     ", "Frozenland", "11/05/1992", "Perempuan", "O ", "RT02", "Ds. Konoha", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt4);
}
}
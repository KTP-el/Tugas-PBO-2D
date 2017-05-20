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
        
       //Data Penduduk RT01
        HashMap<String, data> rt11 = new HashMap<>();
        rt11.put("201611", new data("Slamet   ", "Frozenland", "16/03/1993", "Laki-Laki", "AB", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt11.put("201612", new data("Pandu    ", "Frozenland", "11/11/1993", "Laki-Laki", "B ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt11.put("201613", new data("Jatmiko  ", "Frozenland", "12/12/1998", "Laki-Laki", "AB", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt11.put("201614", new data("Mingun   ", "Frozenland", "15/07/1992", "Laki-Laki", "B ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt11.put("201614", new data("Wiro S   ", "Frozenland", "12/08/1994", "Laki-Laki", "AB", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Guru     ", "WNI", "Seumur Hidup"));
        rt11.put("201615", new data("Bima     ", "Frozenland", "19/04/1994", "Laki-Laki", "AB", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt11);
        
        //Data Penduduk RT02
        HashMap<String, El_KTP.data> rt22 = new HashMap<>();
        rt22.put("202611", new El_KTP.data("Misran   ", "Frozenland", "16/03/1998", "Laki-Laki", "AB", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt22.put("202612", new El_KTP.data("Parmon   ", "Frozenland", "12/04/1991", "Laki-Laki", "B ", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt22.put("202613", new El_KTP.data("Aisyah   ", "Frozenland", "18/05/1998", "Perempuan", "AB", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt22.put("202614", new El_KTP.data("Sudirman ", "Frozenland", "26/04/1995", "Perempuan", "B ", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt22.put("202614", new El_KTP.data("Agung    ", "Frozenland", "26/07/1998", "Laki-Laki", "AB", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt22.put("202615", new El_KTP.data("Marijan  ", "Frozenland", "15/02/1989", "Laki-Laki", "AB", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt22);

        //Data Penduduk RT03
        HashMap<String, El_KTP.data> rt33 = new HashMap<>();
        rt33.put("203616", new data("Juadi    ", "Frozenland", "16/08/1997", "Laki-Laki", "B ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt33.put("203617", new data("Irma     ", "Frozenland", "12/02/1992", "Perempuan", "O ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt33.put("203618", new data("Rani     ", "Frozenland", "18/01/1996", "Perempuan", "A ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt33.put("203619", new data("Jami     ", "Frozenland", "14/05/1998", "Perempuan", "B ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt33.put("203620", new data("Wahyu    ", "Frozenland", "15/01/1993", "Perempuan", "O ", "RT01", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt33);

        //Data Penduduk RT04
        HashMap<String, El_KTP.data> rt44 = new HashMap<>();
        rt44.put("204616", new El_KTP.data("Tarno    ", "Frozenland", "26/08/1998", "Laki-Laki", "B ", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Mahasiswa", "WNI", "Seumur Hidup"));
        rt44.put("204617", new El_KTP.data("Sumi     ", "Frozenland", "27/01/1996", "Perempuan", "O ", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt44.put("204618", new El_KTP.data("Isna     ", "Frozenland", "12/09/1995", "Perempuan", "A ", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        rt44.put("204619", new El_KTP.data("Tutik    ", "Frozenland", "17/02/1997", "Perempuan", "B ", "RT02", "Ds. Mayumi", "Islam", "Belum Kawin", "Swasta   ", "WNI", "Seumur Hidup"));
        rt44.put("204620", new El_KTP.data("Yani     ", "Frozenland", "11/05/1992", "Perempuan", "O ", "RT02", "Ds. Mayumi", "Islam", "Kawin      ", "Swasta   ", "WNI", "Seumur Hidup"));
        data1.add(rt44);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.deklarasivariabel;

/**
 *
 * @author
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 * Deskripsi Program : Program ini berisi program untuk 
 * menampilkan nilai variabel
 */
public class Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi Variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke Variabel
        nilaiInt = 8;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menamplkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }

}

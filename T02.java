// 12S224003 - Michael Nasution
// 12S24045 - MUtiara Sianturi
 
 import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jUDUL, pENULIS, pENERBIT, formatBuku, rate;
        int tahunTerbit, stokBuku;
        double hargaPembelian, minMargin, rating;

        iSBN = input.nextLine();
        jUDUL = input.nextLine();
        pENULIS = input.nextLine();
        tahunTerbit = Integer.parseInt(input.nextLine());
        pENERBIT = input.nextLine();
        formatBuku = input.nextLine();
        hargaPembelian = Double.parseDouble(input.nextLine());
        minMargin = Double.parseDouble(input.nextLine());
        stokBuku = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7 && rating <= 5) {
            rate = "Best Pick";
        } else {
            if (rating >= 4.5) {
                rate = "Must Read";
            } else {
                if (rating >= 4.0) {
                    rate = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        rate = "Average";
                    } else {
                        if (rating < 3) {
                            rate = "Low";
                        } else {
                            rate = "";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tahunTerbit + "|" + pENERBIT + "|" + formatBuku + "|" + toFixed(hargaPembelian,2) + "|" + toFixed(minMargin,2) + "|" + stokBuku + "|" + toFixed(rating,2) + "|" + rate);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

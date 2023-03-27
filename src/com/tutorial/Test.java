package com.tutorial;

import java.io.*;

class luasLingkaran_menggunakan_BufferedReader {
    static final double phi = 3.14;

    public static void Test(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int r;
        System.out.print("Masukkan jari-jari lingkaran : ");
        try {
            r = Integer.parseInt(x.readLine());
        } catch (Exception e) {
            r = 7;
        }
        double luas = phi * r * r;
        System.out.println("Luas Lingkaran : " + luas);
        System.exit(0);
    }
}

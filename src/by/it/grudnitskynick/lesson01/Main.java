package by.it.grudnitskynick.lesson01;

public class Main {
    public static void main(String[] args) {
        for (byte i = -128;  ; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length()>8) binary=binary.substring(binary.length()-8);
            binary = String.format("%8s", binary).replace(" ", "0");

            String octal = Integer.toOctalString(i);
            if (octal.length()>3) octal=octal.substring(octal.length()-3);
            octal = String.format("%3s", octal).replace(" ", "0");

            String hex = Integer.toHexString(i);
            if (hex.length()>2) hex=hex.substring(hex.length()-2);
            hex = String.format("%2s", hex).replace(" ", "0");

            System.out.printf("%8s %3s %2s %4d %n", binary, octal, hex, i);
            if (i==127) break;
        }
    }
}

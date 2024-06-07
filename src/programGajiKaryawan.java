import java.util.Scanner;
public class programGajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Array untuk menyimpan gaji pokok setiap golongan
        double[] gaji = {5000000, 6500000, 9500000};

        double [] lembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        System.out.println("====================================");
        System.out.println("PROGRAM JAVA");
        System.out.println("PERHITUNGAN GAJI KARYAWAN");
        System.out.println("====================================");

        
        System.out.println("Masukkan Golongan (A/B/C): ");
        char golongan = input.next().toUpperCase().charAt(0);

        double gajiPokok = 0;

        //Validasi golongan dan set gajiPokok
        boolean golonganValid = true;
        if(golongan == 'A') {
            gajiPokok = gaji[0];
        } else if (golongan == 'B') {
            gajiPokok = gaji [1];
        }else if (golongan == 'C') {
            gajiPokok = gaji[2];
        } else {
            golonganValid = false;
            System.out.println(">>>>>>>GOLONGAN TIDAK VALID<<<<<<<<");
            System.out.println("Mohon Inputkan Golongan yang Sesuai");
        }

        if (golonganValid) {
            System.out.println("Masukan Jam Lembur : ");
            int jamLembur = input.nextInt();

            double gajiLembur = 0;

            //Menghitung gaji lembur berdasarkan jam lembur
            if (jamLembur == 0) {
                gajiLembur = gajiPokok * 0;
            } else if (jamLembur > 0 && jamLembur <= 5) {
                gajiLembur = gajiPokok * lembur[jamLembur - 1];
            } else if (jamLembur > 5) {
                gajiLembur = gajiPokok * lembur[4]; //untuk jam lembur 5 jam atau lebih
            }else if (jamLembur < 0) {
                System.out.println(">>>>>>>JAM LEMBUR TIDAK VALID<<<<<<<<");
                System.out.println("Mohon Inputkan Jam Lembur yang Sesuai");
            }

            //Menghitung total penghasilan 
            double totalPenghasilan = gajiPokok + gajiLembur;
            System.out.println("Total Penghasilan Rp." + totalPenghasilan);
        }
        input.close();
        System.out.println("====================================");
    }
}


public class TernaryOprator {
        public static void main(String[] args) {

                //Menggunakan if else
                
                var nilai = 70;
                String ucapan;

                if (nilai >= 75){
                        ucapan = "Selamat Anda Lulus";
                }else{
                        ucapan = "Silahkan Coba lagi";
                }

                System.out.println(ucapan);

                //Menggunakan Ternary Operator

                var value = 75;
                String kalimat = value >= 75 ? "Selamat Anda Lulus" : "silahkan coba lagi";
                System.out.println(kalimat);
        }
}

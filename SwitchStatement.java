
public class SwitchStatement {
        public static void main(String[] args) {
                
                var nilai = "H";

                switch (nilai) {
                        case "A":
                        System.out.println("Anda Lulus Dengan baik");
                                break;
                        case "B":
                        case "C": 
                        System.out.println("Nilai Anda aCukup Baik");
                        break;
                        case "D":
                        System.out.println("Anda Tidak Lulus");
                        break;
                        default:
                        System.out.println("Mungkin Anda salah Jurusan");
                }

                //Kode : Switch Lambda

                switch (nilai) {
                        case "A" -> System.out.println("Wow, Anda lulus dengan baik");
                        case "B","C"  -> System.out.println("Niali anda cukup baik");
                        case "D" -> System.out.println("Anda Tidak lulus");
                        default -> {
                                System.out.println("Mungkin anda salah jurusan");
                        }
                
                }

                //Kode : Switch TANPA yield

                String ucapan;
                switch (nilai) {
                        case "A" -> ucapan = "Anda lulus dengan baik";
                        case "B", "C" -> ucapan = "Nilai anda cukup baik";
                        case "D" -> ucapan = "Anda tidak lulus";
                        default -> {
                                ucapan = ("Mungkin anda slah jurusa");
                        }
                }    
                  System.out.println(ucapan);     


                  //Kode : switch DENGAN Yield

                  ucapan = switch (nilai){
                        case "A":
                        yield "Anda lulus Dengan baik";
                        case "B", "C":
                        yield "Nilai anda cukup Baik";
                        case "D" : 
                        yield "Anda Tidak lulus";
                        default:
                        yield "Mungkin anda salah jurusan";
                  };

                  System.out.println(ucapan);
        }
        
}

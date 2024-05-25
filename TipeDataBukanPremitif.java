public class TipeDataBukanPremitif {
        public static void main(String[] args) {

                //Tipe data peremitif
                Integer iniInteger = 100;
                Long iniLong = 10000L;

                Byte iniByte = null;

                System.out.println(iniByte);

                iniByte = 100;

                System.out.println(iniByte);

                int iniInt = 100;

                //Tipe data yang bukan premitif

                Integer iniInteger2 = iniInt;

                System.out.println(iniInteger2);

                //Kode : Konversi Dari Tipe Primitif

                int age = 30; // tipe data primitif
                
                Integer ageObject = age; // di ubah menjadi tipe data bukan primitif atu menjadi objek

                int ageAgain = ageObject; // di ubah menjadi data primitif lagi 

                short shortAge = ageObject.shortValue(); // merubah tipe data menjadi short
                byte byteAge = ageObject.byteValue(); 

                

        }
        
}

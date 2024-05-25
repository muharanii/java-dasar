public class KonversiNumber {
        public static void main(String[] args) {
                
        //Konversi Tipe data number
        //Widening Casting(otomatis) : byte->short->int->long->float->double 
        //Narrowing Casating(Manual):double->float->long->int->char->short->byte


        byte iniByte= 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println(iniInt);
        System.out.println(iniByte2);

        
        }
}

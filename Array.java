public class Array {
        public static void main(String[] args) {

        // Kode membuat Array 

           String[] stringArray;
           stringArray = new String[3];

           stringArray[0] = "Ira";
           stringArray[1] = "Muharani";
           stringArray[2] = "Ira Muhrani";

           System.out.println(stringArray[0]);
           System.out.println(stringArray[1]);
           System.out.println(stringArray[2]);

           stringArray[0] = "Bunga"; // merubah value index 0 

           System.out.println(stringArray[0]);

           String[] stringArray2 = new String [3];

           //Kode : Array Initializer

           String[] namaNama = {
                "Ira", "Rania", "Rani", "Muharani"
           };

           namaNama [0] = null;

           System.out.println(namaNama[0]);

           int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
           };

           System.out.println(arrayInt[0]);

           long[] arrayLong = {
                10L, 20L, 30L,
           };

           //Kode : Operasi di Array 

           arrayLong [0] = 0;
           System.out.println(arrayLong[0]);
           System.out.println(arrayLong.length);
           

           //kode: Array di dalam array

           String[][] members = {
                {"Ira", "Muharani", "Rania"},
                {"Ade", "Nugraha"},
                {"Satrio", "Nugraha"},
           };

           //String[] member1 = members[0];
           //System.out.println(member1[0]);

           System.out.println(members[0][0]);
           System.out.println(members[0][1]);
           System.out.println(members[0][2]);

           System.out.println(members[1][0]);
           System.out.println(members[1][1]);

           System.out.println(members[2][0]);
           System.out.println(members[2][1]);

        }
        
}

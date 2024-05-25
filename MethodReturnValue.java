
public class MethodReturnValue {
        public static void main(String[] args) {
                var a = 10;
                var b = 12;
                var c = sum(a,b);

                System.out.println(c);

                var result = sum (500, 900);
                System.out.println(result);

                System.out.println(hitung (100, "-", 500));
                System.out.println(hitung(100, "+", 800));
                System.out.println(hitung(100, "salah", 800));
                
        }

        static int sum(int value1, int value2){
                var total = value1 + value2;
                return total;
        }

        static int hitung(int nilai1, String operasi, int nilai2){
                switch (operasi) {
                        case "+":
                                return nilai1 + nilai2;

                        case "-":
                                return nilai1 + nilai2;
                
                        default:
                                return 0;
                }
        }
}

public class RecrusiveMethod {
        public static void main(String[] args) {
                System.out.println(factorialLoop(5));
                System.out.println(1*2*3*4*5);

                System.out.println(factorialLoop(5));

                loop(15000);
                
        }

        //Factorial Loop
        static int factorialLoop(int value){
                var result = 1;

                for (var counter = 1; counter <= value; counter++){
                        result *= counter;
                }
                
                return result;
        }

        //Factorial Recrusive 
        static int factorialRecrusive(int value){
                if (value == 1){
                        return 1;
                }else {
                        return value * factorialRecrusive(value-1);
                }
        }

        static void loop(int value){
                if(value == 0){
                        System.out.println("Selesai ");
                }else {
                        System.out.println("Loop "+value);
                        loop(value-1);
                }
        }


        
}
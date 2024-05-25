public class MethodVariableArgument {
        public static void main(String[] args) {
                int[] values = {80,85, 80, 80, 90};
                sayCongrats("Ira", values);


                ucapan("Muharani", 70, 70, 70, 75, 65);

        }

        // Kode : Tanpa Variable Argument
        static void sayCongrats(String name, int[] values){
                var total = 0;

                for (var value : values){
                        total += value;
                }

                var finalValue = total / values.length;

                if (finalValue >= 75){
                        System.out.println("Selamat " + name + ", Anda Lulus");
                }else{
                        System.out.println("Maaf " + name + ", anda tidak lulus");
                }
        }

        //Kode : Dengan variable Argumet
        static void ucapan( String name, int... values){
                var total = 0;

                for (var value : values){
                        total += value;
                }
                var finalValue = total/ values.length;

                if (finalValue >= 75){
                        System.out.println("Selamat " + name + ", Anda Lulus");
                }else{
                        System.out.println("Maaf " + name + ", anda tidak lulus");
                }
        }

}

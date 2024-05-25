public class MethodOverloading {
        public static void main(String[] args) {
                sayHello();
                sayHello("Muharani");
                sayHello("Ira", "Muharani");
                
        }

        static void sayHello(){
                System.out.println("Hello Muharani");
        }

        static void sayHello(String lastName){
                System.out.println("Hello" + " " + lastName);
        }

        static void sayHello(String firstName, String lastName){
                System.out.println(firstName + " " + lastName);
        }
}

public class forEach {
        public static void main(String[] args) {

                //Kode: Tanpa For Each

                String[] arrayName ={
                        "Ira","Muharani","Rani",
                        "Pemrograman", "Java", "Belajar" 
                };
                           

        for (var i = 0; i < arrayName.length; i++){
                System.out.println(arrayName[i]);
        }

        //Kode:For Each
        for(var value : arrayName){
                System.out.println(value);
        }

        }
}

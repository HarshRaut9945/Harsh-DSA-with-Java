class LargeString{
    public static void main(String[] args) {

        String fruit[]={"apple","mango","banana","ziraf"};
        String Largest=fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(Largest.compareTo(fruit[i])< 0){
                 Largest=fruit[i];
            }     
        }
        System.out.println(Largest);

            }
}

class A{
    public static void main(String[] args){
        
        String text = "Java";

       System.out.println(text.substring(1));
      
      //StringIndexOutOfBoundsException
     // System.out.println(text.substring(-1));

        //StringIndexOutOfBoundsException
        //System.out.println(text.substring(5));

         //Java
        System.out.println(text.substring(0, 4));

         //ava
        System.out.println(text.substring(1, 4));

         //Jav
        System.out.println(text.substring(0, 3));

         //StringIndexOutOfBoundsException
        //System.out.println(text.substring(0, 5));

         //StringIndexOutOfBoundsException
        //System.out.println(text.substring(-1, 4));

    }
}
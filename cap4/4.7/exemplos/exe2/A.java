
class A{
    public static void main(String[] args){
       
       String s = "caelum";
        s.toUpperCase();
       System.out.println(s);

       String s2 = s.toUpperCase();
        System.out.println(s2);

        s = s.toUpperCase();
        System.out.println(s);

        System.out.println("-----------");

        char caracter0 = "guilherme".charAt(0);
        System.out.println(caracter0);
        
        char caracter1 = "guilherme".charAt(1);
        System.out.println(caracter1);

        char caracter2 = "guilherme".charAt(2);
        System.out.println(caracter2);

        /*char caracter2 = "guilherme".charAt(20); Exception
        System.out.println(caracter2);

        char caracter2 = "guilherme".charAt(-1); Exception
        System.out.println(caracter2);*/

    }
}
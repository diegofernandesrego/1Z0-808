
class A{
    public static void main(String[] args){
        
        String text = "Pretendo fazer a prova de certificação de Java";

       System.out.println(text.indexOf("Pretendo"));
       System.out.println(text.indexOf("Pretendia"));
       System.out.println(text.indexOf("tendo"));
      
      System.out.println("------------");
      System.out.println(text.indexOf("a"));
      System.out.println(text.lastIndexOf("a"));
        System.out.println(text.lastIndexOf("Pretendia"));

        System.out.println("------------");
        System.out.println(text.startsWith("Pretendo"));
        System.out.println(text.startsWith("Pretendia"));

         System.out.println("------------");
          System.out.println(text.endsWith("Java"));
          System.out.println(text.endsWith("Oracle"));

    }
}
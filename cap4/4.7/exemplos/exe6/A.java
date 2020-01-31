
class A{
    public static void main(String[] args){
        
        String text = "Certification";

       System.out.println(text.equals("Certification"));
       System.out.println(text.equals("certification"));
       System.out.println(text.equalsIgnoreCase("CertifIcatiOn"));

        System.out.println(text.compareTo("Aim"));
        System.out.println(text.compareTo("Certification"));
        System.out.println(text.compareTo("Guilherme"));
         System.out.println(text.compareTo("certification"));
          System.out.println(text.compareToIgnoreCase("certification"));
      

    }
}
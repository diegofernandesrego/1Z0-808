
class A{
    public static void main(String[] args){
       StringBuffer sb = new StringBuffer(20);
       sb.append("Caelum - inovação")
       .insert(9, "Ensino e ");

       System.out.println(sb);
       System.out.println("========");


       StringBuffer sb1 = new StringBuffer();
       sb1.append("Caelum - Ensino e Inovação");
       sb1.delete(6, 15);
       System.out.println(sb1);


    }
}
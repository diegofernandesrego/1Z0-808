
class A{
    public static void main(String[] args){
       
       char[] name = new char[]{'j', 'a', 'v', 'a'};
       String fromArray = new String(name);

       System.out.println(fromArray);

       String nulled = null;
       System.out.println("value: " + nulled);

       String name2 = "Java" + ' ' + "Certification" + ' ' + 1500;
       System.out.println(name2);
        
    }
}
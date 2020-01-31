
class A{

    public static void main(String[] args){
        int age;
        if(args.length > 0){
            age = Integer.parseInt(args[0]);
        }else{
            System.out.println("???");
        }
    }

}
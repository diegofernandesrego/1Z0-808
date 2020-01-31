class B{
    void x(int... x){
        System.out.println(x.length);
    }
}
class A{
    public static void main(String[] args){
        new B().x(23789,673482);
    }
}
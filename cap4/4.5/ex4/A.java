class B{
    void x(Object... x){
        System.out.println(x.length);
    }
}

class A{
    public static void main(String[] args){
        new B().x(new Object[]{23789,673482});
    }
}
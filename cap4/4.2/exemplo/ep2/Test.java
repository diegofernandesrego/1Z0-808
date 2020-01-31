class Test{

    public static void main(String[] args){
        Car a = new Car();
        Car b = a;

        a.age = 5;

        System.out.println(b.age);
    }
}
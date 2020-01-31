class A{
    public static void main(String[] args){
        boolean argis;
        if(args.length > 0)
            argis = 1;
        else
            argis = 0;
        System.out.println(argis);
    }
}

//Não compila pois boolean em java  só pode ser false ou true
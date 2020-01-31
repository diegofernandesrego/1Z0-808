 class B{

    String msg;

    void imprime(){
        if(!msg.isEmpty())
            System.out.println(msg);
        else
            System.out.println("empty");
    }
}


public class A{
    public static void main(String[] args){
        
        new B().imprime();
    }
}

/*Dá NullPointerException ! msg é null e
não dá pra chamar isEmpty em null*/
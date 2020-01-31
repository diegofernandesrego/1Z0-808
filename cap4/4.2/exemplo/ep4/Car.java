class Car{

    String model;
    int year;

    public Car(){
        year = 2014;
    }

    public String getData(){
        return model + " - " + year;
    }

    public void setModel(String m){
        this.model = m;
    }
}
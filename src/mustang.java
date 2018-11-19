public class mustang implements horse {
    private String name;
    private int weight;
    public mustang(String name, int weight){
        this.name=name;
        this.weight=weight;
    }
    public int getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        String output= "";
        output+= this.getName() + ", weighs: " + this.getWeight();
        return output;
    }

}

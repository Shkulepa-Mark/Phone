public class Phone{
    private int number;
    private String model;
    private float weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Phone(int number, String model, float weight){
        this(number,model);
        this.weight=weight;
    }

    public Phone(int number,String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}



    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void sendMessage(int ... nums)
    {
        System.out.println("sending to ... ");
        for(int numbers : nums)
        {
            System.out.println(numbers);
        }
    }

    public void receiveCall(String name,int number)
    {
        System.out.println("Звонит " + name);
        System.out.println("Номер: " + number);
    }


    public int getNumber(int number)
    {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

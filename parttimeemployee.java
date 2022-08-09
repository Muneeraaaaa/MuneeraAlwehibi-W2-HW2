public class parttimeemployee extends employee {

    private int workhour;
    private int wage;

    public parttimeemployee(String name, int id, int workhour, int wage) {
        super(name, id);
        this.workhour = workhour;
        this.wage = wage;

        computeamount();

    }

    public double computeamount (){

        
    }



}



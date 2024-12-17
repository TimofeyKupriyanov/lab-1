package bsu.rfe.course2.group6.kupriyanov;

public class Cake extends Food
{

    private String icing;

    public Cake(String icing)
    {
        super("Пирожное");
        this.icing = icing;
    }


    @Override
    public void consume()
    {
        System.out.println(this + " съеден");
    }

    public String getIcing()
    {
        return icing;
    }
    public void setIcing(String icing)
    {
        this.icing = icing;
    }

    public String toString()
    {
        return super.toString() + " с глазурью '" + icing.toUpperCase() + "'";
    }

}

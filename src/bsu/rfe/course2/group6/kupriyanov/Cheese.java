package bsu.rfe.course2.group6.kupriyanov;

public class Cheese extends Food
{


    public Cheese()
    {
        super("Сыр");
    }

    @Override
    public void consume()
    {
        System.out.println(this + " съеден");
    }

}
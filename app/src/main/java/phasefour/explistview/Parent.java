package phasefour.explistview;

import java.util.ArrayList;

public class Parent
{
    private String name;

    private ArrayList<Child> children;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // ArrayList to store child objects
    public ArrayList<Child> getChildren()
    {
        return children;
    }

    public void setChildren(ArrayList<Child> children)
    {
        this.children = children;
    }

}
 
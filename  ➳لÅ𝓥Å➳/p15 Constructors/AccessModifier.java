class MyEmployee 
{
    private int id ;
    private String name;
    
    
    public String getName()
    {
        return name;
    }
    
    public void setId(int idcard)
    {
        id=idcard;
    }
    //getters
    public int getId()
    {
         return id;
    }
    //setters
    public void setName(String Name)
    {
        name=Name;
    }
    
    public static void main(String[] args)
    {
        MyEmployee e=new MyEmployee();
        e.setName("Karun Nair");
        e.setId(69);
        System.out.println(e.getName());
        System.out.println(e.getId());
    }
}
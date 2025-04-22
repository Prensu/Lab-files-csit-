class MyEmployee 
{
    private int id ;
    private String name;
    
    public MyEmployee()
    {
        id=12;
        name="Shashank Singh Rajput";
    }
    
    public MyEmployee(String myName,int myId)
    {
        name=myName;
        id=myId;
    }
    public String getName(){ return name; }
    public void setId(int idcard){ id=idcard; }
    public int getId(){return id; }
    public void setName(String Name){name=Name;}
   
    public static void main(String[] args)
    {
        MyEmployee e=new MyEmployee("Virat Kolhi",18);
        // e.setName("Karun Nair");
        // e.setId(69);
        
        System.out.println(e.getName());
        System.out.println(e.getId());
    }
}
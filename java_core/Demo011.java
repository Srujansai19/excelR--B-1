class Parent{
    public String Name = "Hitler";

    void parentDetails(){
        System.out.println("parents name is "+ Name);
    }
}

class Child extends Parent{
    String Son = "Jean Marie";
    
    void childDetails(){
        System.out.println("Sons full name is "+super.Name+". "+Son);
    }
}
public class Demo011 {
    public static void main(String[] args) {        
        Parent p = new Parent();
        Child c = new Child();
        
        p.parentDetails();
        c.childDetails();
    }
}

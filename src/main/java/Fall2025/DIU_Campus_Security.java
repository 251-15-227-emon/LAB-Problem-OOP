package Fall2025;

interface Notification {
    
    public void sentNotification(String message);
    
}

//abstract class
abstract class User {
    
    String name;
    int id;
    
    User(String name, int id) {
        
        this.name = name;
        this.id = id;
        
    }
    
    abstract void accessCampus();
    
    public void Display() {
        
        System.out.println("Name :" + name);
        System.out.println("ID :" + id);
        
    }
    
}

// concreate class 
class student extends User implements Notification {
    
    student(String name, int id) {
        
        super(name, id);
        
    }
    
    @Override
    void accessCampus() {
        System.out.println("Student can access DIU Digital Campus");
        
    }

    @Override
    public void sentNotification(String message) {
        
        System.out.println("Student Notification :" + message);
        
    }
    
}

public class DIU_Campus_Security {
    
    public static void main(String[] args) {
        
        student s1 = new student("Emon", 1001);
        
        s1.Display();
        s1.accessCampus();
        s1.sentNotification("Student Must Attened the Class");
    }
    
}

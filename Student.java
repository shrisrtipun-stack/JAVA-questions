
    
class Student[

    String name;
    int roll no;
    String course;

    # constructor
    Student(String name, int roll no, String course) {
        this.name = name;
        this.roll no = roll no;
        this.course = course;
    }

# Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll no);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 101, "BIT");
        student1.displayDetails();
    }
]

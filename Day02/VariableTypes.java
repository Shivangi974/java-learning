class VariableType{
  //Declare instance variable 
String fName="Shivangi";
static String lName="Kumari";
  
  public static void main(String []args){
    //Declare Local Variable
    int var=10;     // we cant access this variable from outside of this method.
    System.out.println("Local Variable : "+var);

    
    // we cant directly access instance variable without creating an object of class.
    VariableType v=new VariableType();   // object creation
    System.out.println("Instance Variable : "+ v.fName); 

    
    //access static variable without creating an object.
    System.out.println("Static variable : "+VariableType.lName);
    
    //static int c=10;   // Error : static variable cannot be declare inside a method.
  }
}

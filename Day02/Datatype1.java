class Datatype1{
  public static void main(String [] args){
    //Primitive Datatypes
    byte b=100;
    short s=30000;
    int i=100000;
    long l=10000000000L;
    float f=3.14f;
    double d=3.14159265359;
    char grade='A';
    boolean flag=true;

  //Non-primitive Datatypes
  String str="Hello Java";
  int [] arr={1,2,3,4,5};
  StringBuilder sb=new StringBuilder("Java");

  System.out.println("There are 8 Primitive DataTypes in java : ");
  System.out.println("byte : "+b);
  System.out.println("short : "+s);
  System.out.println("int : "+i);
  System.out.println("long : "+l);
  System.out.println("float : "+f);
  System.out.println("double : "+d);
  System.out.println("char : "+c);
  System.out.println("boolean : "+b);
  System.out.println("Non-primitive DataTypes : ");
  System.out.println("String : "+str);
  System.out.println("Array : ");
  for(int num:arr){
    System.out.print(num + "\t");
  }
  System.out.println();

  System.out.println("StringBuilder : "+sb);
  }
}

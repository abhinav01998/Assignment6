class abc{
abc(){
System.out.println("Default constructor called");
}
abc(int x){
  this();
System.out.println("Parameterized constructor called");

}
}
class default_constructors{
public static void main(String args[]){
abc obj=new abc(10);
}
}

 class abc{
static String display(){
return "Instance method of abc called";
}
}
public class InstanceMethod extends abc{

public static void main(String args[]){
System.out.println(display());
}
}

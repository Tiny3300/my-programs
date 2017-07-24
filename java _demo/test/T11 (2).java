package Test;

public class T11{
public void myMethod(Object o){
System.out.println("My Object");
}
public void myMethod(String s){
System.out.println("My String");
}
public static void main(String args[]){
T11 t=new T11();
t.myMethod(null);
}
}
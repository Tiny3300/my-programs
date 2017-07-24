package Test;

public class T9 {
  public static void main(String[] args) {
	boolean b=true;
	b=new Apple().equals(new Apple());
	System.out.println(b);
}
}
class Apple{}

package Test;

public class SingleUser {
	private String name;
	private String pwd;
	private static SingleUser u = null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//私有无参构造
	private SingleUser(){
	}
	//实例化对象方法
	public static SingleUser getUser(){
		if(u==null){
			u=new SingleUser();
		}
		return u;
	}
	public static void main(String[] args) {
		SingleUser u1 = SingleUser.getUser();
		SingleUser u2 = SingleUser.getUser();
		System.out.println(u1==u2);
	}

}

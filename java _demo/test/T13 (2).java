package Test;

public class T13 {
	
	//有 1、2、3、4 个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	public static void main(String[] args) {
		int i,j,k;
		int t=0;
		
		for (i=1;i<=4;i++) {
			for( j=1;j<=4;j++){
				for(k=1;k<=4;k++){
					if(i!=j&&j!=k&&k!=i){
						t+=1;
						System.out.println(i*100+j*10+k);
					}
					
				}
				
			}
			
		}
		System.out.println("一共有："+t);
		
	}

	
	
	
	

}

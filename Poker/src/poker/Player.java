package poker;
//用0-51表示52张牌，0-12表示红桃，13-25表示方块，26-38表示梅花，39-51表示黑桃A-K。
public class Player {
	//定义一个玩家类
	private int card[]=new int[13];
	private  String[] cname={"红桃","方块","梅花","黑桃"};
	//定义构造函数,初始化玩家
	Player(){
		for(int i=0;i<13;i++){
			card[i]=-1;
		}
	}
	//定义一个方法用来表示第几张牌
 public  String display(int id){
		int a =card[id]/13;
		int b=card[id]%13;
		b=b+1;
		if(card[id]==-1)
		return("这张牌不存在");	
		else if(b==1)
			return(cname[a]+"A");
		else if(b==2)
			return(cname[a]+"2");
		else if(b==3)
			return(cname[a]+"3");
		else if(b==4)
			return(cname[a]+"4");
		else if(b==5)
			return(cname[a]+"5");
		else if(b==6)
			return(cname[a]+"6");
		else if(b==7)
			return(cname[a]+"7");
		else if(b==8)
			return(cname[a]+"8");
		else if(b==9)
			return(cname[a]+"9");
		else if(b==10)
			return(cname[a]+"10");
		else if(b==11)
			return(cname[a]+"J");
		else if(b==12)
			return(cname[a]+"Q");
		else if(b==13)
			return(cname[a]+"K");
		else
		return ("未知错误");		
	}
 public void setcard(int id,int x) 
 { 
 if (id<13 && x<52) card[id]=x; 
 else 
	 System.out.println("错误 id="+id+" x="+x); 
 } 
}

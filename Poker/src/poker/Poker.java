package poker;

import java.util.Random;

public class Poker {
	static Random random=new Random(); 
	//定义一个int类型的长度为52的数组
		static int []totalcard=new int[52];
		static int num=13;//每个人限发13张牌
		static int i;
		static int j;
		static int x;
		int a,b;
	public static void main(String[] args) {
		//生成四个玩家
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		Player p4=new Player();
		//分别给四个玩家发牌
		givecard(p1);
		givecard(p2);
		givecard(p3);
		givecard(p4);
		//初始化这个用来判断的数组
		for (i=0;i<=51;i=i+1) 
			totalcard[i]=0; 
		System.out.println("第一家的牌如下："); 
		for (j=0;j<num;j=j+1) 
		System.out.print(p1.display(j)+" "); 
		System.out.println(""); 
		System.out.println("第二家的牌如下："); 
		for (j=0;j<num;j=j+1) 
		System.out.print(p2.display(j)+" "); 
		System.out.println(""); 
		System.out.println("第三家的牌如下："); 
		for (j=0;j<num;j=j+1) 
		System.out.print(p3.display(j)+" "); 
		System.out.println(""); 
		System.out.println("第四家的牌如下："); 
		for (j=0;j<num;j=j+1) 
		System.out.print(p4.display(j)+" "); 
		System.out.println(""); 
	}
	//发牌
	public static void givecard(Player player){
		
		for (j=0;j<num;j=j+1) //发给一家 
		{ 
		x=random.nextInt(52); 
		while (totalcard[x]!=0) 
		x=random.nextInt(52); 
		player.setcard(j,x); 
		totalcard[x]=1; 
		} 
	}

}

package poker;

import java.util.Random;

public class Poker {
	static Random random=new Random(); 
	//����һ��int���͵ĳ���Ϊ52������
		static int []totalcard=new int[52];
		static int num=13;//ÿ�����޷�13����
		static int i;
		static int j;
		static int x;
		int a,b;
	public static void main(String[] args) {
		//�����ĸ����
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		Player p4=new Player();
		//�ֱ���ĸ���ҷ���
		givecard(p1);
		givecard(p2);
		givecard(p3);
		givecard(p4);
		//��ʼ����������жϵ�����
		for (i=0;i<=51;i=i+1) 
			totalcard[i]=0; 
		System.out.println("��һ�ҵ������£�"); 
		for (j=0;j<num;j=j+1) 
		System.out.print(p1.display(j)+" "); 
		System.out.println(""); 
		System.out.println("�ڶ��ҵ������£�"); 
		for (j=0;j<num;j=j+1) 
		System.out.print(p2.display(j)+" "); 
		System.out.println(""); 
		System.out.println("�����ҵ������£�"); 
		for (j=0;j<num;j=j+1) 
		System.out.print(p3.display(j)+" "); 
		System.out.println(""); 
		System.out.println("���ļҵ������£�"); 
		for (j=0;j<num;j=j+1) 
		System.out.print(p4.display(j)+" "); 
		System.out.println(""); 
	}
	//����
	public static void givecard(Player player){
		
		for (j=0;j<num;j=j+1) //����һ�� 
		{ 
		x=random.nextInt(52); 
		while (totalcard[x]!=0) 
		x=random.nextInt(52); 
		player.setcard(j,x); 
		totalcard[x]=1; 
		} 
	}

}

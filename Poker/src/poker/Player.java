package poker;
//��0-51��ʾ52���ƣ�0-12��ʾ���ң�13-25��ʾ���飬26-38��ʾ÷����39-51��ʾ����A-K��
public class Player {
	//����һ�������
	private int card[]=new int[13];
	private  String[] cname={"����","����","÷��","����"};
	//���幹�캯��,��ʼ�����
	Player(){
		for(int i=0;i<13;i++){
			card[i]=-1;
		}
	}
	//����һ������������ʾ�ڼ�����
 public  String display(int id){
		int a =card[id]/13;
		int b=card[id]%13;
		b=b+1;
		if(card[id]==-1)
		return("�����Ʋ�����");	
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
		return ("δ֪����");		
	}
 public void setcard(int id,int x) 
 { 
 if (id<13 && x<52) card[id]=x; 
 else 
	 System.out.println("���� id="+id+" x="+x); 
 } 
}


public class Time {
	
	int hour;
	int min;
	int second;
	
	
	Time(){
		second=23;
		min=40;
		hour=9;
	}
	
	
     
	Time(int hour,int min,int second){
		this.hour=hour;
		this.min=min;
		this.second=second;
	}
	
	boolean barabar(Time x){
		if(this.hour==x.hour && this.min==x.min && this.second==x.second){
			return true;
		}
		 return false;	
	}
	
	void chapkon(){
		System.out.println(hour+":"+min+":"+second);
	}
}

package Builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	
    private List<Sender> list = new ArrayList<Sender>();
    
    public void produceSmsSender2(int i) {
    	
    }
	
	public void produceMailSender(int count){
		for(int i=0; i<count; i++){
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count){
		for(int i=0; i<count; i++){
			list.add(new SmsSender());
		}
	}
	
	public int len() {
		return list.size();
	}
}

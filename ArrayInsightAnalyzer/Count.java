class Count{
	private  int count=0;
	private StringBuilder histogram= new StringBuilder("");
	public  void increment(){
		count++;
	}
	public  int getCount(){
	return count;
	}
	
	public StringBuilder getHistogram(){
		for(int i=0;i<count;i++){
			histogram.append("#");
		}
	return histogram;
	}

	
}

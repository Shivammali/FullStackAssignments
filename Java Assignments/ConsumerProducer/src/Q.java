class Q{
	int num;
	boolean value=false;
	
	public synchronized void put(int num) 
	{
	   while(value) {
		   try {
			   wait();
		   }
		   catch(Exception e) {
			   
		   }
	   }
	   System.out.println("Put : "+num);
	   this.num=num;
	   value=true;
	   notify();
	}
	
	public synchronized void get()
	{
		while(!value)
		{
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("get : "+num);
		value=false;
		notify();
	}
	
}
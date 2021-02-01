
class Consumer implements Runnable
{
	Q q;
	public Consumer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	public void run() {
		while(true)
		{
			q.get();
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
				
			}
		}
	}
}
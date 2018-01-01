import java.util.Timer;
import java.util.TimerTask;


public class TimerDemo
{

	public static void main(String[] args) 
	{
		MyTimerTask task=new MyTimerTask();
		Timer timer=new Timer();
		timer.schedule(task, 1000,1000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timer.cancel();
	}

}

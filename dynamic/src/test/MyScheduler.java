package test;

import java.text.ParseException;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

public class MyScheduler {
	MyScheduler() throws SchedulerException, ParseException {
		SchedulerFactory sf = new StdSchedulerFactory();
		Scheduler s = sf.getScheduler();
		JobDetail job1 = new JobDetailImpl("myJob1", "myGroup1", MyJob.class);
		Trigger trigger1 = new CronTriggerImpl("myTrigger1", "myGroup1", "0/20 * * * * ?");
		s.scheduleJob(job1, trigger1);
		s.start();
	}
	
	public static void main(String[] args) throws SchedulerException, ParseException {
		// TODO Auto-generated method stub
		new MyScheduler();
	}

}

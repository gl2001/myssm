package cn.sz.gl.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyJob extends QuartzJobBean {

	@Scheduled(cron="1/2 * * * * ? *")
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		System.out.println("我的任务");
	}

}

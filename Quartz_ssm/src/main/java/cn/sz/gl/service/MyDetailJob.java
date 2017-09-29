package cn.sz.gl.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Service
public class MyDetailJob {
	@Scheduled(cron="1/2 * * * * ?")
	public void show(){
		System.out.println("我的任务");
	}
}

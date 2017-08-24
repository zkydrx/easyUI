package com.tyd.service.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by ZKY on 2017-08-24 21:10.
 */
public class Job extends QuartzJobBean
{
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException
    {
        System.out.println("job Start");
    }
}

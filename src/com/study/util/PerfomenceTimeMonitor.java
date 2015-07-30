package com.study.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
/**
 * 检测service方法执行时间
 * @author dell
 *
 */
@Aspect
@Component
public class PerfomenceTimeMonitor {
	   private static final Logger logger = LoggerFactory.getLogger("monitor");  
	      /** 
	        * 监控com.henry.advertising.web.service包及其子包的所有public方法 
	       * <功能详细描述> 
	        * @see [类、类#方法、类#成员] 
	        */  
	      @Pointcut("execution(* com.study.service..*.*(..))")    
	      private void pointCutMethod() {    
	    	  System.out.println(1231231231);
	      }    
	     
	        //声明环绕通知    
	       @Around("pointCutMethod()")    
	      public Object doAround(ProceedingJoinPoint pjp) throws Throwable {    
	           long begin = System.nanoTime();  
	          Object o = pjp.proceed();    
	          long end = System.nanoTime();  
	          logger.debug("{}:{}",pjp.getTarget().getClass()+"."+pjp.getSignature().getName(),(end-begin)/1000000+"豪秒");  
	           return o;    
	       }   

}

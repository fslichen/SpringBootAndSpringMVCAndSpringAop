package evolution;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnyAspect {
	@Around("execution(* evolution.AnyController.*(..))")
	public void around(ProceedingJoinPoint jointPoint) throws Throwable {
		System.out.println("Let it go.");
		jointPoint.proceed();
	}
}

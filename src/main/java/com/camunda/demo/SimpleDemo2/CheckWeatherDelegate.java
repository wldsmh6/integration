package com.camunda.demo.SimpleDemo2;
import java.util.Random;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckWeatherDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Random rando = new Random();
		// TODO Auto-generated method stub
		execution.setVariable("weatherOk", rando.nextBoolean());

	}

}

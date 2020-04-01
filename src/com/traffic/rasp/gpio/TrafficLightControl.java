package com.traffic.rasp.gpio;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class TrafficLightControl {
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("traffic server started");
		System.out.println("setting green signlat to 30sec");
		int signal_green =30;
		System.out.println("considering system default no of PATHWAYS to 4");
		int pathway = 4;
		final GpioController gpio = GpioFactory.getInstance();
		final GpioPinDigitalOutput led1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);
	    final GpioPinDigitalOutput led2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02);
        final GpioPinDigitalOutput led3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03);
        final GpioPinDigitalOutput led4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04);
        final GpioPinDigitalOutput led5 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05);
        final GpioPinDigitalOutput led6 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06);
        final GpioPinDigitalOutput led7 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07);
        final GpioPinDigitalOutput led8 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08);
        final GpioPinDigitalOutput led9 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09);
        final GpioPinDigitalOutput led10 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10);
	    final GpioPinDigitalOutput led11 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11);
        final GpioPinDigitalOutput led12 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12);
        led2.setState(PinState.LOW);
        led5.setState(PinState.LOW);
        led8.setState(PinState.LOW);
        led11.setState(PinState.LOW);
        
        
        while (true)
        {
        	//singnal1 green
        	led3.setState(PinState.LOW);
        	led6.setState(PinState.HIGH);
        	led9.setState(PinState.HIGH);
        	led12.setState(PinState.HIGH);
        	led1.setState(PinState.HIGH);
        	Thread.sleep(30000);
        	led1.setState(PinState.LOW);
        	//signal1 orange
        	led2.setState(PinState.HIGH);
        	Thread.sleep(3000);
        	led2.setState(PinState.LOW);
        	//signal1 red
        	led3.setState(PinState.HIGH);
        	
        	//signal2
        	
        	led3.setState(PinState.HIGH);
        	led6.setState(PinState.LOW);
        	led9.setState(PinState.HIGH);
        	led12.setState(PinState.HIGH);
        	//green
        	led4.setState(PinState.HIGH);
        	Thread.sleep(30000);
        	led4.setState(PinState.LOW);
        	//orange
        	led5.setState(PinState.HIGH);
        	Thread.sleep(3000);
        	led5.setState(PinState.LOW);
        	// red
        	led6.setState(PinState.HIGH);
        	
        	//signal 3
        	led3.setState(PinState.HIGH);
        	led6.setState(PinState.HIGH);
        	led9.setState(PinState.LOW);
        	led12.setState(PinState.HIGH);
        	//green
        	led7.setState(PinState.HIGH);
        	Thread.sleep(30000);
        	led7.setState(PinState.LOW);
        	//orange
        	led8.setState(PinState.HIGH);
        	Thread.sleep(3000);
        	led8.setState(PinState.LOW);
        	// red
        	led9.setState(PinState.HIGH);
        	
        	//signal 4
        	led3.setState(PinState.HIGH);
        	led6.setState(PinState.HIGH);
        	led9.setState(PinState.HIGH);
        	led12.setState(PinState.LOW);
        	//green
        	led10.setState(PinState.HIGH);
        	Thread.sleep(30000);
        	led10.setState(PinState.LOW);
        	//orange
        	led11.setState(PinState.HIGH);
        	Thread.sleep(3000);
        	led11.setState(PinState.LOW);
        	// red
        	led12.setState(PinState.HIGH);
        	
        	
        }
	        
		
	}

}

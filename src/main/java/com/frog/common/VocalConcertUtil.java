package com.frog.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VocalConcertUtil {
	
	public  BigDecimal chip_one;
	public  BigDecimal chip_two;
	public 	BigDecimal chip_thr;
	public 	BigDecimal chip_for;
	public 	BigDecimal chip_fiv;
	
	
	public static String getChip(){
		double persent= new Random().nextDouble() * 1;
		if(persent>0.02&&persent<0.2){
			return "chip_one";
		}else if(persent>=0.2&&persent<0.5){
			return "chip_two";
		}else if(persent>=0.5&&persent<0.75){
			return "chip_thr";
		}else if(persent>=0.75&&persent<1){
			return "chip_for";
		}else if(persent<=0.02){
			return "chip_fiv";
		}else{
			return "";
		}
	}
	public static void main(String[] args) {
		String phone ="13333333333";
		
	}
	
}

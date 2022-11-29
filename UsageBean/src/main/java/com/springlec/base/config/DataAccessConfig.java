package com.springlec.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springlec.base.service.CalcService;

@Configuration
public class DataAccessConfig {
	
	@Bean
	public CalcService calcservice() {
		
		return new CalcService() {//return new interface명 선언하면 override가 저절로 생성됨.
			
			@Override
			public int subtraction(int num1, int num2) throws Exception {
				// TODO Auto-generated method stub
				return num1-num2;
			}
			
			@Override
			public int quotient(double num1, double num2) throws Exception {
				// TODO Auto-generated method stub
				return (int) (num1%num2);
			}
			
			@Override
			public int multiply(double num1, double num2) throws Exception {
				// TODO Auto-generated method stub
				return (int) (num1*num2);
			}
			
			@Override
			public int divide(double num1, double num2) throws Exception {
				// TODO Auto-generated method stub
				return (int) (num1/num2);
			}
			
			@Override
			public int addAction(int num1, int num2) throws Exception {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		
	}
}

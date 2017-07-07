package com.July30.com;

import javax.naming.spi.DirStateFactory.Result;

public class RunnerT {

	public static void main(String[] args) {
		Result result=Junitcore.runClasses(Number.class);
		for(Result r;n=result.getfailures()){
			System.out.println(r.getMessages());
}
		System.out.println(result.wasSuccesfull);
	}

}

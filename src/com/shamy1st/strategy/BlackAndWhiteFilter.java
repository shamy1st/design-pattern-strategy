package com.shamy1st.strategy;

public class BlackAndWhiteFilter implements Filter {

	@Override
	public void apply(String fileName) {
		System.out.println("Apply Black & White Filter.");
	}
}

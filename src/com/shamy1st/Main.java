package com.shamy1st;

import com.shamy1st.strategy.BlackAndWhiteFilter;
import com.shamy1st.strategy.ImageStorage;
import com.shamy1st.strategy.JpegCompressor;

public class Main {

	public static void main(String[] args) {
		ImageStorage image = new ImageStorage();
		image.store("image-a", new JpegCompressor(), new BlackAndWhiteFilter());
	}
}

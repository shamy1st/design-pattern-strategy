package com.shamy1st.strategy;

public class JpegCompressor implements Compressor {

	@Override
	public void compress(String fileName) {
		System.out.println("Compress using JPEG.");
	}
}

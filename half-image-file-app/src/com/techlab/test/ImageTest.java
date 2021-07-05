package com.techlab.test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Image image1 = ImageIO.read(new File("D:\\javaclasswork_a\\half-image-file-app\\src\\com\\techlab\\test\\img.jpg"));
			BufferedImage buffered = (BufferedImage) image1;
			BufferedImage b1 = buffered.getSubimage(0, 0, buffered.getWidth(), buffered.getHeight()/2);
			File outputfile = new File("D:\\javaclasswork_a\\half-image-file-app\\src\\com\\techlab\\test\\img1.jpg");
			ImageIO.write(b1, "jpg", outputfile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

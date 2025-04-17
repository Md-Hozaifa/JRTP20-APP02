package in.hozaifa.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	int b=20;
	int a=10;
	int c=10;
	int d=90;

	public static String encoder(String txt) {
		
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(txt.getBytes());
		return encodeToString;
	}
	
	public static String decoder(String decodeTxt) {
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(decodeTxt);
		
		
		return new String(decode);
	}
	
	
	public static void main(String[] args) {
		
		String encoder = PasswordService.encoder("hozaifa@123");
		System.out.println(encoder);
		
		String decoder = PasswordService.decoder(encoder);
		System.out.println(decoder);
	}
	
}

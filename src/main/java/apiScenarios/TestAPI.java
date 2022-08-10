package apiScenarios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TestAPI {


	public static void main(String[] args) throws Exception 
	{
		String decryptApiValue = "zJkNCxgdFt6d2X8Pb3h04cvfAvMAOudyDUh6oy7Oo7r81FJz7WpHHCakIyloPJWmJBJSwYBrFP1Q7421R+p5A4j4CSXQ9J4h7PRdb9bY3sc9UdjymSyeeYoX9RUtVjU/VsUV1GkKsICR9RKyAnTn0XTyqGhronaenYoCTxtibgp9XdT6UOYyZtTVfuOXo79UDc9YNdtSeGENuFDBrGZO9eyB6BjGhfBKnzuwhC0lSrz875eSsox0CnamJ3A4rbkyFrAh11iYM+54hy9zz+GlLn3c9jMFm4Vm2btR6BbayTjXWVkXDFhOfS4vrJmH7RNAGB+qvxcBSiXL/yAhGSkAOUWxi/eR7tL7u8kiFH96oXITtsl/oMTZTMlID6VtzclcRHeP71ol1PgeFDx1WF81hmT3v3FMRfNxwN0DlIZd6uNLvI7wRFpvwBudFAq+jJDtCnA9s/hZyLyHrLUdYxfuticqX4eJkLnY59U9koNGoXM9yK5X4IafOg7VbxaAY1rDVCEATWiBqbskKSlLH1MaeOZzGFr5cRVu/j+kyaNR0VB4WXJh2uyPNVEwg0/5jI1z+SqL0UFsan3gHAylRBgh1TIRPdM4NNZi4ZCcX+05Kz7g1X8kEKbGE4Zf2nPRO+60HCGtKOpL316aVpK+s7KcY/ofK2PXAP3+aW1JYtPNJeUpwZPBEg0P+hdun01QZEr1Ky4WU+LzyBvMrxuWQQyiIPuJDzV+22gCb77gHQOilCvbWqa3rgUG88lwfPuirouCqYPV1RbLq/2D/zOZYRzJsg9q9XsqTJP/JFxWwsDosLyVfYc0EuKWE3f/0I2Tg4BhhL1n4QM5h+D1j1kjNXFZIxJ9hyENhVeLX39QUGO5Vgwb8egN2neBCzs5W0WV6YBaVlPZNLN0Vo2qxDmsiM7y+4huuLNODVUL1Ue/Ch3g3Pq0F2kXVDyL+23xpoMksSBpJeuqXAKs0be9BRlW09eI0MZAIUPp8MeXrYcNxazOm0zbPOsih+9ox2XLNFBXcMcti6gRJUQNPYZjhHNQyUYoJCa2Kp/d/mEGFhNOSO8oTybUYxA0";
		System.out.println(decryptData(decryptApiValue));
	}

	public static String decryptData(String data) throws Exception  // Configuration configuration = ofy().load().type(Configuration.class).filter("name", "GCM_Enc_Dec_Key").first().now();
	{
		String key ="Wk+Uzyyn8991w/2V5OIqiQ==";

		byte[] iv2 = Base64.getDecoder().decode(data.substring(0, 16));
		byte[] cipherByte = Base64.getDecoder().decode(data.substring(16));
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] key2 = md.digest(key.getBytes(StandardCharsets.UTF_8));
		// Get Cipher Instance
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");

		// Create SecretKeySpec
		SecretKeySpec keySpec = new SecretKeySpec(key2, "AES");
		// Create GCMParameterSpec
		GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(16 * 8, iv2);

		// Initialize Cipher for DECRYPT_MODE
		cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmParameterSpec);

		// Perform Decryption
		byte[] decryptedText = cipher.doFinal(cipherByte);

		return new String(decryptedText);
	}


	public static String encryptData(String data) throws Exception // Configuration configuration = ofy().load().type(Configuration.class).filter("name", "GCM_Enc_Dec_Key").first().now();
	{
		String key = "Wk+Uzyyn8991w/2V5OIqiQ==";

		byte[] iv = new byte[12];
		(new SecureRandom()).nextBytes(iv);
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] key2 = md.digest(key.getBytes(StandardCharsets.UTF_8));

		// Create SecretKeySpec
		SecretKeySpec keySpec = new SecretKeySpec(key2, "AES");

		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
		GCMParameterSpec ivSpec = new GCMParameterSpec(16 * Byte.SIZE, iv);
		cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

		byte[] ciphertext = cipher.doFinal(data.getBytes("UTF8"));
		byte[] encrypted = new byte[iv.length + ciphertext.length];

		System.arraycopy(iv, 0, encrypted, 0, iv.length);
		System.arraycopy(ciphertext, 0, encrypted, iv.length, ciphertext.length);

		String encoded = Base64.getEncoder().encodeToString(encrypted);

		return encoded;
	}
}
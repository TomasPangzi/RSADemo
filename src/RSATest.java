import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.logging.Logger;

public class RSATest {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub

		HashMap<String, Object> map = RSAUtils.getKeys();
		// 生成公钥和私钥
		RSAPublicKey publicKey = (RSAPublicKey) map.get("public");
		RSAPrivateKey privateKey = (RSAPrivateKey) map.get("private");

		// 模
		String modulus = publicKey.getModulus().toString();
		System.out.print("modulus----"+modulus+"\n");
		// 公钥指数
		String public_exponent = publicKey.getPublicExponent().toString();
		System.out.print("public_exponent----"+public_exponent+"\n");
		// 私钥指数
		String private_exponent = privateKey.getPrivateExponent().toString();
		System.out.print("private_exponent----"+private_exponent+"\n");
		// 明文
		String ming = "123456789";
		// 使用模和指数生成公钥和私钥
		RSAPublicKey pubKey = RSAUtils.getPublicKey(modulus, public_exponent);
		RSAPrivateKey priKey = RSAUtils
				.getPrivateKey(modulus, private_exponent);
		
	}

}

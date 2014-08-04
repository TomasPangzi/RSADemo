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
		// ���ɹ�Կ��˽Կ
		RSAPublicKey publicKey = (RSAPublicKey) map.get("public");
		RSAPrivateKey privateKey = (RSAPrivateKey) map.get("private");

		// ģ
		String modulus = publicKey.getModulus().toString();
		System.out.print("modulus----"+modulus+"\n");
		// ��Կָ��
		String public_exponent = publicKey.getPublicExponent().toString();
		System.out.print("public_exponent----"+public_exponent+"\n");
		// ˽Կָ��
		String private_exponent = privateKey.getPrivateExponent().toString();
		System.out.print("private_exponent----"+private_exponent+"\n");
		// ����
		String ming = "123456789";
		// ʹ��ģ��ָ�����ɹ�Կ��˽Կ
		RSAPublicKey pubKey = RSAUtils.getPublicKey(modulus, public_exponent);
		RSAPrivateKey priKey = RSAUtils
				.getPrivateKey(modulus, private_exponent);
		
	}

}

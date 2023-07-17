import javax.crypto.spec.IvParameterSpec;

private static byte[] myIV = new byte[16] {};
// ruleid: static_iv
IvParameterSpec ivSpec = new IvParameterSpec(myIV);

private byte[] myIV_ok = new byte[16] {};
// ok: static_iv
IvParameterSpec ivSpec = new IvParameterSpec(myIV_ok);
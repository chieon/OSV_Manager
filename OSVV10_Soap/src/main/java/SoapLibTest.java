import kr.co.vodacom.osv.osvManager;

public class SoapLibTest {
	public static void main(String[] args) {
		osvManager mng=new osvManager("d:\\osvsystem.properties");
		mng.connect();
		mng.getInfo1("88880397");
		mng.getInfo2("88880397");
	}
}

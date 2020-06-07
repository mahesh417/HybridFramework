package rough;

import com.w2a.hybrid.util.TestUtil;
import com.w2a.hybrid.util.Xls_Reader;

public class TestData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestUtil.getData("LoginTest", new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\w2a\\hybrid\\xls\\Test Suite1.xlsx"));

		TestUtil.getData("CheckMail", new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\w2a\\hybrid\\xls\\Test Suite1.xlsx"));
		TestUtil.getData("SearchShareTest", new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\w2a\\hybrid\\xls\\Test Suite1.xlsx"));

	}

}

import org.testng.annotations.DataProvider;

public class OperationTestData {
	
	
	@DataProvider(name= "loginDatas")
	
	public static Object [][] loginData(){
		Object[][] data;
		data= new Object[][]{
			{"suman718", "Chandra718"},
			{"suman718", "Chandra718"},
			
			
		};
		return data;
	}
	

}

package dataPro;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Requestor_Submit extends DataProv{

	
	
	@Test
	public void reqSignIn() {
	setup();
	signInRequestor(); 
	Cls_Lnk(); 
	overLay();
	Submit_AfterSave();
	 
}}
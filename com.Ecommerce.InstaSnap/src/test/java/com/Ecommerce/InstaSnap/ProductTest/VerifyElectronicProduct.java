package com.Ecommerce.InstaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class VerifyElectronicProduct extends BaseTest

{
	
	
		
		@Test(priority=1)
		public void createProduct()
		{
			
			
			Reporter.log("Electronic Product Created",true);
			
		}
		
		
		@Test(priority=2,invocationCount = 2,dependsOnMethods = "createProduct",enabled = false)
		public void updateProduct()
		{
			
			Reporter.log("Electronic Product Updated",true);
			
		}

}
}
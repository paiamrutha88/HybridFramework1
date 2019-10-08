package com.qtpselenium.hybrid.driver;

import com.qtpselenium.hybrid.util.Xls_Reader;

public class DriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("user.dir"));  
		Xls_Reader xl=new Xls_Reader(System.getProperty("user.dir")+"\\xls\\Testcases.xlsx");
		int rows=xl.getRowCount("Testcases");
		System.out.println(xl.getColumnCount("Testcases"));
		
		System.out.println(rows);

		xl.getCellData("Testcases", "Data",4);
	}

}

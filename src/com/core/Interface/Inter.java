package com.core.Interface;

interface MyInter {
	void connect();
}

class OracleDb implements MyInter {
	public void connect() {
		System.out.println("Connecting to oracle");
	}
}

class SybaseDb implements MyInter {
	public void connect() {
		System.out.println("Connecting to sybase");
	}
}

class Inter {
	public static void main(String[] args) throws Exception {
		/*
		 * Class c=Class.forName(args[0]); MyInter mi=(MyInter)c.newInstance();
		 * mi.connect();
		 */

		OracleDb ob = new OracleDb();
		SybaseDb sb = new SybaseDb();
		MyInter m1, m2;
		m1 = ob;
		m1.connect();
		m2 = sb;
		m2.connect();
	}
}

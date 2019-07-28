package controller;

import java.awt.Frame;
import java.util.ArrayList;

public interface databaseAbtract <T>  {
// note : key 1 = insert, key 2=update, key 3= delete, key 4 = getdata ();
	ArrayList<T> CRUDdatabase(String sql, Frame frame, int key);
//	void Insert(String sql,  Frame frame);
//	void Delete(String sql,  Frame frame);
}

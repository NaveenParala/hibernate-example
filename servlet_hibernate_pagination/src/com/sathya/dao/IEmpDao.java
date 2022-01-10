package com.sathya.dao;

import java.util.List;

public interface IEmpDao {
	public List readEmps(int startIndex);
	public long getNoOfRows();

}

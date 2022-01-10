package com.sathya.dao;

import java.util.List;

public interface IEmpDao {
	List findEmpsByDeptNumber(int deptNumber);
	List findAggregationResult();

}

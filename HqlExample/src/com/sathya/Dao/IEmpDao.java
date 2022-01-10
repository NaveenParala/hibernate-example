package com.sathya.Dao;

import java.util.List;

public interface IEmpDao {
    List findEmpsByDeptNumber(int deptNumber);
    int updateEmpsByDeptNumber(int deptNumber);
}

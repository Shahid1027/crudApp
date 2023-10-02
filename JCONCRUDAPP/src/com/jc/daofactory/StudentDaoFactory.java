package com.jc.daofactory;

import com.jc.dao.IStudentDao;
import com.jc.dao.StudentDaoImpl;
public class StudentDaoFactory {

	private StudentDaoFactory() {}

	private static IStudentDao studentDao = null;

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}

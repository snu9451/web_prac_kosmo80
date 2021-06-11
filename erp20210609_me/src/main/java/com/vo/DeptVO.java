package com.vo;

import java.io.Serializable;
/*
 * private
 * public  ������ ������ ����
 * ���� �ý���
 * ��ġ�ϰ� ���� �Ŀ��� �۾����� 
 * ���ý���
 * �ܺο��� ���� ���� �� �ִ�.
 * ���ÿ� ���� ����ڰ� ������ �Ѵ�.
 * ���������� Ȱ���ؼ� ���
 * �ν��Ͻ�ȭ�� �ؼ� ����ϰ� �ǹǷ� �󸶵��� �������� ����� ����
 * ���ǰ� ���� ������ �Բ� �ı��.(init()-service()-destroy())
 */
public class DeptVO implements Serializable{
	private int deptno=0;
	private String dname=null;
	private String loc=null;
	private EmpVO empVO = null;
	//VO���Ͽ����� �����ڰ� ������ �������?
	public DeptVO() {
	}
	public DeptVO(int deptno) {
		
	}
	public DeptVO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public EmpVO getEmpVO() {
		return empVO;
	}
	public void setEmpVO(EmpVO empVO) {
		this.empVO = empVO;
	}
}

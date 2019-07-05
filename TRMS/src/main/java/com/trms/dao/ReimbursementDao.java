package com.trms.dao;

import java.util.List;

import com.trms.pojos.ReimbursementForm;

import main.java.com.revature.dao.ReimburseForm;

public interface ReimbursementDao {

	public void submitForm(ReimbursementForm rf);

	public ReimbursementForm getFormById(Integer formid);

	public List<ReimbursementForm> viewBySupervisorId(Integer id);

	public List<ReimbursementForm> viewByHead(Integer id);

	public List<ReimbursementForm> viewByBenCo(Integer id);

	public void supervisorApprove (Integer formid);

	public void supervisorDeny (Integer formid);

	public void headApprove (Integer formid);

	public void headDeny (Integer formid);

	public void benCoApprove (Integer formid);

	public void benCoDeny (Integer formid);
	
	public List<ReimbursementForm> viewFormByEmployeeId(Integer id);

}

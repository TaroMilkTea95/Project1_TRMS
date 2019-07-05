package com.trms.services;

import java.util.List;

import com.trms.pojos.ReimbursementForm;

import main.java.com.revature.services.ReimburseForm;

public interface ReimbursementService {

public void createReimbursementForm(ReimbursementForm rf);
	
	public List<ReimbursementForm> viewBySupervisorId(Integer id);
	
	public List<ReimbursementForm> viewByBenCo(Integer id);
	
	public List<ReimbursementForm> viewByHead(Integer id);
	
	public ReimbursementForm getFormById(Integer formid);
	
	public void supervisorApprove(Integer formid);
	
	public void supervisorDeny(Integer formid);
	
	public void headApprove(Integer formid);
	
	public void headDeny(Integer formid);
	
	public void benCoApprove(Integer formid);
	
	public void benCoDeny(Integer formid);

}

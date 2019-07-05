package com.trms.services;

import java.util.List;

import com.trms.dao.ReimbursementDaoImpl;
import com.trms.pojos.ReimbursementForm;

public class ReimbursementServiceImpl implements ReimbursementService {
	
	private static ReimbursementDaoImpl rdi = new ReimbursementDaoImpl();

	@Override
	public void createReimbursementForm(ReimbursementForm rf) {
		rdi.submitForm(rf);
	}

	@Override
	public List<ReimbursementForm> viewBySupervisorId(Integer id) {
		return rdi.viewBySupervisorId(id);
	}

	@Override
	public List<ReimbursementForm> viewByBenCo(Integer id) {
		return rdi.viewByBenCo(id);
	}

	@Override
	public List<ReimbursementForm> viewByHead(Integer id) {
		return rdi.viewByHead(id);
	}

	@Override
	public ReimbursementForm getFormById(Integer formid) {
		return rdi.getFormById(formid);
	}

	@Override
	public void supervisorApprove(Integer formid) {
		rdi.supervisorApprove(formid);
	}

	@Override
	public void supervisorDeny(Integer formid) {
		rdi.supervisorDeny(formid);
	}

	@Override
	public void headApprove(Integer formid) {
		rdi.headApprove(formid);
	}

	@Override
	public void headDeny(Integer formid) {
		rdi.headDeny(formid);
	}

	@Override
	public void benCoApprove(Integer formid) {
		rdi.benCoApprove(formid);
	}

	@Override
	public void benCoDeny(Integer formid) {
		rdi.benCoDeny(formid);
	}

}

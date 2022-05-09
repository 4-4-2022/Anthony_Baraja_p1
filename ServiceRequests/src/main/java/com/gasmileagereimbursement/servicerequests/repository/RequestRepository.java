package com.gasmileagereimbursement.servicerequests.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasmileagereimbursement.servicerequests.model.Request;

public interface RequestRepository extends JpaRepository<Request, String>{
	List<Request> findByEmployeeId(String employeeId);
	List<Request> findByApprovalStatus(Boolean approvalStatus);
	List<Request> findByBillStatus(Boolean billStatus);

}

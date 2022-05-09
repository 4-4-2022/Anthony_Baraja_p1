package com.gasmileagereimbursement.servicerequests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasmileagereimbursement.servicerequests.model.Request;

public interface RequestRepository extends JpaRepository<Request, String>{

}

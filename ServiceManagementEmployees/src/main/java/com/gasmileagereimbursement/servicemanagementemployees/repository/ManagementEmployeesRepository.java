package com.gasmileagereimbursement.servicemanagementemployees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasmileagereimbursement.servicemanagementemployees.model.ManagementEmployees;

public interface ManagementEmployeesRepository extends JpaRepository<ManagementEmployees, String> {

}

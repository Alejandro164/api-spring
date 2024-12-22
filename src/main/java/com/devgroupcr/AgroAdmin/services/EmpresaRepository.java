package com.devgroupcr.AgroAdmin.services;

import com.devgroupcr.AgroAdmin.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}

package com.devgroupcr.AgroAdmin.services;

import com.devgroupcr.AgroAdmin.entity.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServices {


    @Autowired
    EmpresaRepository empresaRepository;


    public List<Empresa> getAllEmpresas(){
       return (List<Empresa>) empresaRepository.findAll();
    }


    public Empresa saveEmpresa(Empresa empresa){
      return   empresaRepository.save(empresa);
    }

}

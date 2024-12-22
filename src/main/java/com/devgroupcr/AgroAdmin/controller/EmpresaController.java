package com.devgroupcr.AgroAdmin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import com.devgroupcr.AgroAdmin.services.EmpresaServices;
import org.springframework.http.ResponseEntity;
import com.devgroupcr.AgroAdmin.entity.Empresa;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaServices empresaServices;

    @GetMapping("/get")
    ResponseEntity<?> getEmpresa() {
        try {
            List<Empresa> response = empresaServices.getAllEmpresas();
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // Guardar un nuevo usuario
    @PostMapping("/post")
    public ResponseEntity<?> guardarEmpresa(@RequestBody Empresa empresa) {
        try {
            Empresa response = empresaServices.saveEmpresa(empresa);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
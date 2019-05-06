package com.example.demo.api.impl;

import com.example.demo.api.RoleAPI;
import com.example.demo.service.RoleService;
import com.example.demo.service.dto.RoleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RoleController implements RoleAPI {

    @Autowired
    RoleService roleService;

    @Override
    public ResponseEntity<RoleDTO> insert(@RequestBody RoleDTO roleDTO){
        RoleDTO dto = roleService.insert(roleDTO);
        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> delete(@PathVariable("id") Integer id){
        Boolean result = roleService.delete(id);
        Map<String, Boolean> resul = new HashMap<>();
        resul.put("Content", result);
        return ResponseEntity.ok(resul);
    }

    @Override
    public ResponseEntity<List<RoleDTO>> getAll(){
        List<RoleDTO> roleDTOS = roleService.getAll();
        return ResponseEntity.ok(roleDTOS);
    }
}

package com.example.drug_store_spring.controller;

import com.example.drug_store_spring.model.entity.Drug;
import com.example.drug_store_spring.model.entity.DrugOfBill;
import com.example.drug_store_spring.model.entity.Prescription;
import com.example.drug_store_spring.model.service.IDrugOfBillService;
import com.example.drug_store_spring.model.service.IDrugService;
import com.example.drug_store_spring.model.service.IPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Controller {
    @Autowired
    IPrescriptionService iPrescriptionService;
    @Autowired
    IDrugOfBillService iDrugOfBillService;

    @Autowired
    IDrugService iDrugService;
    @GetMapping("/prescription")
    public ResponseEntity<List<Prescription>> showPrescriptionList(){
        List<Prescription> list = iPrescriptionService.findAll();
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new  ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/drug")
    public ResponseEntity<List<Drug>> showDrugList() {
        List<Drug> list = iDrugService.findAll();
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/drug-of-bill/{id}")
    public ResponseEntity<List<DrugOfBill>> showDrugOfBillList(@PathVariable("id") int id){
        List<DrugOfBill> list = iDrugOfBillService.findAllDrugOfBill(id);
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);

    }
    @GetMapping("/prescription/{id}")
    public ResponseEntity<Prescription> showPres(@PathVariable("id") int id){
        Prescription prescription = iPrescriptionService.findById(id);
        if (prescription == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(prescription, HttpStatus.OK);
    }
}

package com.kakuba.springsecurity;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {

    List<Quotation> quotations ;

    public QuotationApi() {
        this.quotations = new ArrayList<>();
        quotations.add(new Quotation("Mam chyba ogromny mózg: " +
                "czasem podjęcie decyzji zajmuje mi cały tydzień.","Mark Twain"));
        quotations.add(new Quotation("Kiedy myślę i nic nie wymyślę, " +
                "to sobie myślę, " +
                "po co ja tyle myślałem, żeby nic nie wymyślić. " +
                "Przecież mogłem nic nie myśleć " +
                "i tyle samo bym wymyślił","Ks.Jan Twardowski"));
    }

    @GetMapping("/api")
    public List<Quotation> getQuotation(){
        return quotations;
    }

    @PostMapping("/api")
    public boolean addQuotation(@RequestBody Quotation quotation){
        return quotations.add(quotation);
    }

    @DeleteMapping("/api")
    public void deleteQuotation(@RequestParam int index){
        quotations.remove(index);
    }


}

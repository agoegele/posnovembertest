package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("api/rechnung")
@RestController
public class RechnungController {

    private final RechnungService RechnungService;

    @Autowired
    public RechnungController(RechnungService rechnungService){
        this.rechnungService = rechnungService;
    }

    @PostMapping
    public void addRechnung(@RequestBody Rechnung rechnung){
        rechnungService.addRechnung(rechnung);
    }

    @GetMapping
    public List<Rechnung> getAllRechnungen() {
        return rechnungService.getAllRechnungen();
    }

    @GetMapping(path = "{id}")
    public Optional<Rechnung> getRechnungById(@PathVariable("id") int id) {
        return rechnungService.getRechnungById(id);
    }

    @DeleteMapping(path = "{id}")
    public int deleteRechnung(@PathVariable("id") int id){
        return rechnungService.deleteRechnung(id);
    }

}


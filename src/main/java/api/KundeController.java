package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RequestMapping("api/kunde")
    @RestController
    public class KundeController {

        private final KundeService kundeService;

        @Autowired
        public KundeController(KundeService kundeService){
            this.kundeService = kundeService;
        }

        @PostMapping
        public void addKunde(@RequestBody Kunde kunde){
            kundeService.addKunde(kunde);
        }

        @GetMapping
        public List<Kunde> getAllKunden() {
            return kundeService.getAllKunden();
        }

        @GetMapping(path = "{id}")
        public Optional<Kunde> getKundeById(@PathVariable("id") int id) {
            return kundeService.getKundeById(id);
        }

        @DeleteMapping(path = "{id}")
        public int deleteKunde(@PathVariable("id") int id){
            return kundeService.deleteKunde(id);
        }

    }



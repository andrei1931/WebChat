package Service;

import Model.Utilizator;
import Repository.UtilizatorR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciuUtilizator {
 private final UtilizatorR utilizatorR;
   @Autowired
   public ServiciuUtilizator(UtilizatorR utilizatorR) {
       this.utilizatorR=utilizatorR;
   }
   public Utilizator SalvareUtilizator(Utilizator utilizator){
       return utilizatorR.save(utilizator);
   }

}

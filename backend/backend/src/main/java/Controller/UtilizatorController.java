package Controller;

import Repository.UtilizatorR;
import Service.ServiciuUtilizator;

public class UtilizatorController {
    private ServiciuUtilizator serviciuUtilizator;
   public UtilizatorController(ServiciuUtilizator serviciuUtilizator){
        this.serviciuUtilizator=serviciuUtilizator;
    }
}

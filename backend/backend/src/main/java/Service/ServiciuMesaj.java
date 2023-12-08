package Service;

import Model.Mesaje;
import Repository.MesajR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciuMesaj {
    private final MesajR mesajR;
    @Autowired
    public ServiciuMesaj(MesajR mesajR){
        this.mesajR=mesajR;
    }
    public Mesaje SalvareMesaj(Mesaje mesaj){
       return mesajR.save(mesaj);
    }
}

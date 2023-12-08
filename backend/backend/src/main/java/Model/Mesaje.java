package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
@Entity
@Table(name="Mesaje")
public class Mesaje {
    @Id
    private int ID;
    @Column(columnDefinition = "TEXT")
    private String Mesaj;
    @Column(columnDefinition = "TEXT")
    private String Imagine;
    @ManyToOne
    @JoinColumn(name = "Mesaje_pkey")
    private Utilizator Id_Utilizator;
    public Mesaje(){}
    public Mesaje(int ID,String Mesaj,String Imagine,Utilizator Id_Utilizator){
        this.ID=ID;
        this.Mesaj=Mesaj;
        this.Imagine=Imagine;
        this.Id_Utilizator=Id_Utilizator;

    }
    public int getID(){
        return ID;
    }
   public void setID(int ID){
        this.ID=ID;
   }
   public String getMesaj(){
        return Mesaj;
   }
   public void setMesaj(String Mesaj){
        this.Mesaj=Mesaj;

   }
   public String getImagine(){
        return Imagine;
   }
   public void setImagine(String Imagine){
        this.Imagine=Imagine;
   }
   public Utilizator getId_Utilizator(){
        return Id_Utilizator;
   }
   public void setId_Utilizator(Utilizator Id_Utilizator){
        this.Id_Utilizator=Id_Utilizator;
   }
}

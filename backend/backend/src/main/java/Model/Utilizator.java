package Model;

import jakarta.persistence.*;

@Entity
@Table(name="Utilizator")
public class Utilizator {
  @Id
 @SequenceGenerator(name = "Utilizator_sequence",
 allocationSize = 1)
 @GeneratedValue(generator = "Utilizator_sequence",
 strategy=GenerationType.SEQUENCE)
  private int ID;
  private String Nume;
  private String email;
  private String parola;
  public Utilizator(){}
   public Utilizator(int ID,String Nume, String email,String parola){
    this.ID=ID;
    this.Nume=Nume;
    this.email=email;
    this.parola=parola;
   }
   public int getID(){
    return ID;
   }
   public void setID(int ID){
   this.ID=ID;

   }

 public String getNume() {
  return Nume;
 }
 public  void setNume(String Nume){
   this.Nume=Nume;

 }
 public String getEmail(){
   return email;
 }
 public void setEmail(String email){
   this.email=email;
 }
 public String getParola(){
   return parola;
 }
 public void setParola(String parola){
   this.parola=parola;
 }
}

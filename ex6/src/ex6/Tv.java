
package ex6;

public class Tv 
{
     public boolean liga;
     public int canal;
     public int volume;

     public void ligar()
     {
         this.setLiga(true);
     }
     
     public void desligar()
     {
         this.setLiga(false);
     }
     
     
     public void pcanal()
     {
         if(this.getCanal()<60)
         {
             this.setCanal(this.getCanal()+1);
         }
     }
     
         public void acanal()
     {
         if(this.getCanal()>1)
         {
             this.setCanal(this.getCanal()-1);
         }
     }
         
     public void uvolume()
     {
         if(this.getVolume()<30)
         {
             this.setVolume(this.getVolume()+1);
         }
     }    
     
     public void dvolume()
     {
         if(this.getVolume()>0)
         {
             this.setVolume(this.getVolume()-1);
         }
     }
     
     public void status()
     {
         if(this.isLiga()==true)
         {
            System.out.println("canal:"+this.getCanal());
            System.out.println("volume:"+this.getVolume());
         }
         else
         {
             System.out.println("DESLIGADA!");
         }
     }
     
    public boolean isLiga() {
        return liga;
    }

    public void setLiga(boolean liga) {
        this.liga = liga;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
     
     public Tv()
     {
         this.canal=1;
         this.volume=0;
         this.liga=false;
     }
     
}

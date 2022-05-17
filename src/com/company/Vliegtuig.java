package com.company;

public class Vliegtuig {

Integer gewicht;
Integer lading;
Boolean toestemming;
Integer tegenwind;
Integer aantalPassagiers;
Boolean bagageAfhandeling;
Boolean nederlandsVliegtuig;

public Vliegtuig(Integer tegenwind, Integer lading, Boolean toestemming){
    this.toestemming=toestemming;
    this.tegenwind = tegenwind;
    this.lading = lading;

}

public Boolean kanOpstijgen(Integer tegenwind, Integer lading, Boolean toestemming){

    if (toestemming)
    {

        return tegenwind > 50.0 || lading < 1000.0;

    }
    return false;
}

public Integer prijsVoorGewichtVliegtuig( Integer gewicht){
    int prijs = 0;
    if(gewicht < 1000){
        prijs += 100;
    }
    if(gewicht >= 1000 && gewicht < 5000){
        prijs += 500;
    }
    if(gewicht >=5000){
        prijs+=2500;
    }
    return prijs;
}

public Double prijsVoorVlucht(Integer gewicht, Integer aantalPassagiers, Boolean bagageAfhandeling, Boolean nederlandsVliegtuig){
    double prijs = 0.0;
    if(gewicht < 1000){
        prijs += 100;
    }
   if(gewicht >= 1000 && gewicht < 5000){
        prijs += 500;
    }
   if(gewicht >=5000){
        prijs+=2500;
    }

   if(aantalPassagiers > 2){
       prijs *= 1.5;
   }
   if(bagageAfhandeling){
       prijs += 800;
   }
   if(nederlandsVliegtuig){
       prijs += prijs/100*21;
   }
return prijs;

}

}






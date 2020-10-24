package com.iue.entidad;

import java.util.ArrayList;
import java.util.List;

public class Corporantionsr 
{
    private List<Corporationr> corporationList;
    
    public List<Corporationr> getMedicList() {
        if(corporationList == null) {
        	corporationList = new ArrayList<>();
        }
        return corporationList;
    }
 
    public void setMedicList(List<Corporationr> corporationList) {
        this.corporationList = corporationList;
    }
    
    
}

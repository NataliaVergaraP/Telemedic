package com.iue.entidad;

import java.util.ArrayList;
import java.util.List;

public class Medics 
{
    private List<Medic> medicList;
    
    public List<Medic> getMedicList() {
        if(medicList == null) {
        	medicList = new ArrayList<>();
        }
        return medicList;
    }
 
    public void setMedicList(List<Medic> medicList) {
        this.medicList = medicList;
    }
}

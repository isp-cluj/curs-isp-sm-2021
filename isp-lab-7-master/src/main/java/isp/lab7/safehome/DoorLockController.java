/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab7.safehome;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author mihai.hulea
 */
public class DoorLockController implements ControllerInterface{
    private Map<AccessKey, Tenant> validAccess = new HashMap<AccessKey, Tenant>();
            
    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {   
        //verific daca tenat exista deja
        //daca exista arunc exceptie
        //daca nu exista il adaug
        
        Tenant t = new Tenant(name);
        if(validAccess.values().contains(t)){
            throw new TenatAlreadyAExistsException("Tenant with name "+name+" already exists");
        }else{
           validAccess.put(new AccessKey(pin), t);
        }
    }

    @Override
    public void removeTenant(String name) throws Exception {
        AccessKey k = getKey(validAccess, new Tenant(name));
       // AccessKey k2 = findKey(new Tenant(name));
       
//       AccessKey k3 = validAccess
//        .entrySet()
//        .stream()
//        .filter(entry -> entry.equals(new Tenant(name)))
//        .map(Map.Entry::getKey);
       
        if(k!=null){
            validAccess.remove(k);
        }
    }
    
    private AccessKey findKey(Tenant t){
        Set<AccessKey> list = validAccess.keySet();
        for(AccessKey k: list){
            if(validAccess.containsKey(k)){
                return k;
            }
        }
        return null;
    }

    private <K, V> K getKey(Map<K, V> map, V value) {
        for (Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
    
}

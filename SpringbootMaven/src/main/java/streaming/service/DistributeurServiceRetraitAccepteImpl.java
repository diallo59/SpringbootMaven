/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */                                           //Implement Interface
@Service
public class DistributeurServiceRetraitAccepteImpl implements DistributeurServiceInterface{

    @Override
    public boolean retrait(long idCompte, short code, long montant) {
        
        return true;
    }
    
}
